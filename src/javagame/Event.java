package javagame;

public class Event {

	//contains the X and Y position of the event and the event's personal ID.
	private float eventPositionX;
	private float eventPositionY;
	private int eventID;
	private Action personalAction;
	
	/*
	 * Constructor for Event
	 */
	public Event(int eventID, float eventPositionX, float eventPositionY, Action personalAction){
		this.eventPositionX = eventPositionX;
		this.eventPositionY = eventPositionY;
		this.eventID = eventID;
		this.personalAction = personalAction;
	}
	
	public float getEventPositionX() {
		return eventPositionX;
	}
	public void setEventPositionX(float eventPositionX) {
		this.eventPositionX = eventPositionX;
	}
	public float getEventPositionY() {
		return eventPositionY;
	}
	public void setEventPositionY(float eventPositionY) {
		this.eventPositionY = eventPositionY;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public Action getPersonalAction() {
		return personalAction;
	}

	public void setPersonalAction(Action personalAction) {
		this.personalAction = personalAction;
	}
}
