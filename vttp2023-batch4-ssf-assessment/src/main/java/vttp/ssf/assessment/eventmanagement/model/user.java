package vttp.ssf.assessment.eventmanagement.model;

import java.util.Date;

public class user {
    
    private String fullName;
    private String email;
    private int mobileNum;
    private String gender;
    private Date dob;
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
