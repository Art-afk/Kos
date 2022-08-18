/*
"Во входном файле содержится случайный текст, состоящий из букв и цифр. (1 строка)\n" +
"Необходимо в выходной файл записать отдельно две строки - первая - все буквенные символы, вторая - все числа. (2 строка)\n" +
"Порядок должен сохраниться тем же, что был во входном файле (3 строка)";
 */
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;


public class FileWork {

    public static void main(String[] args) throws Exception {
         String path ="/home/zar/Java/mytest.txt";
         String topatch = "/home/zar/Java/mytest2.txt";
         //String text = "Вовходномфайл1еодержитсяслуча2йныйтекстсост3оящи5йизбуквицифр4строка";
        String text = "dfssdf4r43";
        WriteToFile(path, text);
        Start(path, topatch);

    }
    static public void WriteToFile(String path, String txt) throws Exception{

        try(FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos))
        {
            byte[] buff = txt.getBytes();
            bos.write(buff, 0, buff.length);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    static public void WriteToFile(String path, String txt, String txt2) throws Exception{

        try(FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos))
        {   String spl = txt + txt2;
            byte[] buff = spl.getBytes();
            bos.write(buff, 0, buff.length);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    static public byte[] ReadFromFile(String path) throws Exception {
        byte[] temp = new byte[0];
        try(FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bfi = new BufferedInputStream(fis)){
            int i;
            int v = 0;
            byte[] mydata = new byte[bfi.available()];
            while ((i = bfi.read()) != -1){
               mydata[v] = (byte) i;
                v++;
             //   System.out.println(i + "   char:   " + (char) i);
            }
            temp = mydata;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return temp;
    }
    static public void Start (String path, String topatch) throws Exception {
        byte[] data = ReadFromFile(path);
        char[] bukvi = new char[data.length];
        char[] ciferki = new char[data.length];
        int i = 0;
        int b = 0;
        for (byte c : data) {
            // System.out.println((char) c);
            if (Character.isLetter((char) c)) {
                bukvi[i] = (char) c;
                i++;
            } else {
                ciferki[b] = (char) c;
                b++;

            }
        }
        char[] bukviSmall = new char[i+1];
        bukviSmall[i] ='\n';
        char[] ciferkiSmall = new char[b+1];
        ciferkiSmall[b] = '\n';
        System.arraycopy(bukvi, 0, bukviSmall, 0, i);
        System.arraycopy(ciferki, 0, ciferkiSmall, 0, b);
        String str = new String(bukviSmall);
        String cif = new String(ciferkiSmall);

       //System.out.println(ciferkiSmall);

         WriteToFile(topatch,str,cif);




    }
}//class
