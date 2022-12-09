package com.william.democrud;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.william.democrud.entity.Department;
import com.william.democrud.model.DepartmentModel;

@SpringBootTest
public class ServiceTest {
	
	Department department;
	
	@BeforeEach
	public void load() {
		department= new DepartmentModel().createDepModel();
	}
	
	@Test
	 public void contextLoads() {
		 assertNotNull(department);
	 }

}
