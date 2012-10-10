package javagame;

public class DialogAction implements Action {

	private int ID;
	
	public DialogAction(int ID){
		this.ID = ID;
	}
	
	@Override
	public void setID(int ID) {
		this.ID = ID;

	}

	@Override
	public int getID() {
		return this.ID;
	}

	@Override
	public void play() {
		System.out.println("Hello!  Your button worked!!");
	}

}
