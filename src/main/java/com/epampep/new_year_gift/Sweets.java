package com.epampep.new_year_gift;
public class Sweets extends Chocolate{
  int cost;
  int quantity;
  String name;
  Sweets()
  {
	  
  }
  Sweets(String name,int quantity,int cost)
  {
	  this.name=name;
	  this.cost=cost;
	  this.quantity=quantity;
  }
    int  weight(Sweets sweets[])
  {
	  int weight=0;
	  for(int i=0;i<sweets.length;i++)
	  {
		  weight+=sweets[i].cost;
	  }
	  return weight;
  }
}
