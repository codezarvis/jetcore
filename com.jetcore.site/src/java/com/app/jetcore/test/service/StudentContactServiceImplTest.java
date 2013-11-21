package com.app.jetcore.test.service;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentContactService;
import com.app.jetcore.main.domain.sub.StudentContact;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sudarsan
 */
public class StudentContactServiceImplTest extends JetCoreTestCase {
    
    private static Logger LOG = Logger.getLogger(StudentContactServiceImplTest.class);
    
    @Test
    public void testFindByEnrollmentNumber() {
        
        StudentContactService studentContactService = (StudentContactService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT_SERVICE);
        StudentContact studentContact = studentContactService.findByEnrollmentNumber("111");

        //LOG.debug(studentContact.toString());
        assertNotNull(studentContact);
        
    }
    
    @Test
    public void testFindByEmail() {
        StudentContactService studentContactService = (StudentContactService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT_SERVICE);
        StudentContact studentContact = studentContactService.findByEmail("student1@cmc.com");

        //LOG.debug(studentContact);
        assertNotNull(studentContact);
        
        
    }
    
    @Test
    public void testFindByMobile() {
        StudentContactService studentContactService = (StudentContactService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT_SERVICE);
        StudentContact studentContact = studentContactService.findByMobile("9848584518");
        
        //LOG.debug(studentContact);
        
        assertNotNull(studentContact);
    }
}
