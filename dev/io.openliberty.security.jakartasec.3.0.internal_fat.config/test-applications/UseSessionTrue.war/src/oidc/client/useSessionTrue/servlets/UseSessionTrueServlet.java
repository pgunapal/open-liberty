/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package oidc.client.useSessionTrue.servlets;

import java.io.IOException;

import jakarta.annotation.security.DeclareRoles;
import jakarta.security.enterprise.authentication.mechanism.http.OpenIdAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.openid.ClaimsDefinition;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.HttpConstraint;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import oidc.client.base.servlets.SimpleServlet;

@WebServlet("/UseSessionTrueServlet")
@OpenIdAuthenticationMechanismDefinition(
                                         providerURI = "${providerBean.providerSecureRoot}/oidc/endpoint/OP1",
                                         clientId = "client_1",
                                         clientSecret = "mySharedKeyNowHasToBeLongerStrongerAndMoreSecureAndForHS512EvenLongerToBeStronger",
                                         claimsDefinition = @ClaimsDefinition(callerNameClaim = "sub"),
                                         redirectURI = "${baseURL}/Callback",
                                         useSession = true,
                                         useSessionExpression = "#{openIdConfig.useSessionExpression}")
@DeclareRoles("all")
@ServletSecurity(@HttpConstraint(rolesAllowed = "all"))
public class UseSessionTrueServlet extends SimpleServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void recordHelloWorld(ServletOutputStream output) throws IOException {

        super.recordHelloWorld(output);
        System.out.println("Hello world from UseSessionTrueServlet");
        output.println("Hello world from UseSessionTrueServlet!");

    }
}