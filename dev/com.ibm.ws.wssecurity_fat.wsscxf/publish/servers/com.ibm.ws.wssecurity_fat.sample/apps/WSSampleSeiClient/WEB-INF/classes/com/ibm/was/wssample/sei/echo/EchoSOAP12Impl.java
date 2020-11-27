package com.ibm.was.wssample.sei.echo;


@javax.jws.WebService (endpointInterface="com.ibm.was.wssample.sei.echo.EchoService12PortType", targetNamespace="http://com/ibm/was/wssample/sei/echo/", serviceName="EchoService12", portName="EchoService12Port", wsdlLocation="WEB-INF/wsdl/Echo12.wsdl")
@javax.xml.ws.BindingType (value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class EchoSOAP12Impl{

    public EchoStringResponse echoOperation(EchoStringInput parameter) {
		String inputString = "Failed";
		if (parameter != null) {
			try {
				inputString = parameter.getEchoInput();
				System.out.println(">> SERVICE: SOAP12 Echo Input String '"+inputString+"'");				
			} catch (Exception e) {
				System.out.println(">> SERVICE: SOAP12 Echo ERROR Exception "+e.getMessage());
				e.printStackTrace();
			}
		} else {
			System.out.println(">> SERVICE: ERROR - SOAP12 Echo Missing Input String");
		}
		EchoStringResponse response = 
			new ObjectFactory().createEchoStringResponse();
		response.setEchoResponse("SOAP12==>>"+inputString);
        return response;
    }
}