package reflection.command;

public class CookCommand implements ICommand{

	@Override
	public void doJob() {
		System.out.println("Cook.....");
	}

}
