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

package test.wssecfvt.endsuptokens;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-02-15T08:47:39.449-06:00
 * Generated source version: 2.6.2
 *
 */
@WebService(targetNamespace = "http://endsuptokens.wssecfvt.test", name = "EndSupTokensPortType")
@XmlSeeAlso({ test.wssecfvt.endsuptokens.types.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EndSupTokensPortType {

    @WebResult(name = "getVerResponse", targetNamespace = "http://endsuptokens.wssecfvt.test/types", partName = "out")
    @WebMethod
    public test.wssecfvt.endsuptokens.types.GetVerResponse invoke(
                                                                  @WebParam(partName = "in", name = "getVer",
                                                                            targetNamespace = "http://endsuptokens.wssecfvt.test/types") test.wssecfvt.endsuptokens.types.GetVer in);
}
