package com.example.gradle;

import org.springframework.data.annotation.Id;


public class Customer {
//public was changed to private
    @Id
    private String id; 

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//by analyses of code, method can be not used
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
