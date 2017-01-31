package reflection.command;

public class CleanupCommand implements ICommand{

	@Override
	public void doJob() {
		System.out.println("Clean UP!");
	}

}
