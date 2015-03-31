package com.panelcomposer.enumerations;

   /** 
   File generated using Kroki EnumGenerator 
   @Author KROKIteam 
   **/

public enum OrderStatusOrderEnum {
	ORDERING("Ordering"),
	FINISHED("Finished"),
	CANCELED("Canceled"),
	SHIPPED("Shipped");
	
	String label;
	
	OrderStatusOrderEnum() {
	}
	
	OrderStatusOrderEnum(String label) {
		this.label = label;
	}
	
}
