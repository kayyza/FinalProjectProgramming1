package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;


    /**
     * checks if a postcode is valid or not, the length of a postal code can either be 6 or 7
     * @param postalCode the input String
     * @return true or false
     */
    public static boolean isPostalCodeValid(String postalCode){
        return postalCode.length() == 6 || postalCode.length() == 7;
    }

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.country = country;
        } else {
            this.streetNo = 0; // ask about null int value
            this.street = null;
            this.city = null;
            this.province = null;
            this.country = null;
        }
    }


    //TODO:
    // static boolean isPostalCodeValid(String postalCode)
    // The length of a postal code can either be `6` or `7`,
}
