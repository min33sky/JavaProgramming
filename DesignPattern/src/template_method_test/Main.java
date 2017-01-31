package template_method_test;

import template_method.AbstConnectionHelper;
import template_method.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		AbstConnectionHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
	}
}
