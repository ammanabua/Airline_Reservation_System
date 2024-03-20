import java.time.LocalDate;
import java.util.List;

public record Passenger(String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth) {

    public Passenger(String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String phoneNumber() {
        return phoneNumber;
    }

    @Override
    public LocalDate dateOfBirth() {
        return dateOfBirth;
    }

}
