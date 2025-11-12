package com.project.lunchuis.Model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "notification")
public class Notification {
    @Id
    private Integer id;

    private LocalDate date;

    private String message;

    @DBRef
    private User usuario;

    public Notification() {}

    public Notification(LocalDate date, String message, User usuario) {
        this.date = date;
        this.message = message;
        this.usuario = usuario;
    }
}
