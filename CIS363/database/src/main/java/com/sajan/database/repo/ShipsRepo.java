package com.sajan.database.repo;

import com.sajan.database.model.Ships;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipsRepo extends JpaRepository<Ships, String> {
}
