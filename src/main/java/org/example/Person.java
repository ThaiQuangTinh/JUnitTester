package org.example;

public class Person {

    // This method is used to calculate insurance premiums based on a person's age, gender and marital status
    public int perdetails(int age, String gender, boolean married) {
        int premium = 300;
        if (age < 25 && gender.equals("male") && !married) {
            premium = premium + 1000;
        }
        else {
            if (married || gender.equals("female")) {
                premium = premium - 100;
                if (age >= 46 && age <= 65) {
                    premium = premium - 150;
                }
            }
        }
        return premium;
    }

}
