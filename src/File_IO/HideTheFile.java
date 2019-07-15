package File_IO;

import java.io.File;
import java.io.IOException;

public class HideTheFile {

    public static void main(String[] args) throws IOException, InterruptedException {
        String strFilePath = "C:/dir_1/data.txt";
        File file = new File(strFilePath);

        if (file.createNewFile()){
            System.out.println("File has been created");

        }else{
            System.out.println("File already Exists");


        }
        try {
            if(file.isHidden()){
                System.out.println("File is Hidden");
            }else{
                System.out.println("File is visible");

            }
        }
        catch (SecurityException e){

    }
}}
