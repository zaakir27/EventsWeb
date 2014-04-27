/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.domain.events;

import com.zaakir.eventsweb.domain.attendee.AttendeeImpl;
import java.util.List;
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
public class JellyTots implements Serializable, Event{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
     private String name;
    private String location;
    private String date;
    private int sizze;
    private List<AttendeeImpl> attendee ;

    private JellyTots (Builder build){
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
            this.name = "JellyTots";
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
        
        
        public JellyTots build(){
            return new JellyTots(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 41 * hash + (this.date != null ? this.date.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JellyTots other = (JellyTots) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.date == null) ? (other.date != null) : !this.date.equals(other.date)) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        return "com.zaakir.Events.domain.event.JellyTots[ id=" + name + " ]";
    }
}
