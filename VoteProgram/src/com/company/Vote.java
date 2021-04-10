package com.company;
import ir.huri.jcal.JalaliCalendar;

import java.util.Objects;

public class Vote {
    private Person person;
    private String date;

    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;

    }

    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        Vote tempVote = (Vote) obj;
        return tempVote.getPerson() == this.getPerson();

    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }

}
