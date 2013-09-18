/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.main.utils.hibernate.queries;

/**
 *
 * @author Sudarsan
 */
public interface JetUserQueries {

    public static final String AUTHENTICATE = "FROM JetUser jetUser WHERE jetUser.email=:email AND jetUser.password=:password";
    public static final String FIND_BY_GUID = "FROM JetUser jetUser WHERE jetUser.guid=:guid";
}
