package filereadandwrite;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destinationPath = "target.txt";


        try{
            CopyFile.copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfully");
    }catch(FileNotFoundException e){
            System.out.println("Error: File not found. ");}
    }
}
