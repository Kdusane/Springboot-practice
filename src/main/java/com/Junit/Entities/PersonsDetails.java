package com.Junit.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PersonsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
}

