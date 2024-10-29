package com.foodapp.springfoodapp.usersecurity.service;


import com.foodapp.springfoodapp.exception.UserException;
import com.foodapp.springfoodapp.usersecurity.modual.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findUserByEmail(String userName)throws  UserException;
    User findUserProfileByJwt(String jwt) throws UserException;
}
