package factory_method_concreate;

import factory_method_framework.Item;
import factory_method_framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
