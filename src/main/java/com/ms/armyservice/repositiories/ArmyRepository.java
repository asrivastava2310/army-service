package com.ms.armyservice.repositiories;

import com.ms.armyservice.entities.Army;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmyRepository extends JpaRepository<Army,Long> {
}
