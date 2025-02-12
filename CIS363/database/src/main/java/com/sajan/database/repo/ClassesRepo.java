package com.sajan.database.repo;

import com.sajan.database.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepo extends JpaRepository<Classes, String> {
}
