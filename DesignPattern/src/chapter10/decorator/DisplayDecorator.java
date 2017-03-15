package chapter10.decorator;

/**
 * 다양한 추가 기능에 대한 공통 클래스
 * @author Heo-MH
 *
 */
public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}
	
	@Override
	public void draw() {
		decoratedDisplay.draw();
	}
}
