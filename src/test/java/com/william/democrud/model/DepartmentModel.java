package com.william.democrud.model;

import com.william.democrud.entity.Department;

public class DepartmentModel {
	
	public Department createDepModel() {
		Department department = new Department((long) 1, "ETC","C-Block","EC-02");
		return department;
	}
	

}
