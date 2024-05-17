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


    public static boolean validateDepartmentName(String departmentName) {
        for(int i = 0; i < departmentName.length(); i++){
            char character = departmentName.charAt(i);
            if (Character.isLetter(character) || character == ' ') {
                continue;
            }
            return false;
        }
        return true;
    }

    //TODO:
    // static boolean validateDepartmentName(String departmentName)
    // checks if a department name is valid or not,
    // a department name should only contain letters or space

    //TODO:
    // Constructor
    // if the departmentName is invalid, create the object with everything as null

}
