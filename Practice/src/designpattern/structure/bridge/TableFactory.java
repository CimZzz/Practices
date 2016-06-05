package designpattern.structure.bridge;

public class TableFactory extends DeskFactory {

	@Override
	public Desk createDesk() {
		return new Table();
	}

}
