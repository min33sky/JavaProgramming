package algo.etc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchEx {
	
	// 큐와 확인용 셋 생성
	public static HashMap<String, String[]> graph = new HashMap<>();
	public static Queue<String> search_queue = new LinkedList<>();	// 이웃들을 담을 큐
	public static HashSet<String> searched = new HashSet<>();		// 이미 검색한 사람
	
	public static void main(String[] args) {
		
		graph.put("나", new String[]{"앨리스", "밥", "클레어"});
		graph.put("밥", new String[]{"아누지", "패기"});
		graph.put("앨리스", new String[]{"패기"});
		graph.put("클레어", new String[]{"톰", "조니"});
		graph.put("아누지", new String[]{});
		graph.put("패기", new String[]{});
		graph.put("톰", new String[]{});
		graph.put("조니", new String[]{});
		
		System.out.println("********** 검색 **********");
		System.out.println(breadthFirstSearch("나"));
	}

	public static boolean breadthFirstSearch(String name) {
		// 현재 선택된 사람의 이웃들을 큐에 넣는다.
		String[] list = graph.get(name);
		for (int i = 0; i < list.length; i++) {
			search_queue.add(list[i]);
		}
		
		// 큐가 비을 때까지 반복
		while(!search_queue.isEmpty()){
			
			// 큐에서 사람 1명을 Dequeue한다.
			String person = search_queue.remove();
			// 이미 검색한 사람이 아닐경우에 판매원인지 확인을 하고
			// 아닐경우에는 이미 검색한 목록에 추가하고  이웃들을 큐에 추가한다. 
			if(!searched.contains(person)){
				if(confirmSeller(person)){
					System.out.println(person + "가 망고 판매원입니다...");
					return true;
				}else{
					String[] neighbors = graph.get(person);
					for (int i = 0; i < neighbors.length; i++) {
						search_queue.add(neighbors[i]);
					}
					searched.add(person);
				}
			}
		}
		System.out.println("망고 판매원이 없습니다.");
		return false;
	}

	public static boolean confirmSeller(String person) {
		return person.equals("조니");
	}
}
