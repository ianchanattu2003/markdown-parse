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
    public void testGetLinks() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("test-file.md");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, m.getLinks(Files.readString(filename)));

    }

    @Test
    public void testGetLinkswoohoo() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("woohoo.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));

    }

    @Test
    public void testGetlinkcs1() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("cs1.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));

    }

    @Test
    public void testGetlinkms() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("ms.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));

    }
}
