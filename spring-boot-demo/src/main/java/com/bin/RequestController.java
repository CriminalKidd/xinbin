package com.bin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RequestController {

	@RequestMapping("/test")
	public void testError() {
		//让程序报错500 进入错误500页面
		String str="we";
		Integer s=Integer.parseInt(str);
		
		System.out.println("������");
	}
	
	@RequestMapping("/testPage")
	public String testSu() {
		
		return "500";
	}
	
	@RequestMapping("/testS")
	@ResponseBody
	public String testS() {
		
		return "Sucess";
	}
	
}
