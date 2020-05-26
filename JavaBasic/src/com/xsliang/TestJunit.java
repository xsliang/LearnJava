package com.xsliang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {

	String code="Hello World";
	ServiceOfBusiness serviceOfBusiness=new ServiceOfBusiness(code,false);
	@Test
	void testPrintMethods() {
		assertEquals(code, serviceOfBusiness.printServerCode());
		assertEquals(false, serviceOfBusiness.printFlag());
	}

}
