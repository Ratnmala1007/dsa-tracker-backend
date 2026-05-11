package com.dsa.tracker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.annotation.PostConstruct;

@SpringBootTest
class TrackerApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	PasswordEncoder encoder;

	@Test
	void encodePassword() {
	    System.out.println(encoder.encode("1234"));
	}
}
