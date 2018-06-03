package com.soccer.security;

public class JwtAuthenticationFilter {
//  public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
//			throws AuthenticationException {
//		try {
//			if (req.getMethod().equalsIgnoreCase("OPTIONS"))
//				return null;
//
//			UserDto creds = new ObjectMapper().readValue(req.getInputStream(), UserDto.class);
//
//			return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(creds.getUsername(),
//					creds.getPassword(), Collections.emptyList()));
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	@Override
//	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
//			Authentication auth) throws IOException, ServletException {
//
//		final Claims claims = Jwts.claims().setSubject(((User) auth.getPrincipal()).getUsername());
//		if (((User) auth.getPrincipal()).getAuthorities() != null
//				&& !((User) auth.getPrincipal()).getAuthorities().isEmpty()) {
//			claims.put("role",
//					((User) auth.getPrincipal()).getAuthorities().iterator().next().getAuthority().toUpperCase());
//		}
//		String token = Jwts.builder().setClaims(claims)
//				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
//				.signWith(SignatureAlgorithm.HS512, SECRET.getBytes()).compact();
//		res.getWriter().write(token);
//		res.getWriter().flush();
//		res.getWriter().close();
//		res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
//	}

}
