package name.reidmiller.iesoreports.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import name.reidmiller.iesoreports.IesoPublicReportBindingsConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import ca.ieso.reports.schema.intertiescheduleflow.IMODocument;
import ca.ieso.reports.schema.intertiescheduleflow.IMODocHeader;
import ca.ieso.reports.schema.intertiescheduleflow.IMODocBody;

public class IntertieScheduleAndFlowClientTest {
	private Logger logger = LogManager.getLogger(this.getClass());
	private IntertieScheduleAndFlowClient intertieScheduleAndFlowClient;

	@Before
	public void setUp() throws Exception {
		intertieScheduleAndFlowClient = IesoPublicReportBindingsConfig
				.intertieScheduleAndFlowClient();
	}

	@Test
	public void testGetDefaultDocument() {
		try {
			assertNotNull(IMODocument.class.getName()
					+ " could not be retrieved from XML",
					intertieScheduleAndFlowClient.getDefaultIMODocument());
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDefaultDocHeader() {
		try {
			assertNotNull(IMODocHeader.class.getName()
					+ " could not be retrieved from XML",
					intertieScheduleAndFlowClient.getDefaultIMODocHeader());
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocHeaderForDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date yesterday = cal.getTime();
		try {
			assertNotNull(IMODocHeader.class.getName()
					+ " could not be retrieved from XML",
					intertieScheduleAndFlowClient.getIMODocHeaderForDate(yesterday));
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocHeadersInDateRange() {
		Calendar calStart = Calendar.getInstance();
		calStart.add(Calendar.DATE, -3);

		try {
			List<IMODocHeader> docHeaders = intertieScheduleAndFlowClient
					.getIMODocHeadersInDateRange(calStart.getTime(), new Date());
			assertNotNull("List of " + IMODocHeader.class.getName()
					+ " Objects could not be retrieved from XML", docHeaders);
			assertEquals("Unexpected number of " + IMODocHeader.class.getName()
					+ " Objects returned.", docHeaders.size(), 4);
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocBodiesInDateRange() {
		Calendar calStart = Calendar.getInstance();
		calStart.add(Calendar.DATE, -3);

		try {
			List<IMODocBody> docBodies = intertieScheduleAndFlowClient.getIMODocBodiesInDateRange(
					calStart.getTime(), new Date());
			assertNotNull("List of " + IMODocBody.class.getName()
					+ " Objects could not be retrieved from XML", docBodies);
			assertEquals("Unexpected number of " + IMODocBody.class.getName()
					+ " Objects returned.", docBodies.size(), 4);
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDefaultDocBody() {
		try {
			assertNotNull(IMODocBody.class.getName()
					+ " could not be retrieved from XML",
					intertieScheduleAndFlowClient.getDefaultIMODocBody());
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetDocBodyForDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date yesterday = cal.getTime();
		try {
			assertNotNull(IMODocBody.class.getName()
					+ " could not be retrieved from XML",
					intertieScheduleAndFlowClient.getIMODocBodyForDate(yesterday));
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
}
