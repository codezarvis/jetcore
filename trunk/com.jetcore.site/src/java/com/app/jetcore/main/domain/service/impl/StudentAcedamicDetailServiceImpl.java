package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentAcedamicDetailService;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentAcedamicDetail;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.AppContext;
import org.apache.log4j.Logger;

/**
 *
 * @author Sudarsan
 */
public class StudentAcedamicDetailServiceImpl extends ServiceImpl implements StudentAcedamicDetailService {

    private static Logger LOG = Logger.getLogger(StudentAcedamicDetailServiceImpl.class);

    private StudentAcedamicDetailServiceImpl() {
    }

    @Override
    public StudentAcedamicDetail findByEnrollmentNumber(String enrollmentNumber) {
        StudentAcedamicDetail studentAcedamicDetail = null;

        try {
            StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
            StudentRegistration studentRegistration= studentRegistrationService.findByEnrollmentNumber(enrollmentNumber);
            studentAcedamicDetail = studentRegistration.getStudentAcedamicDetail();
        } catch (Exception exception) {
            LOG.debug("StudentAcedamicDeatilServiceImpl", exception);
        }

        return studentAcedamicDetail;
    }
}
