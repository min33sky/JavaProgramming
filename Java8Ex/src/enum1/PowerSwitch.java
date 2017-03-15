package enum1;

public enum PowerSwitch {
	ON("켜짐"), 
	OFF("꺼짐");
	
	private String krName;
	private PowerSwitch(){}
	private PowerSwitch(String krName){
		this.krName = krName;
	}
	
	public String getKrName(){
		return krName;
	}
	
	public PowerSwitch opposite(){
		if(this == PowerSwitch.ON)
			return PowerSwitch.OFF;
		else
			return PowerSwitch.ON;
	}
}
