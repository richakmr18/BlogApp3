package com.richa.blogapplication.comments;

import com.richa.blogapplication.articles.Article;
import com.richa.blogapplication.commons.BaseEntity;
import com.richa.blogapplication.users.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="comment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseEntity {

    String title;
    String body;

    @ManyToOne
    Users author;
    @ManyToOne
    Article article_comment;

}
