package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
	private static final Logger logger = Logger.getLogger( Hello.class.getName() );
	
	public static void main(String[] args) {
		logger.log(Level.SEVERE, "Hello, world.");
	}
	
}
