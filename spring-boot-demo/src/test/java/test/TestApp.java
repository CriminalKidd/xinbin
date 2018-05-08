package test;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.App;
import com.alibaba.fastjson.JSONObject;
import com.bin.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class) 
@WebAppConfiguration
public class TestApp {

	@Autowired
	TestMapper  tm;
	
	@Test
	public void test() {
		List<Map> list=tm.seelctUserInfo();
		System.out.println(JSONObject.toJSONString(list));
	}
	
}
