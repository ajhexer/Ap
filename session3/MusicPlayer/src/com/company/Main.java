package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static MusicCollection pop = new MusicCollection();
    static MusicCollection jazz = new MusicCollection();
    static MusicCollection rock = new MusicCollection();
    static MusicCollection country = new MusicCollection();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	    while(true){
            System.out.printf("1.Add music\n2.Play music\n3.Remove Music\n4.Show all musics\n5.Exit\n");
            int currentState = scanner.nextInt();
            if(currentState==1){
                System.out.println("Please enter Title, Singer name, Release Time and Category: ");
                String name, singerName, releaseTime, category;
                name=scanner.next();
                singerName = scanner.next();
                releaseTime = scanner.next();
                category = scanner.next();
                category=category.toLowerCase();
                Music tempMusic = new Music(singerName, releaseTime, name, category);
                try {
                    findCat(category).addFile(tempMusic);
                }catch (NullPointerException e){
                    tempMusic=null;
                    System.out.println("You entered invalid category");
                }
            }else if(currentState==2){
                System.out.println("Please enter Index and Category");
                int index = scanner.nextInt();
                String category = scanner.next();
                try {
                    findCat(category).startPlaying(index);
                }catch (NullPointerException e){
                    System.out.println("You entered invalid category");
                }

            }else if(currentState==3){
                System.out.println("Please enter Index and Category");
                int index = scanner.nextInt();
                String category = scanner.next();
                try {

                    findCat(category).removeFile(index);
                }catch (NullPointerException e){
                    System.out.println("You entered invalid category");
                }
            }else if(currentState==4){
                System.out.println("Pop: ");
                pop.listAllFiles();
                System.out.println("Jazz: ");
                jazz.listAllFiles();
                System.out.println("Country: ");
                country.listAllFiles();
                System.out.println("Rock: ");
                rock.listAllFiles();
            }else{
                System.out.println("Goodbye :)");
                break;
            }
        }
    }

    /***
     *
     * @param cat category to find
     * @return collection correspond to that category
     */
    static MusicCollection findCat(String cat){
        cat = cat.toLowerCase();
        if(cat.equals("jazz")){
            return jazz;
        }else if(cat.equals("pop")){
            return pop;
        }else if(cat.equals("country")){
            return country;
        }else if(cat.equals("rock")){
            return rock;
        }
        return null;
    }
}
