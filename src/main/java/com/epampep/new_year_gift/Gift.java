package com.epampep.new_year_gift;

public class Gift extends Sweets{
   Sweets sweets[];
   Chocolate chocolates[];
   int weight;
   Gift()
   {
	   
   }
   Gift(Sweets sweet[],Chocolate chocolates[])
   {
	  sweets=sweet;
	  this.chocolates=chocolates;
	  weight=0;
   }
   void sort_chocolates()
   {
	   int n=sweets.length;
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n-i-1; j++)
		   {
			   if(chocolates[j].cost>chocolates[j+1].cost)
			   {
				   Chocolate temp;
				   temp=chocolates[j];
				   chocolates[j]=chocolates[j+1];
				   chocolates[j+1]=temp;
			   }
		   }
	   }
   }
   public void find_candies()
	{
		System.out.println("Candies in the Children's Gift whose cost is less than 100 is:");
		for(int i=0;i<chocolates.length;i++)
		{
			if(chocolates[i].cost>=100)
			{
				break;
			}
			System.out.println("Name:"+chocolates[i].name);
			System.out.println("Type:"+chocolates[i].type);
			System.out.println("Cost:"+chocolates[i].cost);
		}
	}
   void find_weight()
   {
	   /*Polymorphism*/
	    weight=weight(sweets)+weight(chocolates);
		System.out.println("Total Weight of Children's gift is:"+weight);
   }
   
}
