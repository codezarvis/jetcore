package com.app.jetcore.main.domain.sub;

import com.app.jetcore.main.domain.Domain;
import java.util.UUID;

/**
 *
 * @author Sudarsan
 */
public class JetUser extends Domain {
    
    private String email;
    private String password;
    private String screenName;
    private String firstName;
    private String lastName;
    private String gender;
    private String securityQuestion;
    private String securityAnswer;
    private String type;
    
    public JetUser() {
        setGuid(UUID.randomUUID().toString());
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getScreenName() {
        return screenName;
    }
    
    public void setScreenName(String screenName) {
        this.screenName = screenName;
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
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getSecurityQuestion() {
        return securityQuestion;
    }
    
    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }
    
    public String getSecurityAnswer() {
        return securityAnswer;
    }
    
    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "JetUser{" + "email=" + email + ", password=" + password + ", screenName=" + screenName + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + ", type=" + type + '}';
    }
}
