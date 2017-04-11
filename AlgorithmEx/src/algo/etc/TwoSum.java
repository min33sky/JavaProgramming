package algo.etc;

import java.util.HashMap;
import java.util.Map;

/*
	LeetCode: Two Sum
	http://blog.naver.com/madplay/220859554363
 */
public class TwoSum {
	/*
	  Example:
	  Given nums = [2, 7, 11, 15], target = 9
	  Because nums[0] + nums[1] = 2 + 7 = 9
	  return [0, 1].
	 */
	public static int[] solution(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		/*
		 * 목표값에서 배열값을 뺀 값이 배열에 있는지를 확인한다.
		 * Map에 해당값이 있을시는 그값의 인덱스값과 해당 인덱스값을 리턴하고
		 * 해당값이 없을때에는 Map에다가 값을 추가해놓는다.
		 * 
		 */
		for (int i = 0; i < nums.length; i++) {
			int otherValue = target - nums[i];
			if (map.containsKey(otherValue)) {	
				return new int[] { map.get(otherValue), i };	// 배열을 리턴
			} 
			map.put(nums[i], i);	// map.put(배열값, 인덱스)
		}

		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int[] solution = solution(arr, 9);
		
		for(int i=0; i<solution.length; i++){
			System.out.print(solution[i] + " ");
		}
	}
}
