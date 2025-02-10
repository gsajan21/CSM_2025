package com.sajan.database.repo;

import com.sajan.database.model.Ships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipsRepo extends JpaRepository<Ships, String> {
}
