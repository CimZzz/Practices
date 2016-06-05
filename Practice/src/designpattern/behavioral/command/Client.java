package designpattern.behavioral.command;

/**
 * 测试：Command 的了解与使用
 * Command模式将Button 与 StringBuilder 进行解耦（本应在Button的Click函数中执行StringBuilder的操作），
 * 提供了Execute , UnExecute , Redo 等操作.这里HistroyList相当于历史表列。通过HistoryList执行Command，
 * 因为每次Command执行之后内部状态都有改变，则需要保留一份Command的克隆，进行Unexecute 与 ReDo操作
 * @author CimZzz
 *
 */
public class Client {
	static StringBuilder stringBuilder = new StringBuilder();
	
	private static void displayString()
	{
		System.out.println(stringBuilder.toString());
	}
	
	public static void main(String[] args){
		ACommand aCommand = new ACommand(stringBuilder);
		Button button = new Button(aCommand);

		button.click();
		button.click();
		button.click();
		button.click();
		button.click();
		button.click();
		button.click();
		button.click();
		button.click();
		
		displayString();

		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		HistortyList.Unexecute();
		
		displayString();

		HistortyList.reDo();
		HistortyList.reDo();
		HistortyList.reDo();
		HistortyList.reDo();
		
		displayString();
	}
	
}