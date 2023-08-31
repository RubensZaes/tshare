package com.rubenszaes.tshare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tags", schema = "tshare")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tags_sq")
    @SequenceGenerator(schema = "tshare", name = "tags_sq", sequenceName = "tags_sq", initialValue = 1, allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
