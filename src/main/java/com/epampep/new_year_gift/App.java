package com.epampep.new_year_gift;

/**
 * A gift may contain sweets and chocolates
 * weight of a weights defined as sum of costs of chocolates and sweets
 * weight of a chocolate is cost of the chocolate and same for the sweet too
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	int num_sweets;
    	int num_chocolates;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter total number of Sweets in the Gift:");
    	num_sweets=sc.nextInt();
    	Sweets s[]=new Sweets[num_sweets];
    	for(int i=0;i<num_sweets;i++)
    	{
    		System.out.println("Enter details of sweet "+(i+1)+":");
    		System.out.print("Name:");
    		String sname=sc.next();
    		System.out.print("Quantity:");
    		int squantity=sc.nextInt();
    		System.out.print("Cost:");
    		int scost=sc.nextInt();
    		s[i]=new Sweets(sname,squantity,scost);
    	}
    	System.out.println("Enter total number of Chocolates in the Gift:");
    	num_chocolates=sc.nextInt();
    	Chocolate c[]=new Chocolate[num_chocolates];
    	for(int i=0;i<num_chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cname=sc.next();
    		System.out.print("Type:");
    		String type=sc.next();
    		System.out.print("Cost:");
    		int ccost=sc.nextInt();
    		c[i]=new Chocolate(cname,type,ccost);
    	}
    	Gift ng=new Gift(s,c);
    	ng.find_weight();
    	ng.sort_chocolates();
    	ng.find_candies();
    	sc.close();
    }
}
