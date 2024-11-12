package exampleprojects;

import java.util.Scanner;

public class RightLetterRightPlace {
    private String word;
    private int attempts;


    RightLetterRightPlace(String word, int attempts) {
        this.word = word;
        this.attempts = attempts;
    }

    public String getWord() {
        return word.toLowerCase();
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }


    // public static boolean arraysHaveSameCharacters(String)

    public void play(){
        System.out.println("Guess the " + this.getWord().length() + " letters word");
        //given word array
        String[] givenWordArray=this.getWord().split("");


        Scanner sc = new Scanner(System.in);

        boolean isGameOver = false;

        int attemps = this.attempts;
        while(attemps >0 || !isGameOver){
          String[] newWordArr = new String[givenWordArray.length];
          String  newWord = String.join("", newWordArr);
          String guessedWord = sc.nextLine().toLowerCase();
          String[] guessedWordArray = guessedWord.toLowerCase().split("");

            attemps--;


          if(guessedWord.length() > this.word.length()){

              System.out.println("Guess the " + this.getWord().length() + " letters word");
              guessedWord = sc.nextLine().toLowerCase();
          }

          if(newWord.equals(this.getWord()) ||(guessedWord.equals(this.getWord())) ){

              isGameOver = true;
              System.out.println("Game over");
              if(attemps>0){
                  System.out.println("You have won");
                  guessedWord = newWord;
              }

          }



          else{

        for (int i=0; i< givenWordArray.length; i++){
            String c =  givenWordArray[i];


            for(int j = 0; j<givenWordArray.length; j++){

                if(c.equals(guessedWordArray[j])){

                    if(i == j){
                        newWordArr[i] = c;
                        //newWordArr[j] = "*";

                        System.out.println(c+ " -  In the right place");
                        break;

                    }
                    else{

                        newWordArr[j] = c;
                        System.out.println(c+ " - NOT  In the right place");


                    }




                }




            }
            if(newWordArr[i] == null){
                newWordArr[i] = "*";
            }
        }


          }
          newWord = String.join("", newWordArr);

          if(!isGameOver){
              System.out.println("You have left "+ attemps + " attempts");
              System.out.println(newWord);
          }



      }














    }


}
