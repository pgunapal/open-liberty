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

package test.libertyfat.x509mig.contract;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-12-19T14:55:09.172-06:00
 * Generated source version: 2.6.2
 *
 */
@WebServiceClient(name = "FatBAX14Service",
                  wsdlLocation = "x509migtoken.wsdl",
                  targetNamespace = "http://x509mig.libertyfat.test/contract")
public class FatBAX14Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://x509mig.libertyfat.test/contract", "FatBAX14Service");
    public final static QName UrnX509Token14 = new QName("http://x509mig.libertyfat.test/contract", "UrnX509Token14");
    static {
        URL url = FatBAX14Service.class.getResource("x509migtoken.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(FatBAX14Service.class.getName()).log(java.util.logging.Level.INFO,
                                                                                    "Can not initialize the default wsdl from {0}", "x509migtoken.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FatBAX14Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FatBAX14Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FatBAX14Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *         returns FVTVersionBAX
     */
    @WebEndpoint(name = "UrnX509Token14")
    public FVTVersionBAX getUrnX509Token14() {
        return super.getPort(UrnX509Token14, FVTVersionBAX.class);
    }

    /**
     *
     * @param features
     *                     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their
     *                     default values.
     * @return
     *         returns FVTVersionBAX
     */
    @WebEndpoint(name = "UrnX509Token14")
    public FVTVersionBAX getUrnX509Token14(WebServiceFeature... features) {
        return super.getPort(UrnX509Token14, FVTVersionBAX.class, features);
    }

}
