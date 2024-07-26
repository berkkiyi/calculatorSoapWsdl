package com.wcf.calculator;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.wcf.wsdl.Add;
import com.wcf.wsdl.AddResponse;
import com.wcf.wsdl.Subtract;
import com.wcf.wsdl.SubtractResponse;

public class CalculatorClient  extends WebServiceGatewaySupport{
	
	public AddResponse add(int number1, int number2) {
		Add  request = new Add();
		request.setIntA(number1);
		request.setIntB(number2);
		AddResponse response =(AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						  request,
						  new SoapActionCallback("http://tempuri.org/Add")
							);		
		return response;
	}
	public int Somme( int a ,int b) {
		return add(a,b).getAddResult();
	}
	
	public SubtractResponse substract(int a,int b) {
		Subtract  request = new Subtract();
		request.setIntA(a);
		request.setIntB(b);
		
		SubtractResponse response = (SubtractResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						  request,
						  new SoapActionCallback("http://tempuri.org/Subtract")
							);	
		return response;
	}
	public int substractNumber(int a ,int b) {
		return substract(a,b).getSubtractResult();
	}

}
