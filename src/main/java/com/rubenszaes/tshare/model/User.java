package com.rubenszaes.tshare.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", schema = "tshare")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sq")
    @SequenceGenerator(schema = "tshare", name = "users_sq", sequenceName = "users_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    private String name;
    @Column(unique = true)
    private String userName;
    private String password;
    private String bio;
    private String email;
    private boolean active;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
}
