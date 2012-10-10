package javagame;

import org.newdawn.slick.Input;

/*
 * Used to trigger an event when the players sprite overlaps on the event.
 */
public class OnTouchEvent extends Event {

	/*
	 * Constructor for OnTouchEvent
	 */
	public OnTouchEvent(int eventID, float eventPositionX, float eventPositionY, Action personalAction){
		super(eventID, eventPositionX, eventPositionY, personalAction);
	}
	
	/*
	 * Called to update ActionEvent
	 */
	public void update(int delta){
		
	}
	
}
