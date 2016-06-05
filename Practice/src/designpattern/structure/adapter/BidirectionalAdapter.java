package designpattern.structure.adapter;

public class BidirectionalAdapter implements AdapteeDelegate,TargetDelegate{
	private final AdapteeEntity entity;
	private final ClientTarget target;
	
	
	public BidirectionalAdapter(AdapteeEntity entity,ClientTarget target) {
		this.entity = entity;
		this.target = target;
	}
	
	@Override
	public String getAdapteeString() {
		return target.description();
	}

	@Override
	public String getTargetString() {
		return entity.description();
	}
	
}
