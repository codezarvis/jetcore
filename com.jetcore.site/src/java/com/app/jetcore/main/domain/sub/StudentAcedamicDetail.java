package com.app.jetcore.main.domain.sub;

import com.app.jetcore.main.domain.Domain;
import java.util.UUID;


/**
 *
 * @author Sudarsan
 */
public class StudentAcedamicDetail extends Domain {

    private String enrollmentNumber;
    private String sscMarks;
    private String sscYearOfPassing;
    private String sscInstitutionName;
    private String intermediateMarks;
    private String intermediateYearOfPassing;
    private String intermediateInstitutionName;
    private String graduation;
    private String graduationMarks;
    private String graduationYearOfPassing;
    private String graduationInstitutionName;
    private String postGraduation;
    private String postGraduationMarks;
    private String postGraduationYearOfPassing;
    private String postGraduationInstitutionName;

    public StudentAcedamicDetail() {
        setGuid(UUID.randomUUID().toString());
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getSscMarks() {
        return sscMarks;
    }

    public void setSscMarks(String sscMarks) {
        this.sscMarks = sscMarks;
    }

    public String getSscYearOfPassing() {
        return sscYearOfPassing;
    }

    public void setSscYearOfPassing(String sscYearOfPassing) {
        this.sscYearOfPassing = sscYearOfPassing;
    }

    public String getSscInstitutionName() {
        return sscInstitutionName;
    }

    public void setSscInstitutionName(String sscInstitutionName) {
        this.sscInstitutionName = sscInstitutionName;
    }

    public String getIntermediateMarks() {
        return intermediateMarks;
    }

    public void setIntermediateMarks(String intermediateMarks) {
        this.intermediateMarks = intermediateMarks;
    }

    public String getIntermediateYearOfPassing() {
        return intermediateYearOfPassing;
    }

    public void setIntermediateYearOfPassing(String intermediateYearOfPassing) {
        this.intermediateYearOfPassing = intermediateYearOfPassing;
    }

    public String getIntermediateInstitutionName() {
        return intermediateInstitutionName;
    }

    public void setIntermediateInstitutionName(String intermediateInstitutionName) {
        this.intermediateInstitutionName = intermediateInstitutionName;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getGraduationMarks() {
        return graduationMarks;
    }

    public void setGraduationMarks(String graduationMarks) {
        this.graduationMarks = graduationMarks;
    }

    public String getGraduationYearOfPassing() {
        return graduationYearOfPassing;
    }

    public void setGraduationYearOfPassing(String graduationYearOfPassing) {
        this.graduationYearOfPassing = graduationYearOfPassing;
    }

    public String getGraduationInstitutionName() {
        return graduationInstitutionName;
    }

    public void setGraduationInstitutionName(String graduationInstitutionName) {
        this.graduationInstitutionName = graduationInstitutionName;
    }

    public String getPostGraduation() {
        return postGraduation;
    }

    public void setPostGraduation(String postGraduation) {
        this.postGraduation = postGraduation;
    }

    public String getPostGraduationMarks() {
        return postGraduationMarks;
    }

    public void setPostGraduationMarks(String postGraduationMarks) {
        this.postGraduationMarks = postGraduationMarks;
    }

    public String getPostGraduationYearOfPassing() {
        return postGraduationYearOfPassing;
    }

    public void setPostGraduationYearOfPassing(String postGraduationYearOfPassing) {
        this.postGraduationYearOfPassing = postGraduationYearOfPassing;
    }

    public String getPostGraduationInstitutionName() {
        return postGraduationInstitutionName;
    }

    public void setPostGraduationInstitutionName(String postGraduationInstitutionName) {
        this.postGraduationInstitutionName = postGraduationInstitutionName;
    }

    @Override
    public String toString() {
        return "StudentAcedamicDetail{" + "enrollmentNumber=" + enrollmentNumber + ", sscMarks=" + sscMarks + ", sscYearOfPassing=" + sscYearOfPassing + ", sscInstitutionName=" + sscInstitutionName + ", intermediateMarks=" + intermediateMarks + ", intermediateYearOfPassing=" + intermediateYearOfPassing + ", intermediateInstitutionName=" + intermediateInstitutionName + ", graduation=" + graduation + ", graduationMarks=" + graduationMarks + ", graduationYearOfPassing=" + graduationYearOfPassing + ", graduationInstitutionName=" + graduationInstitutionName + ", postGraduation=" + postGraduation + ", postGraduationMarks=" + postGraduationMarks + ", postGraduationYearOfPassing=" + postGraduationYearOfPassing + ", postGraduationInstitutionName=" + postGraduationInstitutionName + '}';
    }
}