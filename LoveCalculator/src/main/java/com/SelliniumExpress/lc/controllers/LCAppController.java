package com.SelliniumExpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SelliniumExpress.api.RegisterUserDTO;
import com.SelliniumExpress.api.UserInfoDTO;

@Controller
public class LCAppController {

//	@ResponseBody
	@RequestMapping("/")
	public String homepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page"; //To get values of properties from DTO class and send it to view
	}

	//Here the DTO class is getting the values from the view
	@RequestMapping("/process-homepage")
	public String processHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
		return "process-homepage"; //To get values of properties from DTO class and send it to view.
	}
	
	//Register the user
	@RequestMapping("/register-user")
	public String processRegistration(@ModelAttribute("registerUser") RegisterUserDTO registerUserDTO) {
		return "register-user";
	}
	
	//RegistrationDetails
	@RequestMapping("/process-register")
	public String showRegistrationDetails(@ModelAttribute("showRegisteredUser") RegisterUserDTO showRegisteredUser) {
		return "process-register";
	}

}
