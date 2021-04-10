package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.*;

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
        if(type==0 && voters.contains(person)){
            for(String s: polls.keySet()){
                for(Iterator<Vote> v = polls.get(s).iterator(); v.hasNext();){
                    if(v.next().getPerson() == person){
                        v.remove();
                        polls.get(s).add(createVote(person));
                        return;
                    }
                }
            }
        }else if(type==0 && !voters.contains(person)){
            voters.add(person);
            polls.get(choices.get(0)).add(createVote(person));
        }else if(type!=0 && voters.contains(person)){
            for(String s: polls.keySet()){
                for(Iterator<Vote> voteIterator = polls.get(s).iterator(); voteIterator.hasNext();){
                    if(voteIterator.next().getPerson() == person){
                        voteIterator.remove();
                    }
                }
            }
            for(String s: choices){
                polls.get(s).add(createVote(person));
            }
        }else if(type!=0 && !voters.contains(person)){
            voters.add(person);
            for(String c: choices){
                polls.get(c).add(createVote(person));
            }
        }

    }
    public void printVotes(){
        for(String choice: choices){
           Iterator<Vote> iterator = polls.get(choice).iterator();
           while(iterator.hasNext()){
               Vote tempVote = iterator.next();
               System.out.println(choice +"\n"+ tempVote.getPerson().toStirng() + tempVote.getDate());
           }
        }
    }

    public void printResult(){
        for(String choice: choices){
            System.out.println(choice+": "+polls.get(choice).size());
        }
    }
    public Vote createVote(Person person){
        String date = new JalaliCalendar(new GregorianCalendar()).toString();
        return new Vote(person, date);
    }


}
