import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {

    @Test
    public void checkSnippet1() throws IOException{
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> linksGet = MdParseother.getLinks(content);
        ArrayList<String> checkList = new ArrayList<String>();
        checkList.add("`google.com");
        checkList.add("google.com");
        checkList.add("ucsd.edu");
        assertEquals(checkList, linksGet);
    }
    @Test
    public void checkSnippet2() throws IOException{
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> linksGet = MdParseother.getLinks(content);
        ArrayList<String> checkList = new ArrayList<String>();
        checkList.add("a.com");
        checkList.add("a.com(())");
        checkList.add("example.com");
        assertEquals(checkList, linksGet);
    }
    @Test
    public void checkSnippet3() throws IOException{
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> linksGet = MdParseother.getLinks(content);
        ArrayList<String> checkList = new ArrayList<String>();
        checkList.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(checkList, linksGet);
    }
}