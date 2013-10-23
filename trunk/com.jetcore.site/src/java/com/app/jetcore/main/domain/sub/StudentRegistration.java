package com.app.jetcore.main.domain.sub;

import com.app.jetcore.main.domain.Domain;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Sudarsan
 */
public class StudentRegistration extends Domain {

    private String enrollmentNumber;
    private Date enrollmentDate;
    private String enrolledCourse;
    private String batchCode;
    private String studentFirstName;
    private String studentLastName;
    private String category;
    private Date dateOfBirth;
    private StudentContact studentContact;
    private StudentAcedamicDetail studentAcedamicDetail;

    public StudentRegistration() {
        setGuid(UUID.randomUUID().toString());
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(String enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public StudentContact getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(StudentContact studentContact) {
        this.studentContact = studentContact;
    }

    public StudentAcedamicDetail getStudentAcedamicDetail() {
        return studentAcedamicDetail;
    }

    public void setStudentAcedamicDetail(StudentAcedamicDetail studentAcedamicDetail) {
        this.studentAcedamicDetail = studentAcedamicDetail;
    }

    @Override
    public String toString() {
        return "StudentRegistration{" + "enrollmentNumber=" + enrollmentNumber + ", enrollmentDate=" + enrollmentDate + ", enrolledCourse=" + enrolledCourse + ", batchCode=" + batchCode + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName + ", category=" + category + ", dateOfBirth=" + dateOfBirth + ", studentContact=" + studentContact + ", studentAcedamicDetail=" + studentAcedamicDetail + '}';
    }
}
