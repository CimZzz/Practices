package designpattern.structure.facade;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderSystem implements ReaderSystem{

	@Override
	public Reader createReader(InputStream inputStream) {
		return new BufferedReader(new InputStreamReader(inputStream));
	}
	
}
