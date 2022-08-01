package grandcircus.co.weatherLab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

	private String elev;
	private String latitude;
	private String longitude;
	@JsonProperty("Temp")
	private String temp;
	
	public String getElev() {
		return elev;
	}
	public void setElev(String elev) {
		this.elev = elev;
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
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	
}
