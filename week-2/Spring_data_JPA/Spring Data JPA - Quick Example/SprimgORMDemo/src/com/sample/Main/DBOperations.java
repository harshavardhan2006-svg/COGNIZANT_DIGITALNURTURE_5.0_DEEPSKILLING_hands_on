package com.sample.Main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.Config.AppConfig;
import com.sample.DAO.EmployeeDAO;
import com.sample.Models.Employee;

public class DBOperations {
	public static ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	
	public static EmployeeDAO dao=context.getBean(EmployeeDAO.class);
		
	public static Scanner sc=new Scanner(System.in);
	
	public static void Insert()
	{
		System.out.println("Enter Name:");
		
		String name=sc.nextLine();
		
		System.out.println("Enter Designation:");
		String designation=sc.nextLine();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter City:");
		String city=sc.nextLine();
		
		dao.Save(new Employee(0,name,designation,age,city));
	
		
	}
	
	public static void Update()
	{
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Designation:");
		String designation=sc.nextLine();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter City:");
		String city=sc.nextLine();
		
		dao.Update(new Employee(id,name,designation,age,city));
	
		
	}
	
	public static void Delete() {
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		sc.nextLine();
		
		dao.Delete(id);
	}
	
	public static void getAll() {
		System.out.println(dao.getAll());
	}
	public static void main(String[] args) {
		int choice;

	    do {

	        System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");
	        System.out.println("1. Insert Employee");
	        System.out.println("2. Update Employee");
	        System.out.println("3. Delete Employee");
	        System.out.println("4. View All Employees");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");

	        choice = sc.nextInt();
	        sc.nextLine();

	        switch (choice) {
	        case 1:
	            Insert();
	            break;
	        case 2:
	            Update();
	            break;
	        case 3:
	            Delete();
	            break;
	        case 4:
	            getAll();
	            break;
	        case 5:
	            System.out.println("Thank You... Exiting Application.");
	            break;
	        default:
	            System.out.println("Invalid Choice! Please try again.");
	        }
	    } while (choice != 5);

	    sc.close();
	    ((AnnotationConfigApplicationContext) context).close();
	
		
		
	}
}
