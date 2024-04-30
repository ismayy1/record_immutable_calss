package record1;

import java.util.Objects;

public class ImmutableEmployee {

    private final String firstName;
    private final String lastName;
    private final String email;

    // constructor
    public ImmutableEmployee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getter, NO setter, read only class

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != getClass())
            return false;
        ImmutableEmployee emp = (ImmutableEmployee) obj;
        return  Objects.equals(this.firstName, emp.firstName) &&
                Objects.equals(this.lastName, emp.lastName) &&
                Objects.equals(this.email, emp.email);
    }

    //contract between .equals() and .hashCode():
    // ****** If objects are equal, their hashCode must be also equal
    // ****** but if hashCode are equal, objects are not necessarily equal


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
