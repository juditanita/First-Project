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
        String guessedWord = sc.nextLine();
        String[] newWordArr = new String[givenWordArray.length];
        int position =0;
        boolean isGameOver = false;
        String  newWord = String.join("", newWordArr);



        if(guessedWord.length() > this.word.length()){

            System.out.println("Guess the " + this.getWord().length() + " letters word");
            guessedWord = sc.nextLine().toLowerCase();
        }

        String[] guessedWordArray = guessedWord.toLowerCase().split("");


        // String[] guessedWordArray = guessedWord.split("");



      while(!isGameOver){

          if(newWord.equals(this.getWord())){
              isGameOver = true;
          }

          else{

        for (int i=0; i< givenWordArray.length; i++){
            String c =  givenWordArray[i];


            for(int j = 0; j<givenWordArray.length; j++){
                this.setAttempts(this.getAttempts()+1);
                if(c.equals(guessedWordArray[j])){

                    if(i == j){
                        newWordArr[i] = c;
                        //newWordArr[j] = "*";
                        position = i+1;
                        System.out.println(c+ " - " + position + " In the right place");
                        break;

                    }
                    else{
                        position = j+1;
                        newWordArr[j] = c;
                        System.out.println(c+ " - " + position + " NOT  In the right place");


                    }




                }




            }
            if(newWordArr[i] == null){
                newWordArr[i] = "*";
            }




        }

//              newWord = String.join("", newWordArr);
//              System.out.println(newWord);
//              System.out.println("Guess the word");
//              guessedWord = sc.nextLine().toLowerCase();

          }
          newWord = String.join("", newWordArr);
          System.out.println(newWord);
          System.out.println("Guess the word");
          guessedWord = sc.nextLine().toLowerCase();
      }














    }


}
