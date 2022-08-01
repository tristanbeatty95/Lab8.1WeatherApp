package grandcircus.co.weatherLab;

public class UpcomingWeather {

	private String startPeriodName;
	private String temperature;
	private String text;
	
	public String getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(String startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public UpcomingWeather(String startPeriodName, String temperature, String text) {
		super();
		this.startPeriodName = startPeriodName;
		this.temperature = temperature;
		this.text = text;
	}
}
