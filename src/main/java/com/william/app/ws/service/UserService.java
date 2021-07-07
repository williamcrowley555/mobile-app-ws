package com.william.app.ws.service;

import com.william.app.ws.shared.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDTO createUser(UserDTO user);
    UserDTO getUser(String email);
    UserDTO getUserByUserId(String userId);
}
