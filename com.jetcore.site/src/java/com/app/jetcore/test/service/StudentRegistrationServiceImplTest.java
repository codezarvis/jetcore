package com.app.jetcore.test.service;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentContact;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import org.junit.Test;

/**
 *
 * @author Sudarsan
 */
public class StudentRegistrationServiceImplTest extends JetCoreTestCase {

    @Test
    public void testCreate() {

        StudentRegistration studentRegistration = (StudentRegistration) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION);
        StudentContact studentContact = (StudentContact) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT);
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);


        studentRegistration.setEnrollmentNumber("111");
        studentRegistration.setEnrollmentDate(new java.util.Date());
        studentRegistration.setBatchCode("BATCH1");
        studentRegistration.setEnrolledCourse("CJET");
        studentRegistration.setStudentContact(studentContact);
        studentRegistration.setStudentFirstName("Student First Name");
        studentRegistration.setStudentLastName("Student Last Name");
        studentRegistration.setCreatedOn(new java.util.Date());
        studentRegistration.setCreatedBy(1L);
        studentRegistration.setModifiedOn(new java.util.Date());
        studentRegistration.setModifiedBy(1L);
        studentRegistration.setActive(Short.parseShort("1"));

        studentContact.setEnrollmentNumber(studentRegistration.getEnrollmentNumber());
        studentContact.setGender("Male");
        studentContact.setEmail("student1@cmc.com");
        studentContact.setMobile("9876543210");
        studentContact.setAddress("Student Address");
        studentContact.setCreatedOn(new java.util.Date());
        studentContact.setCreatedBy(1L);
        studentContact.setModifiedOn(new java.util.Date());
        studentContact.setModifiedBy(1L);
        studentContact.setActive(Short.parseShort("1"));



        studentRegistrationService.create(studentRegistration);
    }
}
