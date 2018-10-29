package com.stackroute.fullstackassignment.services;

import com.stackroute.fullstackassignment.domain.Users;

import java.util.List;

public interface UserService {
    public Users addUser(Users user);
//    public Users deleteUserById(String name);
    public Users updateUser(Users user) ;
    public Users searchUserById(Long id);

}
