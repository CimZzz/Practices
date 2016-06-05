package designpattern.structure.facade;

import java.io.InputStream;
import java.io.Reader;

public interface ReaderSystem {
	Reader createReader(InputStream inputStream);
}
