package com.soccer.security.utils;

public class SecurityConstants {

	public static final String SECRET = "SecretKeyToGenJWTs";
	public static final long EXPIRATION_TIME = 4 * 60 * 60 * 1000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users/sign-up";
  public static final String REGISTRATION_URL = "/api/auth/register";
  public static final String LOGIN_URL = "/api/auth/login";
  public static final String CITIES_URL = "/api/cities/**";

	private SecurityConstants() {

	}

}
