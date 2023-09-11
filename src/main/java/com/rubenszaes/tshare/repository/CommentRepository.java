package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
