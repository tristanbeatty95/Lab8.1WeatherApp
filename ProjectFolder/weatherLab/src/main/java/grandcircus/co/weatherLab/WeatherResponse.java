package grandcircus.co.weatherLab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

	private Location location;
	private Time time;
	private Data data;
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	
	
}
