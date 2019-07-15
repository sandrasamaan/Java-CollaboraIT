package File_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_Demo {
    public static void main(String[] args) {

    }
    //convert data from file into byte[] array then process it
    public static byte[] readFileUsingByteArray(String file) {
        FileInputStream inputStream = null;
        byte[] barray = new byte[(int) file.length()];

        try {
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                inputStream.read(barray);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < barray.length; i++) {
                System.out.println((char) barray[i]);

            }
        }catch (Exception e){

        }
        return barray;


    }
}
