package com.token.wrapper.service.impl;

import java.time.LocalDateTime;

import org.json.JSONArray;
import org.json.JSONObject;

import com.metamug.jwt.JWebToken;
import com.token.wrapper.service.JasonWebTokenWrapperService;

/**
 * Wrapper for Jason Web Token
 * @author NIC
 *
 */
public class JasonWebTokenWrapperServiceImpl implements JasonWebTokenWrapperService{

	LocalDateTime ldt;
    JSONObject payload;
    
    String subject;
    JSONArray audience;
    long expires;
    
    JWebToken incomingToken;
    
    public boolean isValid() {
    	return incomingToken.isValid();
    }
    
}
