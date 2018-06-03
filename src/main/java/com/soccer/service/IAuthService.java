package com.soccer.service;

import com.soccer.domain.Player;
import com.soccer.dto.UserDto;
import com.soccer.service.Exception.BadCredentials;
import com.soccer.service.Exception.NotFoundException;

public interface IAuthService {

  Player login(UserDto user) throws NotFoundException, BadCredentials ;

}
