/**
 * @author zar
 */
package part1;

/**
 * Во входном файле набор строк, состоящий из нескольких слов, слова разделены пробелами, знаки препинания и спец символы отсутствуют. Регистр нижний.
 * В выходной файл необходимо вывести текст "задом наперёд" - поменять местами строки и слова внутри строк, например:
 * Входные данные:
 * Жужжали мухи
 * Светил фонарик
 * кипела вода в чайнике
 * <p>
 * Выходные данные:
 * чайнике в вода кипела
 * фонарик светил
 * мухи жужжали
 * <p>
 * <p>
 * Алгоритм:
 * загоняем всё в ArrayList и просто выводим всё с конца
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class WordShuffling {
    public static boolean debug = false;

    public static void main(String[] args) throws Exception {
        String text = "Жужжали мухи\n" +
                "Светил фонарик\n" +
                "кипела вода в чайнике";
        writeToFile(osPathCheck() + "file.txt", text);
        ArrayList<String> myText = textConvertToArray(readFromFile(osPathCheck() + "file.txt"));
        Queue myq = new LinkedList();
        myq.remove();
        for (int i = myText.size() - 1; i >= 0; i--) {
            System.out.printf(myText.get(i) + " ");
        }
    }
    /**
     *
     * @return true path to file
     */
    private static String osPathCheck() {
        String path = null;
        switch (System.getProperty("os.name")) {
            case "Linux":
                path = "/home/zar/IdeaProjects/Kos/out/production/Kos/";

            case "Windows":
                path = "C:\\Users\\Zar\\ideaProjects\\kos\\out\\";

        }
        return path;
    }

    /**
     *
     * @param path to the file to write to
     * @param text to write to file
     * @throws Exception something wrong
     */
    public static void writeToFile(String path, String text) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(path, false);
        ) {
            fos.write(text.getBytes(StandardCharsets.UTF_8));

        }
    }

    /**
     *
     * @param path to the file to be read
     * @return return All data from file String
     * @throws Exception something wrong
     */
    public static String readFromFile(String path) throws Exception {
        String text = "";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr);
        ) {
            int i;

            while ((i = reader.read()) != -1) {
                if (debug) System.out.println((char) i);
                text += Character.toString(i);
            }
            return text;
        }
    }

    /**
     *
     * @param text enter text "vasya and petiya gaming"
     * @return text "[vasya, and, petiya, gaming]"
     */
    public static ArrayList<String> textConvertToArray(String text) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(text);
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
    }
} //class

