package part1;

import junit.framework.TestCase;
import org.junit.Ignore;

import static org.junit.Assert.*;


public class WordShufflingTest extends TestCase {

    public void testWriteToFile() throws Exception {
        String path = null;
        switch (System.getProperty("os.name")) {
            case "Linux":
                path = "/home/zar/IdeaProjects/Kos/out/production/Kos/testFile.txt";

            case "Windows":
                path = "C:\\Users\\Zar\\ideaProjects\\kos\\out\\testFile.txt";

        }
           part1.WordShuffling.writeToFile(path,"a");
        String text = part1.WordShuffling.readFromFile(path);
        assertEquals("a", text);

        }


    public void testReadFromFile() throws Exception {
        String path = null;
        switch (System.getProperty("os.name")) {
            case "Linux":
                path = "/home/zar/IdeaProjects/Kos/out/production/Kos/testFile.txt";

            case "Windows":
                path = "C:\\Users\\Zar\\ideaProjects\\kos\\out\\testFile.txt";

        }
        part1.WordShuffling.writeToFile(path,"a");
        String text = part1.WordShuffling.readFromFile(path);
        assertEquals("a", text);

    }
    @Ignore
    public void testFlipTheWords() {

       }
}