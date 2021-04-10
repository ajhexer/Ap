package com.company;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

import ir.huri.jcal.JalaliCalendar;

public class Main {

    public static void main(String[] args) {
	    VotingSystem myVoteSystem = new VotingSystem();
	    ArrayList<String> choices = new ArrayList<>();
	    choices.add("Eminem");
	    choices.add("2pac");
	    choices.add("50Cent");


        myVoteSystem.createVoting("Best rapper",1, choices);
        ArrayList<String> alirezaChoice = new ArrayList<>();
        ArrayList<String> mmdChoice = new ArrayList<>();

		Person mmd =  new Person("mmd", "test");
        Person me = new Person("Alireza","Jelokani");
        mmdChoice.add("Eminem");
        mmdChoice.add("50Cent");
        alirezaChoice.add("2pac");
        alirezaChoice.add("2pac");
        myVoteSystem.vote(0, me, alirezaChoice);
        myVoteSystem.vote(0, mmd, mmdChoice);
        myVoteSystem.printResult(0);
    }
}
