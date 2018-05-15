package com.bin;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bin.mapper.TestMapper;
import com.alibaba.fastjson.JSONObject;

@Controller
public class RequestController {
	
	Logger logger=Logger.getLogger(RequestController.class);
	
	@Autowired
	TestMapper tm;
	
	@GetMapping("/inde.htm")
	public String getIndex(Map<String, Object> map) {
		map.put("Hello", "Hello index!!!");
		return "index";
	}
	
	@RequestMapping("/test")
	public void testError() {
		//让程序报错500 进入错误500页面
		String str="we";
		Integer s=Integer.parseInt(str);
		
		logger.info("进入报错页面");
	}
	
	@RequestMapping("/testPage")
	public String testSu() {
		
		return "/500";
	}
	
	@RequestMapping("/testS")
	@ResponseBody
	public String testS() {
		
		List<Map> list=tm.seelctUserInfo();
		
		logger.info(JSONObject.toJSONString(list));
		
		return "Sucess";
	}
	
}
