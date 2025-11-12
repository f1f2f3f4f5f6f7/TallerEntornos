package com.project.lunchuis.Repository;

import com.project.lunchuis.Model.QrCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QrRepository extends MongoRepository<QrCode, String> {
}

