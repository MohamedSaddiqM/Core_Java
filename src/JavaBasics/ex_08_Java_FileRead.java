package JavaBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex_08_Java_FileRead {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream( "D:/demo.txt");
            int c = fis.read();
            System.out.println((char) c );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
