package File_IO;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            File infile = new File("ReadFile.txt");
            File outFile = new File("CopyOfReadFile.txt");
            inputStream = new FileInputStream(infile);
            outputStream = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer))>0){
                outputStream.write(buffer, 0, length);

            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied !!");


        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
