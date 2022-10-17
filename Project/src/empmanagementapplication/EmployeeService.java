package empmanagementapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet <Employee> empset =new HashSet <Employee>();
	Employee emp1=new Employee(101,"vela",23,"IT","Developer",25000);
	Employee emp2=new Employee(102,"swetha",26,"CSA","ANALYST",26000);
	Employee emp3=new Employee(103,"gopi",22,"ADMIN","TESTER",29000);
	Employee emp4=new Employee(104,"mani",28,"CO"," SYSTEMENGINEER",35000);

	Scanner sc = new Scanner(System.in);
	boolean found=false;
	 int id;
	 String name;
	 int age;
	 String designation;
	 String department;
	 double salary;
	 
	 public EmployeeService() {
		 empset.add(emp1);
		 empset.add(emp2);
		 empset.add(emp3);
		 empset.add(emp4);

	 }
	 
	//VIEW ALL EMPLOYEE
	 public void viewAllEmps() {
		 for(Employee emp:empset) {
			 System.out.println(emp);
		 }
	 }
	//VIEW EMPLOYEE BASED ON ID
	 public void viewEmp() {
		 System.out.println("Enter Id:   ");
		 id=sc.nextInt();
		 for(Employee emp:empset) {
if(emp.getId()==id) {
	System.out.println(emp);
	found=true;
	
}
	 }
	if(!found) {
		System.out.println("Employee with is id is not  present");
	}
		}
	 //UPDATE EMPLOYEE
	 public void updateEmployee() {
		 System.out.println("Enter Id: ");
		 id=sc.nextInt();
		 boolean found=false;
		 for(Employee emp:empset) {
			 if(emp.getId()==id) {
System.out.println("Enter Name:");
name=sc.next();
System.out.println("Enter new  salary");
salary=sc.nextDouble();
emp.setName(name);
emp.setSalary(salary);
System.out.println("Updated details of employees are:");
System.out.println(emp);
found=true;
	 }
} 
		 if(!found) {
				System.out.println("Employee with is id is not  present");
			}else
			{
				System.out.println("Employee details Updated Successfully!!");

			}
	 }
	 //delete the employee
	 public void deleteEmp() {
		 System.out.println("Enter Id: ");
		 id=sc.nextInt();
		 boolean found=false;
		 Employee empdelete=null;
		 for(Employee emp:empset) {
			 if(emp.getId()==id) {
				 empdelete=emp;
				 found=true;
			 }
		 }

		 if(!found) {
				System.out.println("Employee with is id is not  present");
			}else
			{
				empset.remove(empdelete);
				System.out.println("Employee details deleted Successfully!!");

			}
	 }
	 //ADDemployee
	 public void addEmp() {
		 System.out.println("Enter id:");
		 id=sc.nextInt();
		 System.out.println("Enter name:");
		 name=sc.next();
		 System.out.println(" Enter age:");
		 age=sc.nextInt();
		 System.out.println("Enter designation:");
		 designation=sc.next();
		 System.out.println("Enter department:");
		 department=sc.next();
		 System.out.println("Enter salary:");
		 salary=sc.nextDouble();
Employee emp=new Employee(id, name, age, department, department, salary);
empset.add(emp);
System.out.println("Employee added successfully!!");

		
	 }
	 
}
	 
	 
	 
	 

			 
			 
 
