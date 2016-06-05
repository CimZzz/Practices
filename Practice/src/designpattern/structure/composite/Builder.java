package designpattern.structure.composite;

public class Builder {
	private ViewGroup viewGroup;
	
	public void build()
	{
		viewGroup = new ViewGroup();
	}
	
	public void addButton()
	{
		viewGroup.add(new Button());
	}
	
	public void addTextView(String text) {
		TextView view = new TextView();
		
		view.setText(text);
		
		viewGroup.add(view);
	}
	
	public ViewGroup getViewGroup()
	{
		return viewGroup;
	}
}
