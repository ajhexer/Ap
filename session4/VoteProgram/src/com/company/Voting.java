package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private ArrayList<String> choices;
    private HashMap<String, HashSet<Vote>> polls;


    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        this.voters = new ArrayList<>();
        this.choices = new ArrayList<>();
        this.polls = new HashMap<>();

    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }
    public void createChoice(String choice){
        choices.add(choice);
        polls.put(choice,new HashSet<>());
    }
    public void vote(Person person, ArrayList<String> choices){
        if(type==0){
            if(voters.contains(person)){
                for(String choice: choices){

                }
            }
        }else{

        }
       voters.add(person);
       for(String choice: choices){
           polls.get(choice).add(new Vote(person, "Date"));
       }
    }
    public void printVotes(){
        for(String choice: choices){
           Iterator<Vote> iterator = polls.get(choice).iterator();
           while(iterator.hasNext()){
               Vote tempVote = iterator.next();
               System.out.println(choice + tempVote.getPerson().toStirng() + tempVote.getDate());
           }
        }
    }

    public void printResult(){
        for(String choice: choices){
            System.out.println(choice+": "+polls.get(choice).size());
        }
    }


}
