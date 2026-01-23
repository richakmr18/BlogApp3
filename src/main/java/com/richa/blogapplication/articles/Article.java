package com.richa.blogapplication.articles;

import com.richa.blogapplication.commons.BaseEntity;
import com.richa.blogapplication.users.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;
import java.util.List;


@Entity(name="article")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BaseEntity {

    String title;
    String slug;
    String subTitle;
    String body;
    @ManyToOne
    Users author;

}
