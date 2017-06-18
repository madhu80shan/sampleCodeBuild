package org.example.messageUtil;

/* Details - 
 * This class file creates as output the string of characters passed into it. 
 * The MessageUtil constructor sets the string of characters. 
 * The printMessage method creates the output. 
 * The salutationMessage method outputs Hi! followed by the string of characters.
 */

public class MessageUtil {

	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}

	public String printMessage() {
		System.out.println(message);
		return message;
	}

	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
