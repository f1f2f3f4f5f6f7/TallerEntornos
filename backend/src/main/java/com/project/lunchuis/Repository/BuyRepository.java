package com.project.lunchuis.Repository;

import com.project.lunchuis.Model.Buy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepository extends MongoRepository<Buy, String> {
}
