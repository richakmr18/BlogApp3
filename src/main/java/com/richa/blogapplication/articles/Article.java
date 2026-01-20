package com.richa.blogapplication.articles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name="article")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
//@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String articleName;
    String authorName;
}
