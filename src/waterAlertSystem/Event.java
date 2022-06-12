package waterAlertSystem;

import java.util.Date;

public class Event {
	
	private static int IdCount = 1;
	private String eventTypeIdentifier = null ;
	//private boolean eventComposition = false;
	//private Date temporalGranularity;
	private String eventType;
	
	private Date ocourenceTime = null;
	private double data1;
	private double data2;
	
	public Event(String eventType, double data1) { //Data can be String
		// TODO Auto-generated constructor stub
		this.eventTypeIdentifier = (Event.IdCount++)+"";
		this.ocourenceTime = new Date();
		this.eventType = eventType;
		this.data1 = data1;
	}
	
	public Event(String eventType, double data1, double data2) {
		this(eventType, data1);
		this.data2 = data2;
	}

	public double getData1() {
		return data1;
	}

	public double getData2() {
		return data2;
	}
	
	/*public void setData(String data) {
		this.data = data;
	}
*/
	public Date getOcourenceTime() {
		return ocourenceTime;
	}

	public void setOcourenceTime(Date ocourenceTime) {
		this.ocourenceTime = ocourenceTime;
	}

	public String getEventType() {
		return eventType;
	}
}
