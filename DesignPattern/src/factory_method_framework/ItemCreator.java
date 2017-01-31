package factory_method_framework;

public abstract class ItemCreator {
	
	// Factory Method -> Template Method
	public Item create(){
		Item item;
		// Step1
		requestItemsInfo();
		// Step2
		item = createItem();
		// Step3
		createItemLog();
		
		return item;
	}
	
	// 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청한다.
	abstract protected void requestItemsInfo();
	// 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성
	abstract protected void createItemLog();
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
