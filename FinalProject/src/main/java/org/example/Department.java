package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId;

    //TODO:
    // 1. static boolean validateDepartmentName(String departmentName)
    // checks if a department name is valid or not,
    // a department name should only contain letters or space
    // 2. Constructor
    // if the departmentName is invalid, create the object with everything as null

}
