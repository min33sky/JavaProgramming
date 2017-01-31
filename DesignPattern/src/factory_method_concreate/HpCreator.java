package factory_method_concreate;

import java.util.Date;

import factory_method_framework.Item;
import factory_method_framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("Load Information of a HP Recovery Potion in DB");
	}

	@Override
	protected void createItemLog() {
		System.out.println("Make a new HP recovery potion... " + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}
	
}
