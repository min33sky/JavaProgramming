package chapter10.decorator;

/**
 * 차선 표시를 추가하는 클래스
 * @author Heo-MH
 *
 */
public class LaneDecorator extends DisplayDecorator {
	// 기존 표시 클래스의 설정
	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw();	// 설정된 기존 표시 기능을 수행
		drawLane();		// 추가적으로 차선 표시
	}
	
	private void drawLane(){
		System.out.println("\t차선 표시");
	}

}
