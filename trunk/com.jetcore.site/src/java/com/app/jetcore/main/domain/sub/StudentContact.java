package com.app.jetcore.main.domain.sub;

import com.app.jetcore.main.domain.Domain;
import java.util.UUID;

/**
 *
 * @author Sudarsan
 */
public class StudentContact extends Domain {

    private String enrollmentNumber;
    private String gender;
    private String email;
    private String mobile;
    private String address;

    public StudentContact() {
        setGuid(UUID.randomUUID().toString());
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentContact{" + "enrollmentNumber=" + enrollmentNumber + ", gender=" + gender + ", email=" + email + ", mobile=" + mobile + ", address=" + address + '}';
    }
}
