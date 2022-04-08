package com.token.wrapper.service.impl;

import com.token.wrapper.bo.TokenWrapperBO;
import com.token.wrapper.service.TokenWrapperService;

/**
 * Wrapper class for tokens
 * 
 * @author NIC
 *
 */
public class TokenWrapperServiceImpl implements TokenWrapperService {

	TokenSource source;
	TokenWrapperBO bo;

	public TokenWrapperServiceImpl(TokenSource source, TokenWrapperBO bo) {
		super();
		this.source = source;
		this.bo = bo;
	}

	@Override
	public void executePaseto() {
		source.getJpasetoService().executePaseto();
	}

	@Override
	public void executeJWT() {
		source.getJwtService().isValid();
	}

}
