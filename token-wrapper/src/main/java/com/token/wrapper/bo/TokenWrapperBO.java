package com.token.wrapper.bo;

import java.time.LocalDateTime;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * BO for Token wrapper classes
 * 
 * @author NIC
 *
 */
public class TokenWrapperBO {

	// Pasteo inputs
	private String audience;
	private String issuer;
	private String claimid;

	// jason web token input as payload
	private LocalDateTime ldt;
	private JSONObject payload;

	// jason web token inputs for payload
	private String subject;
	private JSONArray audiences;
	private long expires;

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getClaimid() {
		return claimid;
	}

	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}

	public LocalDateTime getLdt() {
		return ldt;
	}

	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}

	public JSONObject getPayload() {
		return payload;
	}

	public void setPayload(JSONObject payload) {
		this.payload = payload;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public JSONArray getAudiences() {
		return audiences;
	}

	public void setAudiences(JSONArray audiences) {
		this.audiences = audiences;
	}

	public long getExpires() {
		return expires;
	}

	public void setExpires(long expires) {
		this.expires = expires;
	}

	public TokenWrapperBO(String audience, String issuer, String claimid, LocalDateTime ldt, JSONObject payload,
			String subject, JSONArray audiences, long expires) {
		super();
		this.audience = audience;
		this.issuer = issuer;
		this.claimid = claimid;

		this.ldt = ldt;
		this.payload = payload;

		this.subject = subject;
		this.audiences = audiences;
		this.expires = expires;
	}

	public TokenWrapperBO(String audience, String issuer, String claimid) {
		super();
		this.audience = audience;
		this.issuer = issuer;
		this.claimid = claimid;
	}

	public TokenWrapperBO(LocalDateTime ldt, JSONObject payload, String subject, JSONArray audiences, long expires) {
		super();

		this.ldt = ldt;
		this.payload = payload;

		this.subject = subject;
		this.audiences = audiences;
		this.expires = expires;
	}

	public TokenWrapperBO(LocalDateTime ldt, JSONObject payload) {
		super();

		this.ldt = ldt;
		this.payload = payload;
	}

	public TokenWrapperBO(String subject, JSONArray audiences, long expires) {
		super();

		this.subject = subject;
		this.audiences = audiences;
		this.expires = expires;
	}

	public TokenWrapperBO() {
	}

	@Override
	public String toString() {
		return "TokenWrapperBO [audience=" + audience + ", issuer=" + issuer + ", claimid=" + claimid + "]";
	}

}
