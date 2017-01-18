package com.werkout.interfaces;



public interface Workout {
	
	public int getID();
	public Media getMedia(); 
	public int getDifficulty(); //in percentage (1..100)
	public WorkoutArea getWorkoutType(); //CHEST,LEGS, CARDIO 
}
