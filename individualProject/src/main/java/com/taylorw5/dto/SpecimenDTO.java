package com.taylorw5.dto;

public class SpecimenDTO {

	// -------------------- data vars
	private int specimenID;
	private String latitude; 
	private String longitude;
	private String description;
	

	//	------------------- getters and setters
	public int getSpecimenID() {
		return specimenID;
	}
	public void setSpecimenID(int specimenID) {
		this.specimenID = specimenID;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// --------------------- custom get and set
	public void setLatitudeAndLongitude(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	// --------------------- overrides
	@Override 
	public String toString() {
		return specimenID + " " + latitude + " " + longitude + " " + description;
	}
}
