package javagame;

public class ActionEvent extends Event{

	int i = 0;
	/*
	 * Constructor for the ActionEvent class
	 */
	public ActionEvent(int eventID, float eventPositionX, float eventPositionY, Action personalAction){
			super(eventID, eventPositionX, eventPositionY, personalAction);
	}
	
	/*
	 * Called to update ActionEvent
	 */
	public void update(int delta){
		i++;
		System.out.println(i);
	}
}
