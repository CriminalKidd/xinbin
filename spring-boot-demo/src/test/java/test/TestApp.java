package test;
import java.util.Map;

import org.apache.log4j.Logger;
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

	Logger logger=Logger.getLogger(TestApp.class);
	
	@Autowired
	TestMapper  tm;
	
	@Test
	public void test() {
//		List<Map> list=tm.seelctUserInfo();
		Map<String, Object> map=tm.selectModelByquId("qqq");
		logger.info(JSONObject.toJSONString(map.get("beginSen")));
	}
	
}
