/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.web.forms;

/**
 *
 * @author Sudarsan
 */
public class LoginForm {

    private String email;
    private String password;

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

    @Override
    public String toString() {
        return "LoginForm{" + "email=" + email + ", password=" + password + '}';
    }

    
}
