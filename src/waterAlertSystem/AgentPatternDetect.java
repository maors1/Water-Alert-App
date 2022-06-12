package waterAlertSystem;

public class AgentPatternDetect extends Agent {
	
	private int arrLastIndex = 0;

	public AgentPatternDetect(String agentType, String agentName,
			Informative destination) {
		super(agentType, agentName, destination);
		// TODO Auto-generated constructor stub
	}
	public void eventProcessing(){
		for (int i = arrLastIndex ; i < super.data.size(); i++, arrLastIndex++) {
			double resault = super.data.get(i).getData1()*0.3+(100-super.data.get(i).getData2())*0.7;
			double check = super.data.get(i).getData1();
			if(resault >70){
				super.destination.addData(new Event("waterAlert", resault));
			}
		}
		
		
	}
}