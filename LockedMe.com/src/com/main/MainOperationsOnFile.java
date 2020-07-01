package com.main;
import java.util.Scanner;
import com.operations.*;

public class MainOperationsOnFile {

	public static void main(String[] args) {
		
		OperationsOnFile o = new OperationsOnFile();
		System.out.println("***************************Welcomee********************************");
		System.out.println("--------------------Welcome to LockedMe.com-------------------------");
		System.out.println("Hello User. Kindly enter any of the options below:-");
		int x=0;
		int y=0;
		do {
		System.out.println("----------------------File Handling Options---------------------------");	
		System.out.println("1. Retriving the File names Ascending Order:- ");
		System.out.println("2. File Manipulation like Add, Delete, Search:- ");
		System.out.println("3. Close the application");
	
		Scanner sc = new Scanner(System.in);
		 x = sc.nextInt();
		 
		 switch(x) {
		 case 1: 
			 o.sortingInAsce();
			 break;
		 case 2:
			 System.out.println("Kindly Enter any of the options below:- ");
			do{
				 System.out.println("1. Add a File of your choice.");
				 System.out.println("2. Delete a File of your choice.");
				 System.out.println("3. Search a File of your choice");
				 System.out.println("4. Return back to the Main Menu");
				 y = sc.nextInt();
				 switch(y) { 
				 case 1:
					 o.addingFileToDir();
					 break;
				 case 2:
					 o.deleteFileInDir();
					 break;
				 case 3:
					 o.searchingFileInDir();
					 break;
				 case 4:
					 break;
				 default:
					 System.out.println("Kindly Enter a valid option !!");
				 }
			 }while(y!=4);
			 break;
			 
		 	case 3: 
			System.out.println("Exit");
			 break;
			 default: System.out.println("Kindly Enter a valid option !!");
		 }
		}while(x!=3);
	}	
}
