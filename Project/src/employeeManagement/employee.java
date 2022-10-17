package employeeManagement;

public class employee {
		int id;
		String name;
		String age;
		int  salary;
		String mail_id;
		long  contact_no;
		
		public employee(int id2, String name2, int salary2, long contact_no2, String mail_id2) {
			super();
			}

		public int getid() {
			return id;
		}

		public void setid(int  id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}


		public String getAge() {
			return age;
		}


		public void setAge(String age) {
			this.age = age;
		}

		public int  getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		
	public String getmail_id() {
		return mail_id;
	}


	public void setmail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public long getcontact_no() {
		return contact_no;
	}


	public void setcontact_no(long   contact_no) {
		this.contact_no = contact_no;
	}

	}












