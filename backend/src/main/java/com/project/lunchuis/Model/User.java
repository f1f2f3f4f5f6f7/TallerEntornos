package com.project.lunchuis.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    private String password;
    private String email;
    private String code;
    private String phoneNumber;
    private Rol rol;
    private Boolean session;
    @DBRef
    @JsonIgnore
    private List<Buy> purchases = new ArrayList<>();
}
