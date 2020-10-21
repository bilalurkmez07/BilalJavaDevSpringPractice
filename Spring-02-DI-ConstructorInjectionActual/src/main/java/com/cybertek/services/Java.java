package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

   // public int x;

    //OfficeHours officeHours;

    ExtraSessions extraSessions;

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

//    @Override
//    public void getTeachingHours() {
//        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()) );
//    }


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }
}
