package exampleprojects;

import java.util.Scanner;

public class Wordly {

    private String word;
    private int maxAttents;
    boolean rightLetterFound = false;

    Wordly(String word, int maxAttents) {
        this.word = word;
        this.maxAttents = maxAttents;

    }

    public String getWord() {
        return word.toLowerCase();
    }

    public void setWord(String word) {
        this.word = word;
    }


    public int getMaxAttents() {
        return maxAttents;
    }

    public void setMaxAttents(int maxAttents) {
        this.maxAttents = maxAttents;
    }

    public void messages(){
        if(this.getMaxAttents() == 0){
            System.out.println("You have lost the game!");
        }
        if(this.getMaxAttents() == 1){
            System.out.println("One more chance");
        }
    }

    public boolean constainsStars(String[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("*")){
                return true;
            }
        }
        return false;
    }

    public void startGame(){

        System.out.println("Welcome to the game ");
        System.out.println("Guess the letter of the word");
    }

    public void play(){

        this.startGame();
        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();
        letter = letter.toLowerCase();
        int letterLength = letter.length();

        String[] wordsArray = getWord().split("");

        int wordsArrayLength = wordsArray.length;
        System.out.println(wordsArrayLength);

        String[] guessedWordsArray = new String[wordsArrayLength];





        if(letterLength>1 || letterLength == 0){
            System.out.println("Letter should be one character");
            letter = sc.nextLine();
        }

        for(int i = 0; i<wordsArrayLength; i++){

         if(guessedWordsArray[i] == null || guessedWordsArray[i].equals("*")){

           if(wordsArray[i].equals(letter)){
                   guessedWordsArray[i] = letter;
               }
        else{
                guessedWordsArray[i] = "*";
        }


    }
       }
        String guessedWord = guessedWord=String.join("", guessedWordsArray);


       System.out.println(guessedWord);
        if(this.getWord().equals(guessedWord)){
            System.out.println("You are a winner");
        }



        while (this.getMaxAttents() >0){
            play();
            this.setMaxAttents(this.getMaxAttents()-1);

        }






//        if( constainsStars(guessedWordsArray)){
//
//            play();
//        };

sc.close();
    }





}
