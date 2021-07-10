package com.william.app.ws.service;

import com.william.app.ws.shared.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDTO createUser(UserDTO user);
    UserDTO getUser(String email);
    UserDTO getUserByUserId(String userId);
    UserDTO updateUser(String userId, UserDTO user);
    void deleteUser(String userId);
    List<UserDTO> getUsers(int page, int limit);
}
