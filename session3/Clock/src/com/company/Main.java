package com.company;

public class Main {

    public static void main(String[] args) {
	    ClockDisplay myClock = new ClockDisplay();
	    while(true){
            try{
                myClock.timeTick();
                System.out.println(myClock.getTime());
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }

    }
}
