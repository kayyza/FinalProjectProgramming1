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
    public static boolean isPostalCodeValid(String postalCode) {

        if (postalCode == null || postalCode.isEmpty()) {
            return false;
        }
        if (postalCode.length() < 6 || postalCode.length() > 7) {
            return false;
        }

        if (postalCode.length() == 6) {
            for(int i = 0; i < postalCode.length(); i++) {
                switch (i) {
                    case 0, 2, 4:
                        if(!Character.isLetter(postalCode.charAt(i))) {
                           return false;
                        }
                        break;
                    case 1, 3, 5:
                        if (!Character.isDigit(postalCode.charAt(i))) {
                            return false;
                        }
                        break;
                }
            }
        } else {
            for (int i = 0; i < postalCode.length(); i++) {
                switch (i) {
                    case 0, 2, 5:
                        if (!Character.isLetter(postalCode.charAt(i))) {
                            return false;
                        }
                        break;
                    case 1, 4, 6:
                        if (!Character.isDigit(postalCode.charAt(i))) {
                            return false;
                        }
                }
            }
        }
        return true;
    }

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.country = country;
        } else {
            this.streetNo = 0;
            this.street = null;
            this.city = null;
            this.province = null;
            this.country = null;
        }
    }
}
