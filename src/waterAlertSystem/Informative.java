package waterAlertSystem;

import java.util.ArrayList;

public abstract class Informative {
	
	protected ArrayList<Event> data = new ArrayList<Event>();

	public ArrayList getData() {
		return data;
	}

	public void addData(Event o) {
		data.add(o);
	}

}


