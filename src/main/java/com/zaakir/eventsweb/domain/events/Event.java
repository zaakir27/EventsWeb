/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.domain.events;


import com.zaakir.eventsweb.domain.attendee.AttendeeImpl;
import java.util.List;


/**
 *
 * @author zaakir
 */
public interface Event {
    
    String getName ();
    String getLocation ();
    String getDate();
    int getSize();
    List<AttendeeImpl> getAttendee ();
    
    
}
