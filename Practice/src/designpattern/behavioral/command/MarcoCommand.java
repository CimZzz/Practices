package designpattern.behavioral.command;

import java.util.LinkedList;
import java.util.List;

/**
 * 复合命令
 * @author CimZzz
 *
 */
public class MarcoCommand implements Command{
	private List<Command> commands;
	
	public MarcoCommand() {
		commands = new LinkedList<>();
	}
	
	public void addCommand(Command command)
	{
		commands.add(command);
	}
	
	public void removeCommand(Command command)
	{
		commands.remove(command);
	}
	
	@Override
	public void execute() {
		for(Command command : commands)
		{
			command.execute();
		}
	}

	@Override
	public void redo() {
		for(Command command : commands)
		{
			command.redo();
		}
	}
	
	@Override
	public void unExecute()
	{
		for(Command command : commands)
		{
			command.unExecute();
		}
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
