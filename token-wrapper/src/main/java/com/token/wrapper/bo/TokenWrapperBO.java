package com.token.wrapper.bo;

/**
 * BO for Token wrapper classes
 * @author NIC
 *
 */
public class TokenWrapperBO {

	private String audience;
	private String issuer;
	private String claimid;

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

	public TokenWrapperBO(String audience, String issuer, String claimid) {
		super();
		this.audience = audience;
		this.issuer = issuer;
		this.claimid = claimid;
	}

	public TokenWrapperBO() {
	}

	@Override
	public String toString() {
		return "TokenWrapperBO [audience=" + audience + ", issuer=" + issuer + ", claimid=" + claimid + "]";
	}

}
