package org.example.person;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String describe() {
        return "Person: " + firstName + " " + lastName;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        //int age = currentDate.getYear() - dateOfBirth.getYear();
        //return age;
        return period.getYears();
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
