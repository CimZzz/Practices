package designpattern.behavioral.command;

import java.util.LinkedList;

/**
 * Invoker
 * @author CimZzz
 *
 */
public class HistortyList extends LinkedList<Command>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3557270855469952574L;

	private static final int LENGTH = 3;
	
	private static HistortyList historty = new HistortyList();
	private static HistortyList reDoHistory = new HistortyList();
	
	private HistortyList()
	{
	}
	
	public static void execute(Command command)
	{
		synchronized (historty) {
			reDoHistory.clear();
			command.execute();
			
			if(historty.size()>=LENGTH)
			{
				historty.removeLast();
			}
			historty.push(command.Clone());
		}
	}
	
	public static void Unexecute()
	{
		synchronized (historty) {
			Command command = historty.poll();
			
			if (command == null) {
				return;
			}
			
			command.unExecute();

			if(reDoHistory.size()>=LENGTH)
			{
				reDoHistory.removeLast();
			}
			reDoHistory.push(command);
		}
	}
	
	public static void reDo()
	{		
		synchronized (historty) {
			Command command = reDoHistory.poll();
			
			if (command == null) {
				return;
			}
			
			command.redo();

			if(historty.size()>=LENGTH)
			{
				historty.removeLast();
			}
			historty.push(command);
		}
	}
}
