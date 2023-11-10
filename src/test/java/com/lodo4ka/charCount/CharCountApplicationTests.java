package com.lodo4ka.charCount;

import com.lodo4ka.charCount.services.CharNumberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CharCountApplicationTests {

	CharNumberService charNumberService;

	@Autowired
	public CharCountApplicationTests(CharNumberService charNumberService) {
		this.charNumberService = charNumberService;
	}

	@Test
	void testCharNumberService1() {
		assertEquals("\"b\": 5, \"1\": 4, \"a\": 3.", charNumberService.getCharNumber("ba1aabbb111b"));
	}

}
