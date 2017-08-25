package com.werkout.model;

import java.util.Comparator;
/*
 * Examples: Legs, Arms, Abs, Cardio, Chest etc.
 * Each exercise one or more exercise area. 
 */

enum Area{
	LEGS,ABS,CARDIO,CHEST,ARMS,WHOLEBODY
}

public class FocusArea implements Comparable<FocusArea>{
	private String id;
	private Area area;  
	
	public FocusArea(String id, Area area)
	{
		setArea(area);
		setId(id);
	}
	
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int compareTo(FocusArea o) {
		if (o==null) 
			return 1;
		return getId().compareTo(o.getId());
	}
	
}
