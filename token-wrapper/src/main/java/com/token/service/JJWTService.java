package com.token.service;

import io.jsonwebtoken.Claims;

public interface JJWTService {

	String createJWT(String id, String issuer, String subject, long ttlMillis);

	Claims decodeJWT(String jwt);

}
