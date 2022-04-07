package com.token.wrapper.impl;

import java.security.KeyPair;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import javax.crypto.SecretKey;

import com.token.wrapper.bo.TokenWrapperBO;
import com.token.wrapper.exceptions.TokenWrapperException;

import dev.paseto.jpaseto.Paseto;
import dev.paseto.jpaseto.PasetoParser;
import dev.paseto.jpaseto.Pasetos;
import dev.paseto.jpaseto.Version;
import dev.paseto.jpaseto.lang.Keys;

/**
 * Wrapper for JPaseto
 * 
 * @author NIC
 *
 */
public class JPasetoTokenWrapperImpl implements com.token.wrapper.TokenWrapper {

	private static final SecretKey SHARED_SECRET = Keys.secretKey();
	private static final KeyPair KEY_PAIR = Keys.keyPairFor(Version.V1);

	private String audience;
	private String issuer;
	private String claimid;

	@Override
	public void executePaseto() {

		try {
			String tokenString = createToken();
			log("Paseto token: " + tokenString);
			System.out.println("Paseto token: " + tokenString);

			Paseto result = parseToken(tokenString);
			log("Token Claims:");
			System.out.println("Token Claims:");

			result.getClaims().forEach((key, value) -> log("    " + key + ": " + value));

			String audience = result.getClaims().getAudience();
			log("Audience: " + audience);
			System.out.println("Audience: " + audience);

			int rolledValue = result.getClaims().get(claimid, Integer.class);
			log("1d20 rolled: " + rolledValue);
			System.out.println("1d20 rolled: " + rolledValue);

			Paseto resultWithRequirements = parseTokenWithRequirements(tokenString);
			// TODO logs
			System.out.println("Token Claims with Requirement:" + resultWithRequirements);
			// TODO logs
			System.out.println("Paseto token parsed successfully..");
		} catch (TokenWrapperException e) {
			System.out.println(">>>>>>>>>>Exception occured during the execution of Paseto Token Wrapper process");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>Exception occured during the execution of Paseto Token process");
			e.printStackTrace();
		}
	}

	private String createToken() throws Exception{
		Instant now = Instant.now();

		String token = Pasetos.V1.LOCAL.builder().setSharedSecret(SHARED_SECRET).setIssuedAt(now)
				.setExpiration(now.plus(1, ChronoUnit.HOURS)).setAudience(audience).setIssuer(issuer)
				.claim(claimid, new Random().nextInt(20) + 1).compact();

		// TODO logs
		System.out.println(">>>>>>>>>>>>>>Token Created....." + token);
		return token;
	}

	private Paseto parseToken(String token) throws Exception{
		PasetoParser parser = Pasetos.parserBuilder().setSharedSecret(SHARED_SECRET).setPublicKey(KEY_PAIR.getPublic())
				.build();

		Paseto result = parser.parse(token);
		// TODO logs
		System.out.println(">>>>>>>>>>>>>>>>Token parsed........" + result);
		return result;
	}

	private Paseto parseTokenWithRequirements(String token) throws Exception{
		PasetoParser parser = Pasetos.parserBuilder().setSharedSecret(SHARED_SECRET).setPublicKey(KEY_PAIR.getPublic())
				.requireAudience(audience).requireIssuer(issuer).build();

		Paseto result = parser.parse(token);
		// TODO logs
		System.out.println(">>>>>>>>>>>>>>>>Token parsed with requirements........" + result);
		return result;
	}

	private void log(String message) {
		System.out.println(message);
	}

	@Override
	public void initJPaseto(TokenWrapperBO bo) {
		if (bo != null) {
			this.audience = bo.getAudience();
			this.issuer = bo.getIssuer();
			this.claimid = bo.getClaimid();
		}
	}

	@Override
	public void initJPaseto(String audience, String issuer, String claimid) {
		this.audience = audience;
		this.issuer = issuer;
		this.claimid = claimid;

		// TODO logs
		System.out.println(">>>>>>>>>>>>>>Token Initiated for Paseto....");
	}

	public JPasetoTokenWrapperImpl(String audience, String issuer, String claimid) {
		super();
		this.audience = audience;
		this.issuer = issuer;
		this.claimid = claimid;
	}

	public JPasetoTokenWrapperImpl() {
	}


}
