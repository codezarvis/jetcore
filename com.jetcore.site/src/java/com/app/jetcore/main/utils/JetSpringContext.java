package com.app.jetcore.main.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sudarsan
 * 
 */
public class JetSpringContext {
	public static void init() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/conf/beans.xml", "/conf/services.xml" });
		AppContext.APPCONTEXT = context;

	}
}
