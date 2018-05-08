package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.bin.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

//war 包 生成代码     修改 pom.xml 文件，将 jar 改成 war 如： <packaging>war</packaging>
//@SpringBootApplication
//public class App extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(App.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);
//    }
//}