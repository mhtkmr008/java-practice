package com.tester;
import com.code.Employee;


	public class TestStatic {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//
			
			//to access static methods
			//ClassName.static_method();
			
			Employee.showBonus();//10000
			System.out.println();
			Employee e1=new Employee(11, "abc", "pune", 30000);
			e1.setCity("Mumbai");
			System.out.println(e1);//10000
			 
			Employee e2=new Employee(202, "Vaishali", "City", 34000);
			System.out.println(e2);//10000
			
			Employee.changeBonus();
			Employee.showBonus();//8000
			System.out.println();
			System.out.println(e1);
			System.out.println(e2);
		}

	}

}
