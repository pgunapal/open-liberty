/*******************************************************************************
 * Copyright (c) 2017, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.rest.client.fat;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.runner.RunWith;

import com.ibm.websphere.simplicity.ShrinkHelper;
import com.ibm.websphere.simplicity.ShrinkHelper.DeployOptions;

import componenttest.annotation.Server;
import componenttest.annotation.TestServlet;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.rules.repeater.JakartaEE10Action;
import componenttest.rules.repeater.JakartaEE9Action;
import componenttest.rules.repeater.MicroProfileActions;
import componenttest.rules.repeater.RepeatTests;
import componenttest.topology.impl.LibertyServer;
import componenttest.topology.utils.FATServletClient;
import mpRestClient10.basic.BasicClientTestServlet;

@RunWith(FATRunner.class)
public class BasicTest extends FATServletClient {

    final static String SERVER_NAME = "mpRestClient10.basic";

    @ClassRule
    public static RepeatTests r = MicroProfileActions.repeat(SERVER_NAME, 
                                                             MicroProfileActions.MP13, //mpRestClient-1.0
                                                             MicroProfileActions.MP20, // 1.1
                                                             MicroProfileActions.MP22, // 1.2
                                                             MicroProfileActions.MP30, // 1.3
                                                             MicroProfileActions.MP33, // 1.4
                                                             MicroProfileActions.MP40, // 2.0
                                                             MicroProfileActions.MP50, // 3.0
                                                             MicroProfileActions.MP60);// 3.0+EE10

    private static final String appName = "basicClientApp";

    /*
     * We need two servers to clearly distinguish that the "client" server
     * only has the client features enabled - it includes mpRestClient-1.0
     * which includes the jaxrsClient-2.0 feature, but not the jaxrs-2.0
     * feature that contains server code. The client should be able to
     * work on its own - by splitting out the "server" server into it's
     * own server, we can verify this.
     */
    @Server(SERVER_NAME)
    @TestServlet(servlet = BasicClientTestServlet.class, contextRoot = appName)
    public static LibertyServer server;

    @Server("mpRestClient10.remoteServer")
    public static LibertyServer remoteAppServer;

    @BeforeClass
    public static void setUp() throws Exception {
        ShrinkHelper.defaultDropinApp(remoteAppServer, "basicRemoteApp", new DeployOptions[] {DeployOptions.OVERWRITE}, "remoteApp.basic");
        if (JakartaEE9Action.isActive() | JakartaEE10Action.isActive()) {
            remoteAppServer.changeFeatures(Arrays.asList("componenttest-2.0", "restfulWS-3.0", "ssl-1.0", "jsonb-2.0"));
        }
        remoteAppServer.startServer();
        remoteAppServer.waitForStringInLog("CWWKO0219I.*ssl"); // CWWKO0219I: TCP Channel defaultHttpEndpoint-ssl has been started and is now listening for requests on host *  (IPv6) port 8040.

        ShrinkHelper.defaultDropinApp(server, appName, "mpRestClient10.basic");
        if (JakartaEE9Action.isActive()) {
            server.changeFeatures(Arrays.asList("componenttest-2.0", "mpRestClient-3.0", "ssl-1.0", "jsonb-2.0"));
        } else if (JakartaEE10Action.isActive()) {
            server.changeFeatures(Arrays.asList("componenttest-2.0", "mpRestClient-3.0", "ssl-1.0", "jsonb-3.0", "servlet-6.0"));
        }
        server.startServer();
        server.waitForStringInLog("CWWKO0219I.*ssl"); // CWWKO0219I: TCP Channel defaultHttpEndpoint-ssl has been started and is now listening for requests on host *  (IPv6) port 8020.

    }

    @AfterClass
    public static void afterClass() throws Exception {
        server.stopServer("CWWKE1102W");  //ignore server quiesce timeouts due to slow test machines
        remoteAppServer.stopServer("CWWKE1102W", "CWWKO0801E");
    }
}