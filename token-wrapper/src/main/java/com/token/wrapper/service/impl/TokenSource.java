package com.token.wrapper.service.impl;

import com.token.wrapper.service.JJWTWrapperService;
import com.token.wrapper.service.JPasetoTokenWrapperService;
import com.token.wrapper.service.JasonWebTokenWrapperService;

/**
 * Get source details of Tokens such as jwt, paseto etc
 * 
 * @author NIC
 *
 */
public class TokenSource {

	private String name;	
	private JPasetoTokenWrapperService jpasetoService;	
	private JJWTWrapperService jjwtService;	
	private JasonWebTokenWrapperService jwtService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TokenSource(String name) {
		super();
		this.name = name;
	}

	public JPasetoTokenWrapperService getJpasetoService() {
		return jpasetoService;
	}

	public void setJpasetoService(JPasetoTokenWrapperService jpasetoService) {
		this.jpasetoService = jpasetoService;
	}

	public JJWTWrapperService getJjwtService() {
		return jjwtService;
	}

	public void setJjwtService(JJWTWrapperService jjwtService) {
		this.jjwtService = jjwtService;
	}

	public JasonWebTokenWrapperService getJwtService() {
		return jwtService;
	}

	public void setJwtService(JasonWebTokenWrapperService jwtService) {
		this.jwtService = jwtService;
	}
	
	
}
