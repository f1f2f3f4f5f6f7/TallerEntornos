package com.project.lunchuis.Repository;

import com.project.lunchuis.Model.Combo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends MongoRepository<Combo, String> {
    
}
