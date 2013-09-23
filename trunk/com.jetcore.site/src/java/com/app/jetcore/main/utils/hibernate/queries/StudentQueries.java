package com.app.jetcore.main.utils.hibernate.queries;

/**
 *
 * @author Sudarsan
 */
public interface StudentQueries {

    public static final String FIND_BY_ENROLLMENT_NUMBER = "FROM StudentRegistration studentRegistration WHERE studentRegistration.enrollmentNumber=:enrollmentNumber";
    
    public static final String FIND_BY_GUID = "FROM StudentRegistration studentRegistration WHERE studentRegistration.guid=:guid";
    
    public static final String FIND_STUDENT_BY_EMAIL = "FROM StudentContact studentContact WHERE studentContact.email=:email";
    
    public static final String FIND_STUDENT_BY_MOBILE = "FROM StudentContact studentContact WHERE studentContact.mobile=:mobile";
}
