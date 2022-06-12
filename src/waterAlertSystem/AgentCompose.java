package waterAlertSystem;

import java.util.Date;

public class AgentCompose extends Agent {

	private int arrLastIndex = 0;

	public AgentCompose(String agentType, String agentName, Informative destination) {
		// TODO Auto-generated constructor stub
		super(agentType, agentName, destination);
	}

	//Override
	public void eventProcessing(int timeGap, String repeatdedPolicy){
		int numOfComparsion;
		int startIndex;
		if(repeatdedPolicy.equalsIgnoreCase("every")) {
			numOfComparsion = super.data.size();
			startIndex = arrLastIndex;
		}
		else {
			startIndex = arrLastIndex;
			numOfComparsion = arrLastIndex+1;
		}
		for (int i = startIndex ; i < numOfComparsion; i++) {
			Event ev=super.data.get(i);
			for (int j = i+1; j < super.data.size() ; j++) {
				if((ev.getOcourenceTime().getTime() - super.data.get(j).getOcourenceTime().getTime() < timeGap) &&
						!(ev.getEventType().equals(super.data.get(j).getEventType()))) {
					//send to pattern detect agent
					super.destination.addData(new Event("pairs",ev.getData1(),super.data.get(j).getData1()));

					System.out.println("Matching Pairs - <"+ev.getData1() +"-"+super.data.get(j).getData1()+">");

					break; //cancel this break to change repeated policy to every
					//POLICIES... 
				}
			}
		}
		arrLastIndex++;
		//super.data.removeAll(data);

	}
}
