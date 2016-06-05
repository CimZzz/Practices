package designpattern.structure.facade;

public class CommonSystemKit extends SystemKit{

	static{
		new CommonSystemKit();
	}
	
	private CommonSystemKit() {
		register(this);
	}

	@Override
	public ReaderSystem createReaderSystem() {

		return new InputStreamReaderSystem();
	}

	@Override
	public WriterSystem createWriterSystem() {

		return new OutputStreamWriterSystem();
	}

}
