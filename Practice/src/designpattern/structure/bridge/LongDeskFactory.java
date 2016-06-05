package designpattern.structure.bridge;

public class LongDeskFactory extends DeskFactory {

	@Override
	public Desk createDesk() {
		return new LongDesk();
	}

}
