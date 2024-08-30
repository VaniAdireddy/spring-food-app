package com.foodapp.springfoodapp.security.service;

import com.foodapp.springfoodapp.exception.UserException;
import com.foodapp.springfoodapp.security.Modual.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findUserProfileByJwt(String jwt) throws UserException;

    User findUserByEmail(String username) throws UserException;
}
