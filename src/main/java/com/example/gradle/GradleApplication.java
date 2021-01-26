package com.example.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleApplication implements CommandLineRunner {
    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(GradleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Customer("Alice","Smith"));
        repository.save(new Customer("Bob" ,"Smith"));
        //all customers
        System.out.println("Customers found with findAll():");
        for (Customer customer : repository.findAll()){
            System.out.println(customer);
        }
        System.out.println();

        //by first name
        System.out.println("Customer found with findByFirstName():");
        System.out.println(repository.findByFirstName("Alice"));
        System.out.println();

        //by last names
        System.out.println("Customers found with findByLastName():");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

    }
}
