package part1;
/*
"Во входном файле содержится случайный текст, состоящий из букв и цифр. (1 строка)\n" +
                "Необходимо в выходной файл записать отдельно две строки - первая - все буквенные символы, вторая - все числа. (2 строка)\n" +
                "Порядок должен сохраниться тем же, что был во входном файле (3 строка)";
 */
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileWork {

    public static void main(String[] args) throws Exception {
         String path ="/home/zar/Java/mytest.txt";
         String topatch = "/home/zar/Java/mytest2.txt";
         String text = "Вовходномфайл1еодержитсяслуча2йныйтекстсост3оящи5йизбуквицифр4строка";

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
    static public char[] ReadFromFile(String path) throws Exception {
        char[] temp = new char[0];
        try(FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bfi = new BufferedInputStream(fis)){
            int i;
            int v = 0;
            char[] mydata = new char[bfi.available()];
            
            while ((i = bfi.read()) != -1){
                mydata[v] = (char) i;
                v++;
            }
            temp = mydata;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return temp;



     /*   try(FileInputStream fis = new FileInputStream(path);
            ByteArrayOutputStream bfi = new ByteArrayOutputStream()) {
            int val=0;
            byte[] buffer = new byte[(int) path.length()];
            while ((val = fis.read(buffer)) > 0)
                bfi.write(buffer,0,1);
            fis.close();
            bfi.close();
            byte[] data = bfi.toByteArray();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

      */
    }
    static public void Start (String path, String topatch) throws Exception{
   char[] data = ReadFromFile(path);

        for (char c: data
             ) {
            String out = new String(Character.toString(c));
            System.out.println(out);
        }


    }

}
