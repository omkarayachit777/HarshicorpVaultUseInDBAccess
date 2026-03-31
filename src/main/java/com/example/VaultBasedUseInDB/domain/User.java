package com.example.VaultBasedUseInDB.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "my_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private Long mobileNumber;
    private String DOB;
}
