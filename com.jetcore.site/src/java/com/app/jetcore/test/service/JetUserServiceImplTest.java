package com.app.jetcore.test.service;

import com.app.jetcore.main.domain.service.JetUserService;
import com.app.jetcore.main.domain.sub.JetUser;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import com.app.jetcore.context.id.names.ContextIdNames;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Sudarsan
 */
public class JetUserServiceImplTest extends JetCoreTestCase {

    private static Logger LOG = Logger.getLogger(JetUserServiceImplTest.class);

//    @Test
//    public void testAdd() {
//        JetUserService jetUserService = (JetUserService) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER_SERVICE);
//
//        JetUser jetUser = (JetUser) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER);
//        jetUser.setEmail("zarvis.a@gmail.com");
//        jetUser.setPassword("admin");
//        jetUser.setScreenName("Admin");
//        jetUser.setFirstName("Sudarshan");
//        jetUser.setLastName("Ambatipudi");
//        jetUser.setGender("Male");
//        jetUser.setSecurityQuestion("What is your pet name?");
//        jetUser.setSecurityAnswer("Sunny");
//        jetUser.setType("Admin");
//        jetUser.setCreatedBy(1L);
//        jetUser.setCreatedOn(new java.util.Date());
//        jetUser.setModifiedBy(1L);
//        jetUser.setModifiedOn(new java.util.Date());
//        jetUser.setActive(Short.parseShort("1"));
//
//        JetUser jetUser1 = jetUserService.create(jetUser);
//        assertEquals(jetUser1.getGuid(), jetUser.getGuid());
//
//    }

    @Test
    public void testAuthenticate() {
        JetUserService jetUserService = (JetUserService) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER_SERVICE);
        assertNotNull(jetUserService.authenticate("zarvis.a@gmail.com", "admin"));
    }
    
    @Test
    public void testGet() {
        JetUserService jetUserService = (JetUserService) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER_SERVICE);
        assertNotNull(jetUserService.get(1L));
    }
    
    @Test    
    public void testFindByGuid() {
        JetUserService jetUserService = (JetUserService) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER_SERVICE);
        JetUser jetUser = jetUserService.get(1L);
        //LOG.debug(jetUser.getGuid());
        
        assertNotNull(jetUserService.findByGuid(jetUser.getGuid()));
    }
}
