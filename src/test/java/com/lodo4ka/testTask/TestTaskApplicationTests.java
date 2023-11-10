package com.lodo4ka.testTask;

import com.lodo4ka.testTask.services.CharNumberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestTaskApplicationTests {

	CharNumberService charNumberService;

	@Autowired
	public TestTaskApplicationTests(CharNumberService charNumberService) {
		this.charNumberService = charNumberService;
	}

	@Test
	void testCharNumberServiceInstance() {
		assertEquals("\"b\": 5, \"1\": 4, \"a\": 3.", charNumberService.getCharNumber("ba1aabbb111b"));
	}

}
