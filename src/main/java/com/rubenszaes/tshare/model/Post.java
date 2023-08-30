package com.rubenszaes.tshare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts", schema = "tshare")
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_sq")
    @SequenceGenerator(schema = "tshare", name = "posts_sq", sequenceName = "posts_sq", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "text_content")
    private String txtContent;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
