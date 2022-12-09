
//Java Program to Illustrate DepartmentRepository File

//Importing package module to code fragment
package com.william.democrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.william.democrud.entity.Department;

//Annotation
@Repository

//Interface
public interface IDepartmentRepository
	extends JpaRepository<Department, Long> {
}
