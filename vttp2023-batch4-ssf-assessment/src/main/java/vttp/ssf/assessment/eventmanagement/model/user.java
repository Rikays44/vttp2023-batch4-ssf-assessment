package vttp.ssf.assessment.eventmanagement.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class user {
    
    @NotEmpty(message = "required field")
    @Size(min = 5, max = 20, message = "Total characters must be between 5 and 20")
    private String fullName;

    @Email(message = "Invalid Email Format")
    @Size(max = 30, message = "Email length exceeded 30 characters")
    @NotBlank(message = "Email is a mandatory field")
    private String email;

    @Pattern(regexp = "(8|9)[0-9]{7}", message = "Invalid phone number entered")
    private int mobileNum;

    @NotEmpty(message = "required field")
    private String gender;

     @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Birth date must be a past date less than today")
    private Date dob;

    @Size(min = 1, max = 3, message = "1 to 3 tickets required")
    private int ticketNum;


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getTicketNum() {
        return ticketNum;
    }
    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }
    @Override
    public String toString() {
        return "user [fullName=" + fullName + ", email=" + email + ", mobileNum=" + mobileNum + ", gender=" + gender
                + ", dob=" + dob + ", ticketNum=" + ticketNum + "]";
    }
    
}
