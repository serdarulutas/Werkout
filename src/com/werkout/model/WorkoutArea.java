package com.werkout.model;

import java.util.HashMap;

enum Equipment_Status{
	FULL_EQUIPMENT, SOME_EQUIPMENT, NO_EQUIPMENT
}

public class WorkoutArea {
	private String id;
	private String name;
	private HashMap<String, WorkoutEquipment> equipment;
	private Equipment_Status equipStatus;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Equipment_Status getEquipStatus() {
		return equipStatus;
	}
	public void setEquipStatus(Equipment_Status equipStatus) {
		this.equipStatus = equipStatus;
	}
	public void addEquipment(WorkoutEquipment equip){
		if (equipment == null)
			equipment = new HashMap<String, WorkoutEquipment>();
		equipment.put(equip.getId(), equip);
	}	
}
