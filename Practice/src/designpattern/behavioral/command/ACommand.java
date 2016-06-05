package designpattern.behavioral.command;

import java.util.Random;

public class ACommand implements Command{
	private char c;
	private int index;
	private StringBuilder builder;
	
	public ACommand(StringBuilder builder) {
		this.builder = builder;
	}
	
	
	
	@Override
	public void execute() {
		Random random = new Random();
		
		builder.append(random.nextInt(10));
		
		index = builder.length()-1;
		c = builder.charAt(index);
	}
	
	@Override
	public void unExecute()
	{
		builder.deleteCharAt(index);
	}



	@Override
	public void redo() {
		builder.insert(index, c);
	}

	
	@Override
	public Command Clone() {
		try {
			return (Command) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
