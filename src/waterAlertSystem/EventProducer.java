package waterAlertSystem;

import java.util.Date;
import java.util.Timer;

public class EventProducer {

	private String producerType = "Abstract";
	private Agent sendToAgent;
	private String producingEventType;

	public EventProducer(String producerType, Agent sendToAgent, String eventType) {
		// TODO Auto-generated constructor stub
		this.producerType = producerType;
		this.sendToAgent = sendToAgent;
		this.producingEventType = eventType;
	}
	public void eventsProducing(int numberOfevents){
		for (int i = 0; i < numberOfevents ; i++) {
			boolean dis = Math.random() > 0.5 ;
			if(dis){
				sendToAgent.addData( new Event("temperature" , 50-Math.random()*30));
			}
			else{
				sendToAgent.addData( new Event("humidity",100-Math.random()*50));
			}
		}
	}
}
