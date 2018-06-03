package com.soccer.configuration;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig  {
//  public class SecurityConfig extends WebSecurityConfigurerAdapter {

//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.cors()
//      .and()
//      .csrf().disable()
//      .sessionManagement()
//      .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//      .and()
//      .authorizeRequests()
//      .antMatchers(HttpMethod.POST, LOGIN_URL, REGISTRATION_URL, CITIES_URL)
//      .permitAll()
//      .antMatchers(HttpMethod.OPTIONS)
//      .permitAll()
//      .anyRequest()
//      .authenticated()
//      .and()
//      .addFilter(jwtAuthenticationFilter())
//      .addFilter(new JwtAuthorizationFilter(authenticationManager()));
//  }
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//    auth.userDetailsService(userDetailsServiceBean())
//      .passwordEncoder(passwordEncoder());
//
//  }
//
//  @Override
//  public UserDetailsService userDetailsServiceBean() throws Exception {
//    return new UserDetailsServiceImpl(playerService());
//  }
//
//  @Bean
//  public JwtAuthenticationFilter jwtAuthenticationFilter() throws Exception {
//    final JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
//    filter.setAuthenticationManager(authenticationManager());
//    filter.setFilterProcessesUrl(LOGIN_URL);
//    return filter;
//  }
//
//  @Bean
//  public IPlayerService playerService() {
//    return new PlayerService();
//  }
//
//  @Bean
//  public CorsConfigurationSource corsConfigurationSource() {
//    CorsConfiguration configuration = new CorsConfiguration();
//    configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//    configuration.setAllowedHeaders(Arrays.asList("authorization", "content-type", "x-auth-token"));
//    configuration.setExposedHeaders(Arrays.asList("x-auth-token"));
//    configuration.setAllowCredentials(true);
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    source.registerCorsConfiguration("/**", configuration);
//    return source;
//  }
//
//  @Bean
//  public BCryptPasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
}
