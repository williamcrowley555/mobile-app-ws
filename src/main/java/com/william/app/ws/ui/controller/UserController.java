package com.william.app.ws.ui.controller;

import com.william.app.ws.service.UserService;
import com.william.app.ws.shared.dto.UserDTO;
import com.william.app.ws.ui.model.request.UserDetailsRequestModel;
import com.william.app.ws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createdUser = userService.createUser(userDTO);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }
}
