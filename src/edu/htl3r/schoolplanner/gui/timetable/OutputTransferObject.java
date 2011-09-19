package edu.htl3r.schoolplanner.gui.timetable;

import edu.htl3r.schoolplanner.gui.timetable.GUIData.GUIWeek;

public class OutputTransferObject extends TransferObject{
	
	private GUIWeek week;
	private int pos;
	
	public OutputTransferObject(GUIWeek week, int pos){
		setID(NORMAL);
		this.week = week;
		this.pos = pos;
	}

	public GUIWeek getWeek() {
		return week;
	}

	public int getPos() {
		return pos;
	}
	
	
}