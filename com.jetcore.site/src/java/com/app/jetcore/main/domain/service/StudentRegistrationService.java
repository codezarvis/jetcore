/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.main.domain.service;

import com.app.jetcore.main.domain.sub.StudentRegistration;

/**
 *
 * @author Sudarsan
 */
public interface StudentRegistrationService extends Service{
    
    StudentRegistration create(final StudentRegistration studentRegistration);
    
    StudentRegistration findByEnrollmentNumber(final String enrollmentNumber);
    
    StudentRegistration get(final long uid);
    
    StudentRegistration findByGuid(final String guid);
    
    
}
