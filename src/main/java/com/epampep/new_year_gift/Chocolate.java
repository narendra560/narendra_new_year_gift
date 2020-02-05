package com.epampep.new_year_gift;

public class Chocolate  {
  String type;
  String name;
  int cost;
  Chocolate()
  {
	  
  }
  Chocolate(String name,String type,int cost)
  {
	  this.name=name;
	  this.type=type;
	  this.cost=cost;
  }
   int weight(Chocolate chocolates[])
  {
	  int weight=0;
	  for(int i=0;i<chocolates.length;i++)
	  {
		  weight+=chocolates[i].cost;
	  }
	  return weight;
  }
}