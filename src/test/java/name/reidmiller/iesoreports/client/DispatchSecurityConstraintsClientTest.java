package name.reidmiller.iesoreports.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import name.reidmiller.iesoreports.IesoPublicReportBindingsConfig;

import org.junit.Before;
import org.junit.Test;

import ca.ieso.reports.schema.dispsecurityconstraints.Document;

public class DispatchSecurityConstraintsClientTest {
	private DispatchSecurityConstraintsClient dispatchSecurityConstraintsClient;

	@Before
	public void setUp() throws Exception {
		dispatchSecurityConstraintsClient = IesoPublicReportBindingsConfig
				.dispatchSecurityConstraintsClient();
	}

	@Test
	public void testUnmarshal() {
		try {
			assertTrue(
					"Could not unmarshal a ca.ieso.reports.schema.dispsecurityconstraints.Document",
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