package com.token.wrapper;

import com.token.wrapper.bo.TokenWrapperBO;

/**
 * Interface for Token Wrappers
 * @author NIC
 *
 */
public interface TokenWrapper {

	
	public abstract void executePaseto();

	public abstract void initJPaseto(String audience, String issuer, String claimid);

	void initJPaseto(TokenWrapperBO bo);
	
}
