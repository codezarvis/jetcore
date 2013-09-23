package com.app.jetcore.test.service;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sudarsan
 */
public class StudentRegistrationServiceImplTest extends JetCoreTestCase {

    private static Logger LOG = Logger.getLogger(StudentRegistrationServiceImplTest.class);
//    @Test
//    public void testCreate() {
//
//        StudentRegistration studentRegistration = (StudentRegistration) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION);
//        StudentContact studentContact = (StudentContact) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT);
//        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
//
//
//        studentRegistration.setEnrollmentNumber("111");
//        studentRegistration.setEnrollmentDate(new java.util.Date());
//        studentRegistration.setBatchCode("BATCH1");
//        studentRegistration.setEnrolledCourse("CJET");
//        studentRegistration.setStudentContact(studentContact);
//        studentRegistration.setStudentFirstName("Student1 First Name");
//        studentRegistration.setStudentLastName("Student1 Last Name");
//        studentRegistration.setCreatedOn(new java.util.Date());
//        studentRegistration.setCreatedBy(1L);
//        studentRegistration.setModifiedOn(new java.util.Date());
//        studentRegistration.setModifiedBy(1L);
//        studentRegistration.setActive(Short.parseShort("1"));
//
//        studentContact.setEnrollmentNumber(studentRegistration.getEnrollmentNumber());
//        studentContact.setGender("Male");
//        studentContact.setEmail("student1@cmc.com");
//        studentContact.setMobile("9676534400");
//        studentContact.setAddress("Student Address");
//        studentContact.setCreatedOn(new java.util.Date());
//        studentContact.setCreatedBy(1L);
//        studentContact.setModifiedOn(new java.util.Date());
//        studentContact.setModifiedBy(1L);
//        studentContact.setActive(Short.parseShort("1"));
//
//
//
//        studentRegistrationService.create(studentRegistration);
//    }

    @Test
    public void testGet() {
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);

        //LOG.debug(studentRegistrationService.get(1L));
        assertNotNull(studentRegistrationService.get(1L));
    }

    @Test
    public void testFindByEnrollmentNumber() {
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
        //LOG.debug(studentRegistrationService.findByEnrollmentNumber("111"));
        assertNotNull(studentRegistrationService.findByEnrollmentNumber("111"));
    }

    @Test
    public void testFindByGuid() {
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
        //LOG.debug(studentRegistrationService.findByGuid("78706605-2c5f-4c36-8d76-6d1ce7956639"));
        assertNotNull(studentRegistrationService.findByGuid("78706605-2c5f-4c36-8d76-6d1ce7956639"));

    }
}
