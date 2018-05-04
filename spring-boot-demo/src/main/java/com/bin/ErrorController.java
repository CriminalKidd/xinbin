package com.bin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

	@RequestMapping(value="/error")
	public String handleError(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		Integer errorCode=(Integer)request.getAttribute("javax.servlet.error.status_code");
		if(errorCode == 401) {
			return "/401";
		}else if(errorCode == 404) {
			return "404";
		}else if(errorCode == 403) {
			return "/403";
		}else {
			return "/500";
		}
		
	}

	public String getErrorPath() {
		return "/error";
	}

	
}
