import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLDocument.HTMLReader;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.parser.ParserDelegator;

import org.junit.Test;

public class CommonTest {
	@Test
	public void test() throws IOException {
		ParserDelegator delegator = new ParserDelegator();
		ParserCallback parser = new ParserCallback() {
			StringBuilder buff = new StringBuilder();

			public void handleText(char[] text, int pos) {
				buff.append(text);
			}
			
			public String toString() {
				return buff.toString();
			}

		};
		
		URL url = new URL("http://www.cnblogs.com/langtianya/p/3881080.html");
		Reader reader = new InputStreamReader(url.openStream(), "gbk");
		
		delegator.parse(reader, parser, Boolean.TRUE);

		System.out.println(parser.toString());

	}
}
