package tinah.iuea.ug.com;

import java.util.Scanner;

public class CourseWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
      
        int score;
        String name;
        int t=26;
        int z=6;
        
        for(int i=0;i<t;i++) {
        	System.out.println("\nEnter your Name: ");
        	
        	name=scn.next();
        	
        	for(int k=0;k<z;k++) {
        	System.out.print("Enter your Mark: ");
        	score=scn.nextInt();
        	
        	if(score >=80 && score <=100) {
        		System.out.println(" Grade is A ");
        	}
        	else if(score>=75 && score<=79) {
        		System.out.println(" Grade is B+ ");
        	}
        	else if(score>=70 && score<=74) {
        		System.out.println(" Gradeis B ");
        	}
        	else if(score>=65 && score<=69) {
        		System.out.println(" Grade is C+ ");
        	}
        	else if(score>=60 && score<=64) {
        		System.out.println(" Grade is C ");
        	}
        	else if(score>=55 && score<=59) {
        		System.out.println(" Grade is D+ ");
        	}
        	else if(score>=50 && score<=54) {
        		System.out.println(" Grade is D ");
        	}
        	else {
        		System.out.println(" Grade is F ");
        	}
        	
         }
        	
        }
        
	  }
   }