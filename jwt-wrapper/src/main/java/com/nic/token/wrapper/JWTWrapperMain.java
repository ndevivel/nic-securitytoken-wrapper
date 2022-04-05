package com.nic.token.wrapper;

public class JWTWrapperMain {

	public JWTWrapperMain() {
	}

	public static void main(String[] args) {
		System.out.println("Welcome JWT");
		
		String tokenType = "jwt";
		tokenType = args[0];
		tokenType= "paseto";
		System.out.println("Token type :: " + tokenType);
				
		String jwtId = "SOMEID1234";
	    String jwtIssuer = "JWT Demo";
	    String jwtSubject = "Andrew";
	    int jwtTimeToLive = 800000;
			   
	    jwtId = args[1];
	    jwtIssuer = args[2];
	    jwtSubject = args[3];
	    jwtTimeToLive = Integer.parseInt(args[4]);
	    
	    JWTWrapperBO bo  = new JWTWrapperBO("", jwtId, jwtIssuer, jwtSubject,jwtTimeToLive);
	    JWTWrapper jwtw = new JWTWrapper(bo);
	    
	    switch(tokenType) {
	    case "jwt":
	    	System.out.println("Create token using " + tokenType );
	    	jwtw.executeJWT();
		    break;
		    
	    case "paseto":
	    	System.out.println("Create token using " + tokenType );
	    	JPasetoExample.executePaseto();
	    	break;
	    	
	    default :
	    	System.out.println("No token found");
	    }
	}
}
