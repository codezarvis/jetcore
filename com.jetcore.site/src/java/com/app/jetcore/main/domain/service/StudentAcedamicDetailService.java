
package com.app.jetcore.main.domain.service;

import com.app.jetcore.main.domain.sub.StudentAcedamicDetail;

/**
 *
 * @author Sudarsan
 */
public interface StudentAcedamicDetailService extends Service{
    
    StudentAcedamicDetail findByEnrollmentNumber(String enrollmentNumber);
    
}
