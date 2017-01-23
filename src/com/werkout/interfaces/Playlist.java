package com.werkout.interfaces;

public interface Playlist {
	public boolean isEmpty();	
	public WorkoutPlaylistMedia first();
	public WorkoutPlaylistMedia next();
	public boolean isLast();
	public WorkoutPlaylistMedia currentItem();
	
	public void addPlaylistMedia(WorkoutPlaylistMedia playlistMedia, int position);
	public void removePlaylistMedia(int position);
	public void movePlaylistMedia(int position, int newPosition);
	
	public String getXML();
	
	
}
