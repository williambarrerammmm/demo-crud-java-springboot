package com.william.democrud;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.william.democrud.controller.DepartmentController;

@SpringBootTest
public class SmokeTest {
	
	 @Autowired
	 private ApplicationContext applicationContext;
	 
	 @Autowired
	 private DepartmentController departmentController;
	 
	 @Test
	 public void givenInScopeComponents_whenSearchingInApplicationContext_thenFindThem() {
		 assertNotNull(applicationContext.getBean(DepartmentController.class));
	 }
	 
	 @Test
	 public void contextLoads() {
		 assertNotNull(departmentController);
	 }
	 
}
