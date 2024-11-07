package filereadandwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException {
        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath)
        ){
            int character;
            while ((character = reader.read())!=-1){
                writer.write(character);
            }

        }
        catch(IOException e){
            System.out.println("Error reading and writing files: " + e.getMessage());
        }
    }
}
