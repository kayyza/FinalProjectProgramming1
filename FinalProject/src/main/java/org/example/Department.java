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


    public Department (String departmentId, String departmentName){
        if (!validateDepartmentName(departmentName)) {
            this.departmentId = null;
            this.departmentName = null;
        }
        else {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }
    }

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
}
