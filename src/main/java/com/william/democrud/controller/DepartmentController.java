//Java Program to Demonstrate DepartmentController File

//Importing package module to code fragment
package com.william.democrud.controller;

import java.util.List;
//Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.william.democrud.entity.Department;
import com.william.democrud.service.IDepartmentService;

//Annotation
@RestController

//Class
public class DepartmentController {

	@Autowired private IDepartmentService departmentService;

	// Save operation
	@PostMapping("/departments")
	public Department saveDepartment(
		 @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/departments/{id}")
	public Department
	updateDepartment(@RequestBody Department department,
					@PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(
			department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")
									Long departmentId)
	{
		departmentService.deleteDepartmentById(
			departmentId);

		return "Deleted Successfully";
	}
}
