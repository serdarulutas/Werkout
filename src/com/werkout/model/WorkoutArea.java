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
}
