package edu.htl3r.schoolplanner.backend.schoolObjects.lesson.lessonCode;

import java.io.Serializable;

import android.graphics.Color;

import edu.htl3r.schoolplanner.backend.schoolObjects.lesson.LessonCode;

public class LessonCodeIrregular extends LessonCode implements Serializable, Cloneable {

	private static final long serialVersionUID = 1169211273101299819L;
	
	
	public LessonCodeIrregular() {
		bgColor = Color.YELLOW;
		fgColor = Color.BLACK;
	}
}