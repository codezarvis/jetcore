package com.app.jetcore.test.service;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.StudentAcedamicDetailService;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.test.domain.JetCoreTestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author Sudarsan
 */
public class StudentAcedamicDetailServiceImplTest extends JetCoreTestCase {

    private static Logger LOG = Logger.getLogger(StudentAcedamicDetailServiceImplTest.class);

    @Test
    public void testFindByEnrollmentNumber() {

        StudentAcedamicDetailService studentAcedamicDetailService = (StudentAcedamicDetailService) AppContext.APPCONTEXT.getBean(ContextIdNames.STUDENT_ACEDAMIC_DETAIL_SERVICE);
        LOG.debug(studentAcedamicDetailService.findByEnrollmentNumber("111"));
        assertNotNull(studentAcedamicDetailService.findByEnrollmentNumber("111"));
    }
}
