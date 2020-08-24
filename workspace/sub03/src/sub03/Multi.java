package sub03;

public abstract class Multi {
	
	private Minus minus;
	public void setMinus(Minus minus){
		this.minus=minus;
	}
	
	
	
	public Minus getMinus() {
		return minus;
	}



	public abstract Object multi(Object o);
}
