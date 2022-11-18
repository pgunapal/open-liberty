/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package test.wssecfvt.wss11enc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-02-04T22:39:30.752-06:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "WSS11EncService2", 
                  wsdlLocation = "file:/C:/Liberty/com.ibm.ws.wssecurity_fat/test-applications/wss11enc/resources/WEB-INF/WSS11Encryption.wsdl",
                  targetNamespace = "http://wss11enc.wssecfvt.test") 
public class WSS11EncService2 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wss11enc.wssecfvt.test", "WSS11EncService2");
    public final static QName WSS11Enc2 = new QName("http://wss11enc.wssecfvt.test", "WSS11Enc2");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Liberty/com.ibm.ws.wssecurity_fat/test-applications/wss11enc/resources/WEB-INF/WSS11Encryption.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSS11EncService2.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Liberty/com.ibm.ws.wssecurity_fat/test-applications/wss11enc/resources/WEB-INF/WSS11Encryption.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSS11EncService2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSS11EncService2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSS11EncService2() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns WSS11Enc
     */
    @WebEndpoint(name = "WSS11Enc2")
    public WSS11Enc getWSS11Enc2() {
        return super.getPort(WSS11Enc2, WSS11Enc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSS11Enc
     */
    @WebEndpoint(name = "WSS11Enc2")
    public WSS11Enc getWSS11Enc2(WebServiceFeature... features) {
        return super.getPort(WSS11Enc2, WSS11Enc.class, features);
    }

}