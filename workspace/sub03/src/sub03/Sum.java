package sub03;

public abstract class Sum {
	
	private Input input;
	public void setInput(Input input){
		this.input=input;
	}
	
	public Input getInput() {
		return input;
	}


	public abstract Object sum(Object o);
	
}
