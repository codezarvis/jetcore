/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.hibernate.HibernateUtils;
import org.apache.log4j.Logger;
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
}
