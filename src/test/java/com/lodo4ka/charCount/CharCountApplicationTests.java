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

	@Test
	void testCharNumberService2() {
		assertEquals("\"A\": 3, \"b\": 2, \"c\": 1.", charNumberService.getCharNumber("AbAAbc"));
	}

	@Test
	void testCharNumberService3() {
		assertEquals("\"a\": 5, \"i\": 3, \"u\": 2, \";\": 1.", charNumberService.getCharNumber("uiauiiaaaa;"));
	}

}
