//Java Program to Demonstrate DepartmentService File

//Importing required package to code fragment
package com.william.democrud.service;

//Importing required classes
import java.util.List;

import com.william.democrud.entity.Department;

//Interface
public interface IDepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
								Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}

