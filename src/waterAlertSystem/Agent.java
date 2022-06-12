package waterAlertSystem;

import java.util.ArrayList;
import java.util.Date;

public abstract class  Agent extends Informative {
	
	private String agentType;
	private String agentName;
	private Date createTime;
	protected Informative destination;

	public Agent(String agentType, String agentName, Informative destination) {
		// TODO Auto-generated constructor stub
		super();
		this.agentType = agentType;
		this.agentName = agentName;
		this.destination = destination;
		this.createTime = new Date();
	}
	private void eventProcessing(){
		//Logic
	}

}
