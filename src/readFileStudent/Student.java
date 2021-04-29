package readFileStudent;

public class Student {
    private String firstName;
    private String lastName;
    private int bornYear;
    private char gender;
    private double mark;

    public Student(String firstName, String lastName, int bornYear, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornYear = bornYear;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
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

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bornYear=" + bornYear +
                ", gender=" + (gender=='m'?"Male":"Female") +
                ", mark=" + mark +
                '}';
    }
}
