package designpattern.structure.facade;

public class NormalSystemKit extends SystemKit{

	static{
		new NormalSystemKit();
	}
	
	private NormalSystemKit() {
		register(this);
	}

	@Override
	public ReaderSystem createReaderSystem() {

		return new BufferedReaderSystem();
	}

	@Override
	public WriterSystem createWriterSystem() {

		return new PrintWriterSystem();
	}

}
