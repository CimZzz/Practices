package designpattern.structure.composite;

public class TextView extends View {
	private String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	@Override
	public void desciption() {
		System.out.println("One TextView:"+text);
	}

}
