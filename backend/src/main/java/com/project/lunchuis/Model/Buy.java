package com.project.lunchuis.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "buy")
public class Buy {
    @Id
    private String id;

    private LocalDate date;
    private LocalTime hour;

    private boolean dinner;
    private boolean lunch;
    private boolean monthly;

    @DBRef
    @JsonIgnore
    private QrCode qrcode;

    public void setQrcode(QrCode qrcode) {
        this.qrcode = qrcode;
        if (qrcode != null) {
            qrcode.setBuy(this);
        }
    }

    // Relación con Report
    @DBRef
    @JsonIgnore
    private Report report;

    // Relación con User
    @DBRef
    private User user;

    @DBRef
    private Combo combo;
}
