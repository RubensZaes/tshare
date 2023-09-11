package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<Follower, Long> {
}
