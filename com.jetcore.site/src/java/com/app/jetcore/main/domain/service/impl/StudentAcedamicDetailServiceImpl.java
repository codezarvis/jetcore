package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentAcedamicDetailService;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentAcedamicDetail;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.AppContext;
//import com.app.jetcore.main.utils.QualfMap;
import com.app.jetcore.main.utils.hibernate.HibernateUtils;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
            StudentRegistration studentRegistration = studentRegistrationService.findByEnrollmentNumber(enrollmentNumber);
            studentAcedamicDetail = studentRegistration.getStudentAcedamicDetail();
        } catch (Exception exception) {
            LOG.debug("StudentAcedamicDeatilServiceImpl", exception);
        }

        return studentAcedamicDetail;
    }

    @Override
    public List<StudentAcedamicDetail> findByQualfAndMarks(String qualf, String marks) {
        List<StudentAcedamicDetail> list = null;
//        Session session = HibernateUtils.currentSession();
//        String qualification = QualfMap.getQualf(qualf);
//        LOG.debug("==================Qualf is : "+qualification);
//        try {
//            Criteria criteria = session.createCriteria(StudentAcedamicDetail.class);
//            criteria.add(Restrictions.eq(qualification, qualf)).add(Restrictions.ge(qualification, marks));
//            list = criteria.list();
//        } catch (Exception exception) {
//            LOG.warn("StudentAcedamicDeatilServiceImpl", exception);
//        } finally {
//            HibernateUtils.closeSession();
//        }
        return list;
    }
}
