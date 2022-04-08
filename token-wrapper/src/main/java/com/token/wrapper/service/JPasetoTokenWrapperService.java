package com.token.wrapper.service;

import com.token.wrapper.bo.TokenWrapperBO;

/**
 * Service Interface for Token Wrappers
 * @author NIC
 *
 */
public interface JPasetoTokenWrapperService{

	
	public void executePaseto();

	public void initJPaseto(String audience, String issuer, String claimid);

	public void initJPaseto(TokenWrapperBO bo);
	
}
