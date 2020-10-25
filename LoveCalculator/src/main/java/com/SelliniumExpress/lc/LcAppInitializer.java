package com.SelliniumExpress.lc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LcAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class config[] = {LoveCalculatorAppConfig.class}; 
		
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/home.com/*"};
		return arr;
	}

}
