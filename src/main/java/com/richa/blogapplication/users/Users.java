package com.richa.blogapplication.users;

import com.richa.blogapplication.commons.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder //helps to create builder for the entity
@ToString
public class Users extends BaseEntity {

   //     @NonNull
 //       @Column(name="user_name", nullable = false, unique =true, length =40)
        String username;

 //       @NonNull
 //       @Column(nullable = false, unique =true, length =100)
        String email;
        String password;
        String authToken;
        String bio;
        String imageURL;

}
