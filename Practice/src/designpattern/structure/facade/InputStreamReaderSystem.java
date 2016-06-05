package designpattern.structure.facade;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderSystem implements ReaderSystem{

	@Override
	public Reader createReader(InputStream inputStream) {
		return new InputStreamReader(inputStream);
	}
	
}
