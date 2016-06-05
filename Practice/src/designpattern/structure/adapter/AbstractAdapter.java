package designpattern.structure.adapter;

public class AbstractAdapter extends AbstractTarget {
	private AdapteeEntity entity;
	
	public AbstractAdapter(AdapteeEntity entity) {
		this.entity = entity;
	}

	@Override
	public String getAdapterString() {
		return entity.description();
	}

}
