import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("ms.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);

    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("cs1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);

    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("woohoo.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);

    }
     @Test
    public void testSnip1() throws IOException {
        Path fileName = Path.of("snip1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        expectedoutput.add("google.com");
        expectedoutput.add("google.com");
        expectedoutput.add("ucsd.edu");
        assertEquals(links, expectedoutput);

    }
     @Test
    public void testSnip2() throws IOException {
        Path fileName = Path.of("snip2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        expectedoutput.add("a.com");
        expectedoutput.add("a.com(())");
        expectedoutput.add("example.com");
        assertEquals(links, expectedoutput);

    }
    @Test
    public void testSnip3() throws IOException {
        Path fileName = Path.of("snip2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        expectedoutput.add("https://ucsd-cse15l-w22.github.io/");
        assertEquals(links, expectedoutput);

    }
    

}
