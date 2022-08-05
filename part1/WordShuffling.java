package part1;
/*
Во входном файле набор строк, состоящий из нескольких слов, слова разделены пробелами, знаки препинания и спец символы отсутствуют. Регистр нижний.
В выходной файл необходимо вывести текст "задом наперёд" - поменять местами строки и слова внутри строк, например:
Входные данные:
Жужжали мухи
Светил фонарик
кипела вода в чайнике

Выходные данные:
чайнике в вода кипела
фонарик светил
мухи жужжали

 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class WordShuffling {

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\Zar\\ideaProjects\\kos\\out\\file.txt";
        // String topatch = "C:\\Users\\Zar\\ideaProjects\\kos\\out\file2.txt";
        String text = "Жужжали мухи\n" +
                "Светил фонарик\n" +
                "кипела вода в чайнике";
        WriteToFile(path, text);
        // Start(path, topatch);
        ReadFromFile(path);

    }

    public static void WriteToFile(String path,String text) throws Exception {
        try(FileOutputStream fos = new FileOutputStream(path,false);
        ) {
            fos.write(text.getBytes(StandardCharsets.UTF_16));
            fos.close();

        }
    }

    public static char ReadFromFile(String path) throws Exception{
        try(FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bio = new BufferedInputStream(fis);
        ) {
            int i;

            while ((i= bio.read()) != -1){
                System.out.println((char)i);
            }
            return(char) i;
        }



    }
} //class

