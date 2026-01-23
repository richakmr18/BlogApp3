package com.richa.blogapplication.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUsersRepository usersRepo;  // Injected the IUserRepository

    public UserService(IUsersRepository usersRepo){
        this.usersRepo= usersRepo;
    }

    public Users createUser(String userName, String pwd, String email){
        //TO-DO: Add validations, if user already exists with that email and username, then throw exception


        Users user = Users.builder()
                .username(userName)
                .password(pwd)
                .email(email)
                .build();

        Users createdUser =usersRepo.save(user);
        return createdUser;
    }
    //public List<Users> getAllUsers(){
        //To-Do: Handle edge cases and throw exception
    //    return (List<Users>) usersRepo.findAll();

    //}


}
