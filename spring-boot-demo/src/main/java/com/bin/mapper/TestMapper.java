package com.bin.mapper;

import java.util.List;
import java.util.Map;

public interface TestMapper {

	List<Map> seelctUserInfo();
	
	Map<String, Object> selectModelByquId(String questionId);
}
