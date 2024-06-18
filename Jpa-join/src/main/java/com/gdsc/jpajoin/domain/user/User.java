package com.gdsc.jpajoin.domain.user;

import com.gdsc.jpajoin.domain.bestFriend.BestFriend;
import com.gdsc.jpajoin.domain.post.Post;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phoneNumber;

    @OneToOne
    private BestFriend bestFriend;

    @OneToMany(mappedBy = "user")
    private List<Post> postList;
}
