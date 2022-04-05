package com.nic.token.wrapper;


public class JWTWrapperBO {

	private String tokenType;
	private String jwtId ;
    private String jwtIssuer ;
    private String jwtSubject ;
    private int jwtTimeToLive ;
    
	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getJwtId() {
		return jwtId;
	}

	public void setJwtId(String jwtId) {
		this.jwtId = jwtId;
	}

	public String getJwtIssuer() {
		return jwtIssuer;
	}

	public void setJwtIssuer(String jwtIssuer) {
		this.jwtIssuer = jwtIssuer;
	}

	public String getJwtSubject() {
		return jwtSubject;
	}

	public void setJwtSubject(String jwtSubject) {
		this.jwtSubject = jwtSubject;
	}

	public int getJwtTimeToLive() {
		return jwtTimeToLive;
	}

	public void setJwtTimeToLive(int jwtTimeToLive) {
		this.jwtTimeToLive = jwtTimeToLive;
	}

	public JWTWrapperBO() {
	}

	public JWTWrapperBO(String tokenType, String jwtId, String jwtIssuer, String jwtSubject, int jwtTimeToLive) {
		super();
		this.tokenType = tokenType;
		this.jwtId = jwtId;
		this.jwtIssuer = jwtIssuer;
		this.jwtSubject = jwtSubject;
		this.jwtTimeToLive = jwtTimeToLive;
	}

}
