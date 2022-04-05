package com.nic.token.wrapper;

import com.okta.createverifytokens.JWTDemo;

import io.jsonwebtoken.Claims;

/**
 * Wrapper class to create and decode JWT 
 */

public class JWTWrapper {
	
	JWTWrapperBO bo = new JWTWrapperBO();
	
	public JWTWrapper(JWTWrapperBO bo) {
		this.bo = bo;
	}
	
	public void executeJWT() {
		/*create token using jwt*/
    	String jwtClaims = createJWT(bo);
    
    	//Create jwt token
	    /*String jwtClaims = jwtw .createJWT(jwtId, // claim = jti
                jwtIssuer, // claim = iss
                jwtSubject, // claim = sub
                jwtTimeToLive);
	    */
    	
    	//Decode token
    	Claims claims = decodeJWT(jwtClaims);
    	
    	System.out.println("Claims :: " + claims.toString());
	    System.out.println("Id :: " + claims.getId());
	    System.out.println("Subject :: " + claims.getSubject());
	    System.out.println("Issuer :: " + claims.getIssuer());
	    System.out.println("Time to live :: " + claims.getIssuedAt());
	}
	
	private String createJWT(JWTWrapperBO bo) {
		return JWTDemo.createJWT(bo.getJwtId(), bo.getJwtIssuer(), bo.getJwtSubject(), bo.getJwtTimeToLive());
	}
	
	@SuppressWarnings("unused")
	private String createJWT(String jwtId, String jwtIssuer, String jwtSubject, long jwtTimeToLive) {
		return JWTDemo.createJWT(jwtId, // claim = jti
                jwtIssuer, // claim = iss
                jwtSubject, // claim = sub
                jwtTimeToLive);
	}
	
	private Claims decodeJWT(String jwt) {
		 return JWTDemo.decodeJWT(jwt);
	}
}
