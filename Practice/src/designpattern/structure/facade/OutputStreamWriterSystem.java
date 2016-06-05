package designpattern.structure.facade;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterSystem implements WriterSystem{

	@Override
	public Writer createWriter(OutputStream outputStream) {
		return new OutputStreamWriter(outputStream);
	}

}
