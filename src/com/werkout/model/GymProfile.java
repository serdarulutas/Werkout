package com.werkout.interfaces;



public interface GymProfile{
	//Iterators
	public boolean isEmpty();	
	public Equipment first();
	public Equipment next();
	public boolean isLast(); //returns if the current item is the last one.
	public Equipment currentItem();
	
	//Modifications. Order is not important
	public void addEquipment(Equipment equipment);
	public void removeEquipment(Equipment equipment);
	public void setName(String name);	
	
	//return xml for the configuration file. 
	public String toXML();
}
