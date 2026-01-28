package com.richa.blogapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUsersRepository usersRepo;  // Injected the IUserRepository
    private PasswordEncoder passwordEncoder;

    public UserService(@Autowired IUsersRepository usersRepo,
                       @Autowired PasswordEncoder passwordEncoder){
        this.usersRepo= usersRepo;
        this.passwordEncoder =passwordEncoder;
    }

    public Users createUser(String userName, String pwd, String email){
        //TO-DO: Add validations, if user already exists with that email and username, then throw exception
        String hashedPwd = passwordEncoder.encode(pwd);

        Users user = Users.builder()
                .userName(userName)
                .password(hashedPwd)
                .email(email)
                .build();

        Users createdUser =usersRepo.save(user);
        return createdUser;
    }
    public List<Users> getAllUsers(){
        //To-Do: Handle edge cases and throw exception
        return (List<Users>) usersRepo.findAll();

    }
    public Users loginUser(String uName, String password){
        var savedUser= usersRepo.findByUserName(uName);
        if(savedUser !=null){
            //check for password matching
            if(passwordEncoder.matches(password, savedUser.getPassword())){
                return savedUser;
            }
            throw new IllegalArgumentException("Wrong credentials...");
        }
        throw new IllegalArgumentException("User doesnt exists");
    }
}
