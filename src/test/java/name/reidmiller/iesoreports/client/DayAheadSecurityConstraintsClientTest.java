package name.reidmiller.iesoreports.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import name.reidmiller.iesoreports.client.DayAheadSecurityConstraintsClient;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import ca.ieso.reports.schema.dasecurityconstraints.Document;

public class DayAheadSecurityConstraintsClientTest {
	private ApplicationContext appContext;
	private DayAheadSecurityConstraintsClient dayAheadSecurityConstraintsClient;

	@Before
	public void setUp() throws Exception {
		appContext = new FileSystemXmlApplicationContext(
				"src/resources/spring/applicationContext.xml");
		dayAheadSecurityConstraintsClient = (DayAheadSecurityConstraintsClient) appContext
				.getBean("dayAheadSecurityConstraintsClient");
	}

	@Test
	public void testUnmarshal() {
		try {
			assertTrue(
					"Could not unmarshal a ca.ieso.reports.schema.dasecurityconstraints.Document",
					dayAheadSecurityConstraintsClient.unmarshal() instanceof Document);
		} catch (ClassCastException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocHeader() {
		assertNotNull(
				"ca.ieso.reports.schema.dasecurityconstraints.DocHeader could not be retrieved from XML",
				dayAheadSecurityConstraintsClient.getDocHeader());
	}

	@Test
	public void testGetDocBody() {
		assertNotNull(
				"ca.ieso.reports.schema.dasecurityconstraints.DocBody could not be retrieved from XML",
				dayAheadSecurityConstraintsClient.getDocBody());
	}
}