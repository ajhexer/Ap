package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }
    public void createVoting(String question, int type, ArrayList<String> polls){
        Voting tempVoting = new Voting(type,question);
        votingList.add(tempVoting);
        for(String choice: polls){
            tempVoting.createChoice(choice);
        }
    }
    public void printVotingList(){
        for(Voting voting: votingList){
            System.out.println(voting.getQuestion());
        }
    }
    public void printVoting(int number){
        System.out.println(votingList.get(number).getQuestion());
        for(String choice: votingList.get(number).getChoices()){
            System.out.println(choice);
        }
    }
    public void vote(int voteNumber, Person person, ArrayList<String> choices){
        votingList.get(voteNumber).vote(person, choices);
    }
    public void printResult(int votingNumber){
        votingList.get(votingNumber).printResult();
    }
    public void printVotes(){
        for(Voting v: votingList){
            System.out.println(v.getQuestion());
            v.printVotes();
        }
    }







}
