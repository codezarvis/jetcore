/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentContact;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.hibernate.HibernateUtils;
import com.app.jetcore.main.utils.hibernate.queries.StudentQueries;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sudarsan
 */
public class StudentRegistrationServiceImpl extends ServiceImpl implements StudentRegistrationService {

    private static Logger LOG = Logger.getLogger(StudentRegistrationServiceImpl.class);

    private StudentRegistrationServiceImpl() {
    }

    @Override
    public StudentRegistration create(StudentRegistration studentRegistration) {

        Session session = HibernateUtils.currentSession();
        Transaction tx = null;
        boolean rollback = true;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(studentRegistration);
            tx.commit();
            rollback = false;
        } catch (Exception exception) {
            LOG.warn("StudentRegistrationServiceImpl", exception);
        } finally {
            if (rollback && tx != null) {
                tx.rollback();
            }
            HibernateUtils.closeSession();
        }

        return studentRegistration;
    }

    @Override
    public StudentRegistration findByEnrollmentNumber(String enrollmentNumber) {

        StudentRegistration studentRegistration = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery(StudentQueries.FIND_BY_ENROLLMENT_NUMBER);
            query.setParameter("enrollmentNumber", enrollmentNumber);
            studentRegistration = (StudentRegistration) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("StudentRegistrationServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }

        return studentRegistration;


    }

    @Override
    public StudentRegistration get(long uid) {

        StudentRegistration studentRegistration = null;
        Session session = HibernateUtils.currentSession();
        try {

            studentRegistration = (StudentRegistration) session.get(StudentRegistration.class, uid);
        } catch (Exception exception) {
            LOG.debug("StudentRegistrationServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }

        return studentRegistration;
    }

    @Override
    public StudentRegistration findByGuid(String guid) {

        StudentRegistration studentRegistration = null;
        Session session = HibernateUtils.currentSession();

        try {
            Query query = session.createQuery(StudentQueries.FIND_BY_GUID);
            query.setParameter("guid", guid);
            studentRegistration = (StudentRegistration) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("StudentRegistrationServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }

        return studentRegistration;

    }
}
