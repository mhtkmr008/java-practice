package com.tester;
import com.code.Point2D;
import java.util.Scanner;
public class TestPoint2D {

	public static void main(String[] args) {
		
		int choice,count,index=0;
		Point2D [] arr=new Point2D[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 Show 2:Add 3:Exit");
		do
		{
		System.out.println("Enter a choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			for (Point2D p:arr)
			{
				System.out.println(p);
			}
		
		break;
		
		case 2:
			if(index<arr.length)
			{
			System.out.println("Enter the Points");
			
			{
				arr [index]=new Point2D(sc.nextInt(),sc.nextInt());
				index++;
			}
			}
			else
			{
				System.out.println("Array is full");
			}
			
		break;
		
		default:
			System.out.println("Exit");
			
			
		}
		
		

	}while(choice!=3);

}
}

