package com.gdsc.jpajoin.domain.post;

import com.gdsc.jpajoin.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(30)")
    private String title;

    @Column(columnDefinition = "varchar(700)")
    private String content;

    @ManyToOne
    private User user;
}
