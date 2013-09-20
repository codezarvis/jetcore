package com.app.jetcore.main.domain.service.impl;

import com.app.jetcore.main.domain.service.JetUserService;
import com.app.jetcore.main.domain.sub.JetUser;
import com.app.jetcore.main.utils.hibernate.HibernateUtils;
import com.app.jetcore.main.utils.hibernate.queries.JetUserQueries;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sudarsan
 */
public class JetUserServiceImpl extends ServiceImpl implements JetUserService {

    private static Logger LOG = Logger.getLogger(JetUserServiceImpl.class);

    private JetUserServiceImpl() {
    }

    @Override
    public JetUser create(JetUser jetUser) {

        Session session = HibernateUtils.currentSession();
        Transaction tx = null;
        boolean rollback = true;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(jetUser);
            tx.commit();
            rollback = false;
        } catch (Exception exception) {
            LOG.warn("JetUserServiceImpl", exception);
        } finally {
            if (rollback && tx != null) {
                tx.rollback();
            }
            HibernateUtils.closeSession();
        }
        jetUser = findByGuid(jetUser.getGuid());
        return jetUser;
    }

    @Override
    public JetUser authenticate(String email, String password) {
        JetUser jetUser = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery(JetUserQueries.AUTHENTICATE);
            query.setParameter("email", email);
            query.setParameter("password", password);
            jetUser = (JetUser) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("JetUserServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }
        return jetUser;
    }

    @Override
    public JetUser findByGuid(String guid) {
        JetUser jetUser = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery(JetUserQueries.FIND_BY_GUID);
            //Query query = session.getNamedQuery("findByGuid");
            query.setParameter("guid", guid);
            jetUser = (JetUser) query.uniqueResult();
        } catch (Exception exception) {
            LOG.debug("JetUserServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }
        return jetUser;
    }

    @Override
    public JetUser get(long uid) {
        JetUser jetUser = null;
        Session session = HibernateUtils.currentSession();
        try {
            jetUser = (JetUser) session.get(JetUser.class, uid);
        }catch(Exception exception) {
            LOG.debug("JetUserServiceImpl", exception);
        }finally {
            HibernateUtils.closeSession();
        }
        return jetUser;
    }
    
    
}
