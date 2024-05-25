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
    private static int nextId = 1;


    public Department (String departmentName){
        if (!validateDepartmentName(departmentName)) {
            this.departmentId = null;
            this.departmentName = null;
        }
        else {
            this.departmentId = getNextId();
            this.departmentName = departmentName;
        }
    }

    /**
     * checks if a department name is valid or not,
     * a department name should only contain letters or space
     * @param departmentName the input String
     * @return true or false
     */
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

    /**
     * gets the department id in string format
     * @return the department id in string
     */
    public static String getNextId(){
        String num = Integer.toString(nextId);
        nextId++;
        return 'D' + num;
    }
}
