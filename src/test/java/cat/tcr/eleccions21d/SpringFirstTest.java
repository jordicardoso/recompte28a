package cat.tcr.eleccions21d;

import java.io.File;
import org.apache.camel.Exchange;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstTest extends CamelSpringTestSupport {
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext(
				"META-INF/spring/camel-context.xml");
	}

	@Test
	public void testRecompte() throws Exception {
		template.sendBodyAndHeader("file://target/inbox",
				"Hello World", Exchange.FILE_NAME, "hello.txt");
		Thread.sleep(2000);
		File target = new File("target/outbox/hello.txt");
		assertTrue("File not moved", target.exists());
		String content = context.getTypeConverter()
				.convertTo(String.class, target);
		assertEquals("Hello World", content);
	}
}