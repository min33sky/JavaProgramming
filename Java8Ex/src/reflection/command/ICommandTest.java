package reflection.command;

import java.util.HashMap;
import java.util.Map;

public class ICommandTest {
	public static void main(String[] args) throws Exception{
		String[] classes = {"reflection.command.StudyCommand", 
							"reflection.command.CleanupCommand",
							"reflection.command.CookCommand"};
		String[] key = {"/study", "/cleanup", "/cook"};
		
		Map<String, ICommand> map = new HashMap<String, ICommand>();
		
		/*
		 * Reflection을 이용해서 Instance를 생성해서 Map에 삽입
		 */
		for(int i=0; i<classes.length; i++){
			map.put(key[i], (ICommand)(Class.forName(classes[i]).newInstance()));
		}
		
		String target = "/cook";
		
		ICommand targetCmd = map.get(target);
		
		targetCmd.doJob();
	}
}
