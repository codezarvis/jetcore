
package com.app.jetcore.main.domain.service;

import com.app.jetcore.main.domain.sub.StudentAcedamicDetail;
import java.util.List;

/**
 *
 * @author Sudarsan
 */
public interface StudentAcedamicDetailService extends Service{
    
    StudentAcedamicDetail findByEnrollmentNumber(String enrollmentNumber);
    
    List<StudentAcedamicDetail> findByQualfAndMarks(String qualf, String marks);
    
}
