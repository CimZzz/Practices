package designpattern.structure.facade;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterSystem implements WriterSystem{

	@Override
	public Writer createWriter(OutputStream outputStream) {
		return new PrintWriter(outputStream);
	}

}
