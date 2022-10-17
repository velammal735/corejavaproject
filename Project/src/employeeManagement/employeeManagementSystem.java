package employeeManagement;
import java.util.ArrayList;
import java.util.Scanner;

	public class employeeManagementSystem {

		public static void main(String[] args) {

			ArrayList<employee> al=new ArrayList<>();
			int id;
			String name;
			String age;
			int  salary;
			String mail_id;
			long contact_no;
			int ch;
			Scanner sc =new Scanner(System.in);
			while(true) {
				System.out.println("Press 1 to add employee");
				System.out.println("Press 2 to display employeet");
				System.out.println("Press 3 to searchemployee");
				System.out.println("Press 4 to deleteemployee");
				System.out.println("Press 5 to exit");
				System.out.println("Enter your choice");
				ch = sc.nextInt();
				switch(ch)
				{ 
				case 1:
					System.out.println("Enter ID :");
					id = sc.nextInt();
					System.out.println("Enter Name :");
					name = sc.next();
					System.out.println("Enter salary :");
					salary = sc.nextInt();
					System.out.println("Enter Contact_No :");
					contact_no = sc.nextLong();
					System.out.println("Enter Email_ID :");
					mail_id = sc.next();
					al.add(new employee(id, name, salary, contact_no, mail_id));
					break;
				case 2:
					for(int i=0;i<al.size();i++)
					{
					System.out.println("employee record"+(i+1));
					System.out.println("employee id:"+al.get(i).getid());
					System.out.println("employee name:"+al.get(i).getName());
					System.out.println("employee age:"+al.get(i).getAge());
					System.out.println("employee salary:"+al.get(i).getSalary());
					System.out.println("employee mail_id:"+al.get(i).getmail_id());
					System.out.println("employee contact_no:"+al.get(i).getcontact_no());

					}
					break;
				case 3:
					
					System.out.println("Enter to search a employee detail");
					name = sc.next();
					for (int i = 0; i < al.size(); i++) {
						if(al.get(i).getName().contains(name)) {
						System.out.println("employee record" + (i + 1));
						System.out.println("employee id:" + al.get(i).getid());
						System.out.println("employee name:" + al.get(i).getName());
						System.out.println("employee age:" + al.get(i).getAge());
						System.out.println("employee salary:" + al.get(i).getSalary());
						System.out.println("employee mail_id:" + al.get(i).getmail_id());
						System.out.println("employee contact_no:" + al.get(i).getcontact_no());
					}
					}
					break;
				
				case 4:
					System.out.println("Enter the employee name for delete");
					name = sc.next();
					int search=0;
				for (int i = 0; i < al.size(); i++) {
					if(al.get(i).getName().contains(name)) {
						System.out.println("employee record:"+(++search));
							al.remove(i);
						}}
					if(search==0) {
						System.out.println("No record found");	
					}else
					{
						System.out.println("Record has been deleted successfully");
					}
					break;
				case 5:
				 System.out.println("Enter the Employee ID to search :");
				id = sc.nextInt();
				int i=0;
				for(employee e1: al)
				{
					if(id == e1.id)
					{
						System.out.println(e1+"\n");
						i++;
					}
				}
				if(i == 0)
				{
					System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
				}
				break;
						
//					System.out.println("Enter the employee name to search");
//					name = sc.next();
//					System.out.println("Enter the employee's age");
//					age=sc.next();
//					for (int i = 0; i < al.size(); i++) {
//						if(al.get(i).getName().contains(name)) {
//							employee e1=al.get(i);
//							e1.setAge(age);
//			                al.set(i, e1);
//						}
//					}
//					
//				break;
//			
				case 6:
					System.exit(0);
				default: {
					System.out.println("Invalid choice...Please make a valid choice");
				}
				}
			}
		}
	}
	

				

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

