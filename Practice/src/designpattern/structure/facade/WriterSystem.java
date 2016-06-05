package designpattern.structure.facade;

import java.io.OutputStream;
import java.io.Writer;

public interface WriterSystem {
	Writer createWriter(OutputStream outputStream);
}
