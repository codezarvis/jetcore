package com.app.jetcore.test.domain;

import com.app.jetcore.test.service.JetUserServiceImplTest;
import com.app.jetcore.test.service.StudentRegistrationServiceImplTest;
import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

/**
 *
 * @author Sudarsan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({JetUserServiceImplTest.class, StudentRegistrationServiceImplTest.class})
public class CoreTestSuite {

    private static Logger LOG = Logger.getLogger(CoreTestSuite.class);

    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(CoreTestSuite.class);

        for (Failure failure : result.getFailures()) {
            LOG.debug(failure.toString());
        }

        System.exit(0);
    }
}
