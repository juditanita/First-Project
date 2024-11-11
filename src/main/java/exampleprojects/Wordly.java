package exampleprojects;

import java.util.Scanner;

public class Wordly {

    private String word;
    private int maxAttents;



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



    public void startGame(){

        System.out.println("Welcome to the game ");
        System.out.println("Guess the letter of the word");
    }




    public void play(){
        this.startGame();
        boolean isWinner =false;
        Scanner sc = new Scanner(System.in);



        String letter;

      String[] guessedWordsArray= new String[this.getWord().length()];


        do {
            System.out.println("Enter a letter:");
            letter = sc.nextLine().toLowerCase();
            int letterLength = letter.length();

            if (letterLength > 1) {
                System.out.println("Letter should be one character.");
                letter = sc.nextLine().toLowerCase();
            }

            String[] wordsArray = this.word.toLowerCase().split("");

            for (int i = 0; i < wordsArray.length; i++) {
                if (guessedWordsArray[i] == null || guessedWordsArray[i].equals("*")) {
                    if (wordsArray[i].equals(letter)) {
                        guessedWordsArray[i] = letter;
                    } else {
                        guessedWordsArray[i] = "*";
                    }
                }
            }

            String guessedWord = String.join("", guessedWordsArray);
            if(this.word.equals(guessedWord)){
isWinner = true;
            }
            System.out.println(guessedWord);

            if (String.join("", this.word.split("")).equals(guessedWord)) {
                System.out.println("You are a winner!");
                break;
            }

            setMaxAttents(getMaxAttents() - 1);
            messages();
        } while (getMaxAttents() > 0 || isWinner);

        if (getMaxAttents() == 0) {
            System.out.println("You have lost the game!");
        }

        sc.close();
    }








}
