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

    //TODO:
    // 1. `static boolean isPostalCodeValid(String postalCode)`
    // checks if a postcode is valid or not.
    // The length of a postal code can either be `6` or `7`,
    // 2. all argument constructor
}
