package name.reidmiller.parseieso.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ca.ieso.reports.schema.dispsecurityconstraints.Document;

public class DispatchSecurityConstraintsClientTest {

	private ApplicationContext appContext;
	private DispatchSecurityConstraintsClient dispatchSecurityConstraintsClient;

	@Before
	public void setUp() throws Exception {
		appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		dispatchSecurityConstraintsClient = (DispatchSecurityConstraintsClient) appContext
				.getBean("dispatchSecurityConstraintsClient");
	}

	@Test
	public void testUnmarshal() {
		try {
			assertTrue(
					"AdequacyClient did not unmaral a ca.ieso.reports.schema.dispsecurityconstraints.Document",
					dispatchSecurityConstraintsClient.unmarshal() instanceof Document);
		} catch (ClassCastException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocHeader() {
		assertNotNull(
				"ca.ieso.reports.schema.dispsecurityconstraints.DocHeader could not be retrieved from XML",
				dispatchSecurityConstraintsClient.getDocHeader());
	}

	@Test
	public void testGetDocBody() {
		assertNotNull(
				"ca.ieso.reports.schema.dispsecurityconstraints.DocBody could not be retrieved from XML",
				dispatchSecurityConstraintsClient.getDocBody());
	}
}