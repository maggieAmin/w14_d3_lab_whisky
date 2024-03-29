package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findWhiskiesByYear (Integer year);
    List<Whisky> findByDistilleryNameAndAge (String distillery, Integer age);
    List<Whisky> findByDistilleryRegion (String distillery);
}
