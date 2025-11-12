package com.project.lunchuis.Repository;

import com.project.lunchuis.Model.PurchaseValue;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseValueRepository extends MongoRepository<PurchaseValue, String> {
}
