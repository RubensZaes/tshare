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
@Table(name = "posts_photos", schema = "tshare")
public class PostPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_photos_sq")
    @SequenceGenerator(schema = "tshare", name = "posts_photos_sq", sequenceName = "posts_photos_sq", initialValue = 1, allocationSize = 1)
    private Long id;
    private String photoName;
    private String url;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;

}
