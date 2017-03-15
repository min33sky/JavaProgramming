package chapter02;

public class Person {
	private Role role;
	
	public void setRole(Role role){
		this.role = role;
	}
	
	public void doIt(){
		role.doIt();
	}
}
