package com.sajan.database.repo;

import com.sajan.database.model.Outcomes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutcomesRepo extends JpaRepository<Outcomes, Long> {
}
