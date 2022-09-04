package com.example.databaseflayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class student {
    @Id
    @GeneratedValue(
            generator = "sequence_name"
    )


    public Long  studentId;
    public String  firstname;
    public String  lastname;
    public String  email;
    public String  course;
    public String  registration_number;
    public String phoneNumber;

}








