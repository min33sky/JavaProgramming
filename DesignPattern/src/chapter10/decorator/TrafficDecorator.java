package chapter10.decorator;
/**
 * 교통량 표시를 추가하는 클래스
 * @author Heo-MH
 *
 */
public class TrafficDecorator extends DisplayDecorator{

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw();
		drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
