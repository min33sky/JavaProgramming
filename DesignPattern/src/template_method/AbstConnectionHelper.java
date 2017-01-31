package template_method;

public abstract class AbstConnectionHelper {

	/*
	 * 외부에서 사용은 막고 하위에서는 구현해야되기 때문에 proteced 제한자 사용
	 * 알고리즘을 여러 메서드로 분할한다.
	 */
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	/*
	 *  Template Method
	 *  구현된 알고리즘을 사용하는 메서드
	 */
	public String requestConnection(String encordedInfo){
		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encordedInfo);
		// 반환된 것을 가지고  ID, Password를 할당한다. 
		String id = "aaa";
		String password = "bbb";

		if(!authentication(id, password)){
			throw new Error("아이디 암호 불일치");
		}

		String userName = "userName";
		int i = authorization(userName);

		switch(i){
			case -1:
				throw new Error("셧다운");
			case 0: // 게임 메니저
				System.out.println("게임 메니저");
				break;
			case 1: // 유료 회원
				break;
			case 2:	// 무료 회원
				break;
			case 3:	// 권환 없음
				break;
			default:	// 기타
				break;
		}

		return connection(decodedInfo);
	}

}
