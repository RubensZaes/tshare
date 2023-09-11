package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
