package com.sajan.database.repo;

import com.sajan.database.model.Battles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattlesRepo extends JpaRepository<Battles, String> {
}
