package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== 1º TEST: Department insert ===");
		Department newDepartment = new Department(7, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("New departmente inserted! New department ID's = " + newDepartment.getId());
		
		System.out.println("\n=== 2º TEST: Find by ID ===");
		Department department = departmentDao.findById(6);
		System.out.println(department);
		
		System.out.println("\n=== 3º TEST: Department update ===");
		department = departmentDao.findById(6);
		department.setName("Movies");
		departmentDao.update(department);
		System.out.println("Department Updated! ");
		
		System.out.println("\n=== 4º TEST: Find all ===");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== 5º TEST: Delete by ID ===");
		departmentDao.deleteById(7);
		System.out.println("Department Deleted!");

	}

}
