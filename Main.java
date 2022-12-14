package com.jdbc.example;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		DBmanager db=new DBmanager();
////		db.insert();
//		db.readDataBase();
		while(true) {
			System.out.println("\n1. display\n2. insert\n3. update contact\n4. delete contact\n5. Exit\n\nEnter ur choice :");
			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
			switch(a){
			  case 1:
				db.readDataBase();
			    break;
			  case 2:
			    // code block
				db.insert();
			    break;
			  case 3:
				    // code block
				  db.update();
				  break;
			  case 4:
				    // code block
				  db.delete();
				  break;
			  case 5:
				  System.exit(0);

			}
		}

	}
}
