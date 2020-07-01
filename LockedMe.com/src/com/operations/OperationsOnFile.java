package com.operations;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OperationsOnFile {

	public void sortingInAsce() {
		File file = new File("C:/Users/hiral/");
			List<String> listFile = Arrays.asList(file.list());
			// By default arrays will be sorted in case-sentitive order..The below CASE_INSENTIVE_ORDER makes sure about the case insensitivity...
			Collections.sort(listFile, String.CASE_INSENSITIVE_ORDER);
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Sorting the Filenames in Ascending Order:- ");
			for(String s:listFile){
				System.out.println(s);
			}
	}
	
	public void addingFileToDir() {
		 
	      String path = ("C:/Users/hiral/");
	      System.out.println("Enter the name of the desired file to be Added to the directory:- ");
	      Scanner sc = new Scanner(System.in);
	      String a = sc.nextLine();
	      path = path + a;
	      System.out.println(path);
	      Path p = Paths.get(path);
	      File file = new File(path);
	     if (!Files.exists(p)) {
	          
	          try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("File not created, Please try again");
			}          
	          System.out.println("File created");
	      } else {
	          
	          System.out.println("File already exists");
	      }
	   }
	
	 public void deleteFileInDir() {

       String fileName = "";
       try {
               
       	String path = ("C:\\Users\\hiral\\");
               System.out.print(" Enter the name of the desired file to be Deleted from the directory :-");
               BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
               fileName = fileNameReader.readLine();
               String a = path+fileName;
               File directory = new File(path);
               File del = new File(a);
              
               File[] listOfFiles = directory.listFiles();
               for (File file : listOfFiles) {
                       String name = file.getName();
                       if (name.equals(fileName)) //Using the .equals to take into consideration the case-sensitivity so that correct file is deleted  
                    	   {
                       	del.delete();
                               System.out.println("The file " +name +" is Deleted");
                               return;     
                       }
               }
               System.out.println(fileName + " not found in " + path +"  "+ "directory");

       } catch (IOException e) {
               e.printStackTrace();
               
       }
       catch(NullPointerException e) {
       	System.out.println("Enter proper file name !!");
       }
       catch (InputMismatchException e) {
           System.out.println(" Enter proper file name!!");
       }
	 }
	
	 public void searchingFileInDir() {

       String fileName = "";
       try {
               
       	String path = ("C:\\Users\\hiral\\");
               System.out.print(" Enter the File Name to be Searched :-");
               BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
               fileName = fileNameReader.readLine();
               File directory = new File(path);
               File[] listOfFiles = directory.listFiles();
               for (File file : listOfFiles) {
                       String name = file.getName();
                       if (name.equals(fileName)) //Using the .equals to take into consideration the case-sensitivity so that correct file is 
                       {
                    	   		System.out.println("Successful Operation ");
                                System.out.println(name+" File Found in the directory:-  "+directory);
                               return;
                       }
               }
               System.out.println("Unsuccessful Operation");
               System.out.println(fileName + " not found in " + path );

       } catch (IOException e) {
    		System.out.println("Enter proper file name");
               
       }
       catch(NullPointerException e) {
       	System.out.println("Enter proper file name");
       }
       catch (InputMismatchException e) {
           System.out.println(" Enter proper file name!!");
       }
	 }	
}
