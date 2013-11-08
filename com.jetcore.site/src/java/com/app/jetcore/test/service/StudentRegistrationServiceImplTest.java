package com.app.jetcore.test.service;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentRegistrationService;
import com.app.jetcore.main.domain.sub.StudentAcedamicDetail;
import com.app.jetcore.main.domain.sub.StudentContact;
import com.app.jetcore.main.domain.sub.StudentRegistration;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sudarsan
 */
public class StudentRegistrationServiceImplTest extends JetCoreTestCase {
    
    private static Logger LOG = Logger.getLogger(StudentRegistrationServiceImplTest.class);
    
    @Test
    public void testCreate() {
        
        StudentRegistration studentRegistration = (StudentRegistration) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION);
        StudentContact studentContact = (StudentContact) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_CONTACT);
        StudentAcedamicDetail studentAcedamicDetail = (StudentAcedamicDetail) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_ACEDAMIC_DETAIL);
        StudentRegistrationService studentRegistrationService = (StudentRegistrationService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_REGISTRATION_SERVICE);
        
        
        studentRegistration.setEnrollmentNumber("333");
        studentRegistration.setEnrollmentDate(new java.util.Date());
        studentRegistration.setBatchCode("BATCH1");
        studentRegistration.setEnrolledCourse("CJET");
        studentRegistration.setStudentContact(studentContact);
        studentRegistration.setStudentFirstName("Student3 First Name");
        studentRegistration.setStudentLastName("Student3 Last Name");
        studentRegistration.setCategory("GEN");
        String dateOfBirthString = "14-08-1984";
        SimpleDateFormat dateFormat = (SimpleDateFormat) AppContext.APPCONTEXT.getBean(ContextIdNames.DATE_FORMAT);
        Date dateOfBirth = null;
        try {
            dateOfBirth = dateFormat.parse(dateOfBirthString);
        } catch (ParseException ex) {
            LOG.debug("StudentRegistrationServiceImplTest", ex);
        }
        studentRegistration.setDateOfBirth(dateOfBirth);
        studentRegistration.setCreatedOn(new java.util.Date());
        studentRegistration.setCreatedBy(1L);
        studentRegistration.setModifiedOn(new java.util.Date());
        studentRegistration.setModifiedBy(1L);
        studentRegistration.setActive(Short.parseShort("1"));
        
        studentContact.setEnrollmentNumber(studentRegistration.getEnrollmentNumber());
        studentContact.setGender("Male");
        studentContact.setEmail("student2@cmc.com");
        studentContact.setMobile("9848584518");
        studentContact.setAddress("Student Address");
        studentContact.setCreatedOn(new java.util.Date());
        studentContact.setCreatedBy(1L);
        studentContact.setModifiedOn(new java.util.Date());
        studentContact.setModifiedBy(1L);
        studentContact.setActive(Short.parseShort("1"));
        
        
        studentRegistration.setStudentContact(studentContact);
        
        studentAcedamicDetail.setEnrollmentNumber(studentRegistration.getEnrollmentNumber());
        studentAcedamicDetail.setSscInstitutionName("XYZ");
        studentAcedamicDetail.setSscYearOfPassing("2000");
        studentAcedamicDetail.setSscMarks("80%");
        studentAcedamicDetail.setIntermediateInstitutionName("PQR");
        studentAcedamicDetail.setIntermediateYearOfPassing("2002");
        studentAcedamicDetail.setIntermediateMarks("80%");
        studentAcedamicDetail.setGraduationInstitutionName("LMN");
        studentAcedamicDetail.setGraduation("BSC");
        studentAcedamicDetail.setGraduationYearOfPassing("2005");
        studentAcedamicDetail.setGraduationMarks("80%");
        studentAcedamicDetail.setPostGraduationInstitutionName("IJK");
        studentAcedamicDetail.setPostGraduation("MTECH");
        studentAcedamicDetail.setPostGraduationYearOfPassing("2007");
        studentAcedamicDetail.setPostGraduationMarks("60%");
        studentAcedamicDetail.setCreatedOn(new java.util.Date());
        studentAcedamicDetail.setCreatedBy(1L);
        studentAcedamicDetail.setModifiedOn(new java.util.Date());
        studentAcedamicDetail.setModifiedBy(1L);
        studentAcedamicDetail.setActive(Short.parseShort("1"));
        
        studentRegistration.setStudentAcedamicDetail(studentAcedamicDetail);
        
        studentRegistrationService.create(studentRegistration);
    }
    
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
        //assertNotNull(studentRegistrationService.findByGuid("78706605-2c5f-4c36-8d76-6d1ce7956639"));

    }
}
