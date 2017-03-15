package chapter07.light;

public class Light {
	private State state;	// 형광등의 상태
	
	public Light(){
		state = Off.getInstance();	// 형광등 초기 상태는 꺼져 있는 상태
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void on_button_pushed(){
		state.on_button_pushed(this);
	}
	
	public void off_button_pushed(){
		state.off_button_pushed(this);
	}
}
