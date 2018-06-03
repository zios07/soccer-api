package com.soccer.security.utils;

public class UserDetailsServiceImpl {
//  public class UserDetailsServiceImpl implements UserDetailsService {
//
//  private IPlayerService playerService;
//
//  public UserDetailsServiceImpl(IPlayerService playerService) {
//    this.playerService = playerService;
//  }
//
//  @Override
//  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    Player player = null;
//    try {
//      player = playerService.findByUsername(username);
//    } catch (NotFoundException e) {
//      e.printStackTrace();
//    }
//
//    return new org.springframework.security.core.userdetails.User(username, player.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_PLAYER")));
//
//  }
}
