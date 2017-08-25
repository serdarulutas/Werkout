package com.werkout.model;
/*
 * Examples: Exercise, Cooldown, Rest. 
 */

enum Type{
	EXERCISE, REST, COOLDOWN, OTHER;
}

public class ExerciseType implements Comparable<ExerciseType> {
	private String id; 
	private String area;
	private Type type;
	
	public ExerciseType(){
		this("");
	}
	public ExerciseType(String id){
		this(id,"");
	}
	public ExerciseType(String id,String area){
		
	}
	public ExerciseType(String id,String area, Type type){
		setId(id);
		setArea(area);
		setType(type);
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public int compareTo(ExerciseType o) {
		if (o == null)
			return 1;
		return this.getId().compareTo(o.getId());
	}
	
}
