package com.example.demo_kafka;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Data
public class Student implements Serializable {

    private int id;
    private String firstname;
    private String lastname;
}
