package com.bin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bin.mapper.TestMapper;
import com.alibaba.fastjson.JSONObject;

@Controller
public class RequestController {

	@Autowired
	TestMapper tm;
	
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
		
		List<Map> list=tm.seelctUserInfo();
		
		System.out.println(JSONObject.toJSONString(list));
		
		return "Sucess";
	}
	
}
