import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(4, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));

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

}

// @Test
// public void getLinksTest() throws IOException {
// MarkdownParse m = new MarkdownParse();
// Path filename = Path.of("test-file.md");
// ArrayList<String> expected = new ArrayList<String>();
// expected.add("https://something.com");
// expected.add("some-page.html");
// assertEquals(expected, m.getLinks(Files.readString(filename)));

// }

// }
// @Test
// public void getLinkTestWoohoo() throws IOException{
// MarkdownParse m = new MarkdownParse();
// Path filename = Path.of("woohoo.md");
// ArrayList<String> expected = new ArrayList<String>();
// assertEquals(expected,m.getLinks(Files.readString(filename)));
// }
// @Test
// public void getLinkTestMs() throws IOException{
// MarkdownParse m = new MarkdownParse();
// Path filename = Path.of("ms.md");
// ArrayList<String> expected = new ArrayList<String>();
// assertEquals(expected,m.getLinks(Files.readString(filename)));
// }
// @Test
// public void getLinkTestCS1() throws IOException{
// MarkdownParse m = new MarkdownParse();
// Path filename = Path.of("cs1.md");
// ArrayList<String> expected = new ArrayList<String>();
// assertEquals(expected,m.getLinks(Files.readString(filename)));
// }
// }
