package designpattern.structure.adapter;

public class DelegateAdapter implements TargetDelegate{
	private AdapteeEntity entity;
	
	public void setEntity(AdapteeEntity entity) {
		this.entity = entity;
	}
	
	
	@Override
	public String getAdapteeString() {
		return entity.description();
	}

}
