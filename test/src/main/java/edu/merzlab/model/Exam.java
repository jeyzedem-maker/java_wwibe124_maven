package edu.merzlab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Exam {
    private final String lecture;
    private double grade;

}
