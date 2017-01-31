package factory_method_concreate;

import factory_method_framework.Item;

public class HpPotion implements Item{

	@Override
	public void use() {
		System.out.println("HP Recovory!");
	}
	
}
