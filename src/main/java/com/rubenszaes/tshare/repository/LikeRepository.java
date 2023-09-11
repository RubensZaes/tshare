package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
