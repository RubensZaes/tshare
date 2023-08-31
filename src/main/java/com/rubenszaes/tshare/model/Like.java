package com.rubenszaes.tshare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "likes", schema = "tshare")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "likes_sq")
    @SequenceGenerator(schema = "tshare", name = "likes_sq", sequenceName = "likes_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
