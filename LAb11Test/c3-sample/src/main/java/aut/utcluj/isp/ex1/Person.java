package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Person {
    private String firstName;
    private String lastName;


    public Person(String firstName) {
        this.firstName=firstName;
        this.lastName = "";
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public Person(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //usfaasvasx




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
