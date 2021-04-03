package com.company;

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
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
