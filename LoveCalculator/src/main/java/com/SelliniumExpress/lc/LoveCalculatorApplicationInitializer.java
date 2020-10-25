package com.SelliniumExpress.lc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext(); 
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		//Create a DispatcherServlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		//Register the DispatcherServlet to servletContext object
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/home.com/*");
			
	}

}
