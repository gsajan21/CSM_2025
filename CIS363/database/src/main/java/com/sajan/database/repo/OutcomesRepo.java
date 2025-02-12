package com.sajan.database.repo;

import com.sajan.database.model.Outcomes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomesRepo extends JpaRepository<Outcomes, Long> {
}
