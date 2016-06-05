package designpattern.behavioral.command;

public interface Command extends Cloneable{
	void execute();
	void unExecute();
	void redo();
	
	Command Clone();
}