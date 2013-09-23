package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentContactService;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentContact;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.main.utils.hibernate.HibernateUtils;
import com.app.jetcore.main.utils.hibernate.queries.StudentQueries;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Sudarsan
 */
public class StudentContactServiceImpl extends ServiceImpl implements StudentContactService {

    private static Logger LOG = Logger.getLogger(StudentContactServiceImpl.class);

    private StudentContactServiceImpl() {
    }

    @Override
    public StudentContact findByEnrollmentNumber(String enrollmentNumber) {
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
        StudentContact studentContact = null;
        try {
            studentContact = studentRegistrationService.findByEnrollmentNumber(enrollmentNumber).getStudentContact();
        } catch (Exception exception) {
            LOG.debug("StudentContactServiceImpl", exception);
        } finally {
        }
        return studentContact;
    }

    @Override
    public StudentContact findByEmail(String email) {
        StudentContact studentContact = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery(StudentQueries.FIND_STUDENT_BY_EMAIL);
            query.setParameter("email", email);
            studentContact = (StudentContact) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("StudentContactServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }
        return studentContact;

    }

    @Override
    public StudentContact findByMobile(String mobile) {
        StudentContact studentContact = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery(StudentQueries.FIND_STUDENT_BY_MOBILE);
            query.setParameter("mobile", mobile);
            studentContact = (StudentContact) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("StudentContactServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }
        return studentContact;

    }
}
