package com.tester;
import java.util.Scanner;
import com.code.VehicleManagement;

public class VehicleManagementTest {

	public static void main(String[] args) 
	{
		int choice,index=0;
		
		VehicleManagement [] vm=new VehicleManagement[10];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1: Show Vehicle 2:Add Vehicle 3: Edit Color 4:Edit price 5:Remove 6:Exit");
		
		do
		{
		System.out.println("Enter a choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			for(VehicleManagement v:vm)
			{
				System.out.println(v);
			}
			break;
		
		case 2:
			{
				if(index<vm.length)
				{
					vm[index]=new VehicleManagement(sc.nextInt(), sc.next(),sc.next(),sc.nextDouble());
					index++;
				}
				else
				{
					System.out.println("The array is full");
				}
			}
		}
		
		}while(choice!=6);
	}

}
