package strategy;

public class MainClass {
	
	public static void main(String[] args) {
		GameCharactor charactor = new GameCharactor();
		
		charactor.attack();
		
		charactor.setWeapon(new Knife());
		charactor.attack();
		
		charactor.setWeapon(new Sward());
		charactor.attack();

		charactor.setWeapon(new Ax());
		charactor.attack();
	}
}
