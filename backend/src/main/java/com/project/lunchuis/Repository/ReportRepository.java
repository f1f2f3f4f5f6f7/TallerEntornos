package com.project.lunchuis.Repository;

import com.project.lunchuis.Model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {
    List<Report> findByDateBetween(LocalDate startDate, LocalDate endDate);
    List<Report> findByDate(LocalDate date);

}
