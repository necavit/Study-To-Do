package almartapps.studytodo.model;

public class Time {

	/**
	 * Intended to be in the range [0,23]
	 */
	private int hour;
	
	/**
	 * Intended to be in the range [0,59]
	 */
	private int minute;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}
