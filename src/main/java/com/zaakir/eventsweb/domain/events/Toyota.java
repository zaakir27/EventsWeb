/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.domain.events;

import com.zaakir.eventsweb.domain.attendee.AttendeeImpl;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author zaakir
 */
@Entity
public class Toyota implements  Serializable, Event{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private String name;
    private String location;
    private String date;
    private int sizze;
    private List<AttendeeImpl> attendee ;

    private Toyota(Builder build){
       name = build.name;
       location = build.location;
       date = build.date;
       sizze = build.sizze;
       attendee = build.attendee;
    }
    
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public int getSize() {
        return sizze;
    }

    public List<AttendeeImpl> getAttendee() {
        return attendee;
    }
    
    public static class Builder{
        
    private String name;
    private String location;
    private String date;
    private int sizze;
    private List<AttendeeImpl> attendee ;
   
        
        public Builder(){
            this.name = "Toyota";
        }
    
        public Builder location(String l){
            location = l;
            return this;
        }
        
        public Builder date(String d){
            date = d;
            return this;
        }
        
        public Builder sizze(int s){
            sizze = s;
            return this;
        }     
        
     
        public Builder alist(List<AttendeeImpl> attendee){
            attendee = this.attendee;
            return this;
        }
        
        
        public Toyota build(){
            return new Toyota(this);
        }
    }
     @Override
    public String toString() {
        return "com.zaakir.Events.domain.event.Toyota[ id=" + name + " ]";
    }
}
