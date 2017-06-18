package org.example.messageUtil;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * This class file sets the message variable in the MessageUtil class to Robert. 
 * It then tests to see if the message variable was successfully set by checking whether the strings 
 * Robert and Hi!Robert appear in the output.
 */

public class TestMessageUtil {

	String message = "Anuj";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Anuj";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
