package com.werkout.model;
import java.util.HashMap;

public class Exercise {
	private String id;
	private int duration; //seconds
	private int intensity; //1-10, 10 hardest
	private HashMap<String, FocusArea> focusAreas;
	private HashMap<String, Exercise> cooldownExercises;
	private ExerciseType exerciseType;
	private Media media;
	
	public Exercise(){
		focusAreas = new HashMap<String, FocusArea>();
		cooldownExercises = new HashMap<String, Exercise>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		if ((duration > Constants.DURATION_MAX)||(duration<Constants.DURATION_MIN))
			duration = Constants.DURATION_DEFAULT;
		this.duration = duration;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		if ((intensity<1)||(intensity>10))
			intensity = 1;
		this.intensity = intensity;
	}
	public ExerciseType getExerciseType() {
		return exerciseType;
	}
	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	
	public void addFocusArea(FocusArea fa){
		focusAreas.put(fa.getId(), fa);
	}
	public void addCooldownExercise(Exercise cooldownEx){
		cooldownExercises.put(cooldownEx.getId(), cooldownEx);
	}
	
	
}
