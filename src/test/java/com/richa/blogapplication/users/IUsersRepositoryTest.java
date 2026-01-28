/*
package com.richa.blogapplication.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest  //this test is only for repository
public class IUsersRepositoryTest {

    @Autowired
    private IUsersRepository iUsersRepository;

    @Test
    public void createUser(){

        Users u = new Users("Richa", "richa123@gamil.com",
                "password", "authToken", "bio",
                "url");
        Users u2 = new Users("Richa2", "richa1234@gamil.com",
                "password2", "authToken2", "bio2",
                "url2");
        System.out.println("Trying to save the user in DB....");
        Users uu = iUsersRepository.save(u);
        System.out.println("Saved the user in my DB with ID : " + uu.getId());
        System.out.println("Trying to save the user in DB....");
        Users uu2 = iUsersRepository.save(u2);
        System.out.println("Saved the user in my DB with ID : " + uu2.getId());

        //Optional<Users> existingUser = iUsersRepository.findById(uu.getId());
        //System.out.println("Returning the existing user with ID: " + existingUser.get().getId());
    }
}
*/