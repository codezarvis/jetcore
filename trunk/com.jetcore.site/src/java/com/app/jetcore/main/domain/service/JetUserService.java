
package com.app.jetcore.main.domain.service;

import com.app.jetcore.main.domain.sub.JetUser;

/**
 *
 * @author Sudarsan
 */
public interface JetUserService extends Service{

    JetUser get(final long uid);
    
    JetUser create(final JetUser jetUser);
    
    JetUser authenticate(final String email, final String password);
    
    JetUser findByGuid(final String guid);
}
