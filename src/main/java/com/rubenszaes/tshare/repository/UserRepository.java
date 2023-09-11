package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
