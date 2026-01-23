package com.richa.blogapplication.users;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsersRepository extends CrudRepository<Users,Long> {

    List<Users> findAllByBio(String bio);
    Users findByBio(String bio);
    Users findByEmail (String email);

}
