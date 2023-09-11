package com.rubenszaes.tshare.repository;

import com.rubenszaes.tshare.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
