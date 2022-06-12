package waterAlertSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventConsumer alertConsumer = new EventConsumer("North Province");
		AgentPatternDetect waterAlert = new AgentPatternDetect("pattern detect", "waterAlert", alertConsumer);
		AgentCompose makePairs = new AgentCompose("compose", "makePairs", waterAlert);
		EventProducer fieldSensor = new EventProducer("temperatureSensor", makePairs, "FieldSensor");
		long startTime = System.currentTimeMillis();
		while(System.currentTimeMillis()-startTime <360000){
			long loopStartTime = System.currentTimeMillis();
			fieldSensor.eventsProducing(10);
			makePairs.eventProcessing(500, "first"); //can change repeated policy between First and Every.
			waterAlert.eventProcessing();
			while (((double)System.currentTimeMillis()-loopStartTime) < 2000){
			}
		}
	}
}
