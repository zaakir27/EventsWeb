/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.domain.attendee;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author zaakir
 */
@Entity
public class AttendeeImpl implements Serializable, Attendee{
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String name ;
    private String surname ;
    private int admit ;
    private String contactNum ;
    private String attendID;

    public String getAttendID() {
        return attendID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAdmit() {
        return admit;
    }

    public String getContactNum() {
        return contactNum;
    }
    
    
    
    private AttendeeImpl(Builder build){
    name = build.name;
    surname = build.surname ;
    admit = build.admit;
    contactNum = build.contactNum;
    attendID = build.attendID;
        
    }
    
    public static class Builder{
        
        private String name ;
    private String surname ;
    private int admit ;
    private String contactNum ;
    private String attendID;

        
        public Builder(String attendID){
            this.attendID = attendID;
        }
    
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        
        public Builder contactNum(String contactNum){
            this.contactNum = contactNum;
            return this;
        }     
        
        public Builder admit (int admit){
            this.admit=admit;
            return this;
        }
        
        public AttendeeImpl build(){
            return new AttendeeImpl(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.attendID != null ? this.attendID.hashCode() : 0);
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
        final AttendeeImpl other = (AttendeeImpl) obj;
        if ((this.attendID == null) ? (other.attendID != null) : !this.attendID.equals(other.attendID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zaakir.Events.domain.event.attendee[ [id=" + name + " ]";
    }
}
