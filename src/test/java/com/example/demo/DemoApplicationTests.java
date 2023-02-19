package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Application Test case executed -------->");
		log.info("Application Test case executed with second log statements-------->");
		log.info("Application Test case executed with Third log statements for testing purpose-------->");
		Assert.assertEquals(true, true);
	}

}
