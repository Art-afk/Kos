package part1;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
просто играюсь с failinputstream  и т.п.
 */
public class FileInput {
    public static void main(String[] args) throws IOException {
        String path ="/home/zar/Java/mytest.txt";
        try {


        FileOutputStream my = new FileOutputStream(path,true );
        String text = "hi\n write two \n write three \n write for \n";
        my.write(text.getBytes());
        my.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


   /*     try {
            InputStream fis = new FileInputStream( path);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            br.lines().forEach(line -> System.out.println(line));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
*/
        try {
         FileInputStream fis = new FileInputStream(path);
         BufferedInputStream bfr = new BufferedInputStream(fis,200);
        int val;
        while ((val = bfr.read()) != -1){
            System.out.println((char) val);
        }


    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
