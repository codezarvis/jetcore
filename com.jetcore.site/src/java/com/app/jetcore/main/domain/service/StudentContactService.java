
package com.app.jetcore.main.domain.service;

import com.app.jetcore.main.domain.sub.StudentContact;

/**
 *
 * @author Sudarsan
 */
public interface StudentContactService extends Service{
    
    
    StudentContact findByEnrollmentNumber(final String enrollmentNumber);
    
    StudentContact findByEmail(final String email);
    
    StudentContact findByMobile(final String mobile);
}
