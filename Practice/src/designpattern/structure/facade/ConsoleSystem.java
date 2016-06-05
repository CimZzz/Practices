package designpattern.structure.facade;

import java.io.Reader;
import java.io.Writer;

public class ConsoleSystem {
	/*
	 * LazyLoad
	 */
	private static ConsoleSystem facade;
	
	private ConsoleSystem()
	{
		
	}
	
	public static ConsoleSystem instance() {
		return facade == null ? facade = new ConsoleSystem() : facade;
	}
	
	public Reader openInputReader(SystemKit kit)
	{
		ReaderSystem system = kit.createReaderSystem();
		
		return system.createReader(System.in);
	}
	
	public Writer openOutputWriter(SystemKit kit)
	{
		WriterSystem system = kit.createWriterSystem();
		
		return system.createWriter(System.out);
	}
	
}
