package edu.merzlab.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Exam {
    private final String lecture;
    private double grade;

}
