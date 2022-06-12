package waterAlertSystem;

import java.util.ArrayList;

public class EventConsumer extends Informative {
	
	private String eventConsumerName;
	private Actuator action = new Actuator();

	public EventConsumer(String ecName) {
		// TODO Auto-generated constructor stub
		this.eventConsumerName = ecName;
	}
	public void addData(Event o){
		super.addData(o);
		if(o.getData1()>75){
			//System.out.println("******** Water Alert *********\n"+"("+o.getData1()+")\n");
			action.runAction(o.getData1());
			
		}
		else System.out.println("\nValue Sent to The Event Consumer - " + o.getData1()+ "\n");
		
	}

}
