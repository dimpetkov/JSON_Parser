package users;

public class Student{
    private String firstName;
    private String lastName;
    private double rank;

    public Student() {

    }

    public Student(String firstName, String lastName, double rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getRank() {
        return rank;
    }

}
