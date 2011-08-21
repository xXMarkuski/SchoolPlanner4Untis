/* SchoolPlanner4Untis - Android app to manage your Untis timetable
    Copyright (C) 2011  Mathias Kub <mail@makubi.at>
			Sebastian Chlan <sebastian@schoolplanner.at>
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package edu.htl3r.schoolplanner.backend.preferences;

import edu.htl3r.schoolplanner.R;
import edu.htl3r.schoolplanner.SchoolplannerContext;

public interface SettingsConstants {

	public static final String DEFAULT_VIEW_DAY = SchoolplannerContext.context.getString(R.string.settings_default_view_day);
	public static final String DEFAULT_VIEW_WEEK = SchoolplannerContext.context.getString(R.string.settings_default_view_week);
	public static final String DEFAULT_VIEW_MONTH = SchoolplannerContext.context.getString(R.string.settings_default_view_month);
	
	public static final String AUTOSELECT_TYPE_CLASS = SchoolplannerContext.context.getString(R.string.settings_autoselect_type_class);
	public static final String AUTOSELECT_TYPE_TEACHER = SchoolplannerContext.context.getString(R.string.settings_autoselect_type_teacher);
	public static final String AUTOSELECT_TYPE_ROOM = SchoolplannerContext.context.getString(R.string.settings_autoselect_type_room);
	public static final String AUTOSELECT_TYPE_SUBJECT = SchoolplannerContext.context.getString(R.string.settings_autoselect_type_subject);
}
