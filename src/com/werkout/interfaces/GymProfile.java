package com.werkout.interfaces;



public interface GymProfile{
	public boolean isEmpty();
	public Equipment first();
	public Equipment next();
	public Equipment currentItem();
	public boolean isLast(); //returns if the current item is the last one. 
	
	
}
