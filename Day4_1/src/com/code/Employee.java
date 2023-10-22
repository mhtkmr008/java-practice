package com.code;

public class Employee {
	

		
		//instance variable:copy created per object
		private int empid;
		private String name;
		private String city;
		private double salary;
		
		//bonus must be accessed by all instances
		//sigle copy must be there

		//static variable:single copy per class
		//all instances can access static variable
		
		private static double bonus;

		//static block:specially used for static member initialization
		//how to write?   ans:static{}
		//when static block get called
		
		static {
		System.out.println("---static block1 Employee------");
		bonus=10000;
		}
		//can we wirte more than one static block
		//Ans:Yes
		
		static {
			System.out.println("---static block2 Employee------");	
		}
		static {
			System.out.println("---static block3 Employee------");	
		}
		//can we initialize data member(instance varibale )in static block
		//NO
		
		
		//to initialise data memebrs(instance variable)
		//create constr
		//whenever new employee object get created 
		//constructor will get invoked
		public Employee(int empid, String name, String city, double salary) {
			 System.out.println("--Parameter Constructor Employee----");
			this.empid = empid;
			this.name = name;
			this.city = city;
			this.salary = salary;
			//
			//bonus=9000;
			 
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public int getEmpid() {
			return empid;
		}



		public double getSalary() {
			return salary;
		}
		
		
		public String toString() {
			
			System.out.println("---Employee.toString()---");
			return empid+"    "+name+"     "+"   "+city+ "   "+  salary+"     "+bonus;
			
		}
		
		
		//static variables are accessible in instance methods(non-static methods)
		
		//non-static variable(instance variables) are NOT accessible in
		//static methods
		//this ref will never get pass to static method
		
		//can we write static methods
		//YES
		public static void showBonus() {
			//this.empid=100;//Cannot use this in a static context
			System.out.println("----Bonus="+bonus);
		}
		
		
		public static void changeBonus()
		{
			bonus=bonus-2000;
		}
		
		
		
	}

}
