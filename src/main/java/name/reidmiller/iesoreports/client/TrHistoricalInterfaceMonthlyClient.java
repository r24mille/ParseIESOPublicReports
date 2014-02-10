package name.reidmiller.iesoreports.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ca.ieso.reports.schema.trapreauctioninterfacehistorymonthly.DocBody;
import ca.ieso.reports.schema.trapreauctioninterfacehistorymonthly.DocHeader;
import ca.ieso.reports.schema.trapreauctioninterfacehistorymonthly.Document;

public class TrHistoricalInterfaceMonthlyClient extends BaseReportClient {
	private Logger logger = LogManager.getLogger(this.getClass());
	private String defaultUrlString;
	private String jaxb2ContextPath;

	public TrHistoricalInterfaceMonthlyClient(String defaultUrlString, String jaxb2ContextPath) {
		this.defaultUrlString = defaultUrlString;
		this.jaxb2ContextPath = jaxb2ContextPath;
	}

	/**
	 * Unmarshals XML text from {@link #defaultUrlString} into a
	 * {@link Document} using JAXB2. This method is a wrapper around
	 * {@link #getDocument(String)}.
	 * 
	 * @return {@link Document}
	 * @throws MalformedURLException
	 * @throws IOException
	 * 
	 */
	public Document getDefaultDocument() throws MalformedURLException,
			IOException, ClassCastException {
		return this.getDocument(this.defaultUrlString);
	}

	/**
	 * This method uses {@link #defaultUrlString} to request the current
	 * (default) {@link DocBody}.
	 * 
	 * @return {@link DocBody} for the current (default) report.
	 * @throws MalformedURLException
	 * 
	 * @throws IOException
	 */
	public DocBody getDefaultDocBody() throws MalformedURLException,
			IOException {
		Document document = this.getDefaultDocument();
		return this.getDocBody(document);
	}

	/**
	 * This method uses {@link #defaultUrlString} to request the current
	 * (default) {@link DocHeader}.
	 * 
	 * @return {@link DocHeader} for the current (default) report.
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public DocHeader getDefaultDocHeader() throws MalformedURLException,
			IOException {
		Document document = this.getDefaultDocument();
		return this.getDocHeader(document);
	}

	/**
	 * Returns only the {@link DocBody} portion of the {@link Document}.
	 * 
	 * @param document
	 *            {@link Document} comprised of two parts: {@link DocHeader} and
	 *            {@link DocBody}.
	 * @return {@link DocBody}
	 */
	public DocBody getDocBody(Document document) {
		List<Object> docHeaderAndDocBody = document.getDocHeaderAndDocBody();
		return super.getDocPart(docHeaderAndDocBody, DocBody.class);
	}

	/**
	 * Get a {@link DocBody} for a date in past.
	 * 
	 * @param historyDate
	 *            Date in the past that a report is being requested for.
	 * @return Returns the {@link DocBody} of a past report.
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public DocBody getDocBodyForDate(Date historyDate)
			throws MalformedURLException, IOException {
		Document document = super.getDocumentForDate(this.defaultUrlString,
				this.jaxb2ContextPath, historyDate, Document.class);
		return this.getDocBody(document);
	}

	/**
	 * Makes a request for each Date in the provided range (inclusive) building
	 * out a {@link List} of {@link DocBody} objects.
	 * 
	 * @param startDate
	 *            Start point (inclusive) of the date range (ie. date furthest
	 *            in the past).
	 * @param endDate
	 *            End point (inclusive) of the date range (ie. date closest to
	 *            present).
	 * @return If the startDate is in the future, a one-item {@link List} of
	 *         {@link DocBody} Objects will be returned. If endDate is in the
	 *         future the {@link List} will stop at the current (default)
	 *         report.
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public List<DocBody> getDocBodiesInDateRange(Date startDate, Date endDate)
			throws MalformedURLException, IOException {
		List<DocBody> docBodies = new ArrayList<DocBody>();

		List<Document> documents = super.getDocumentsInDateRange(
				this.defaultUrlString, this.jaxb2ContextPath, startDate,
				endDate, Document.class);
		for (Document document : documents) {
			docBodies.add(this.getDocBody(document));
		}

		return docBodies;
	}

	/**
	 * Returns only the {@link DocHeader} portion of the {@link Document}.
	 * 
	 * @param document
	 *            {@link Document} comprised of two parts: {@link DocHeader} and
	 *            {@link DocBody}.
	 * 
	 * @return {@link DocHeader}
	 */
	public DocHeader getDocHeader(Document document) {
		List<Object> docHeaderAndDocBody = document.getDocHeaderAndDocBody();
		return super.getDocPart(docHeaderAndDocBody, DocHeader.class);
	}

	/**
	 * Get a {@link DocHeader} for a date in past.
	 * 
	 * @param historyDate
	 *            Date in the past that a report header is being requested for.
	 * @return Returns the {@link DocHeader} of a past report.
	 * @throws MalformedURLException
	 * 
	 * @throws IOException
	 */
	public DocHeader getDocHeaderForDate(Date historyDate)
			throws MalformedURLException, IOException {
		Document document = super.getDocumentForDate(this.defaultUrlString,
				this.jaxb2ContextPath, historyDate, Document.class);
		return this.getDocHeader(document);
	}

	/**
	 * Makes a request for each Date in the provided range (inclusive) building
	 * out a {@link List} of {@link DocHeader} Objects.
	 * 
	 * @param startDate
	 *            Start point (inclusive) of the date range (ie. date furthest
	 *            in the past).
	 * @param endDate
	 *            End point (inclusive) of the date range (ie. date closest to
	 *            present).
	 * @return If the startDate is in the future, a one-item {@link List} of
	 *         {@link DocHeader} Objects will be returned. If endDate is in the
	 *         future the {@link List} will stop at the current (default)
	 *         report.
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public List<DocHeader> getDocHeadersInDateRange(Date startDate, Date endDate)
			throws MalformedURLException, IOException {
		List<DocHeader> docHeaders = new ArrayList<DocHeader>();

		List<Document> documents = super.getDocumentsInDateRange(
				this.defaultUrlString, this.jaxb2ContextPath, startDate,
				endDate, Document.class);
		for (Document document : documents) {
			docHeaders.add(this.getDocHeader(document));
		}

		return docHeaders;
	}

	/**
	 * Unmarshals XML text into a {@link Document} using JAXB2, into the package
	 * name specified by {@link #jaxb2ContextPath}.
	 * 
	 * @param urlString
	 *            The URL that will be unmarshalled into a {@link Document}.
	 * @return {@link Document}
	 * @throws MalformedURLException
	 * @throws IOException
	 * 
	 */
	private Document getDocument(String urlString)
			throws MalformedURLException, IOException {
		return super.getDocument(urlString, this.jaxb2ContextPath,
				Document.class);
	}
}
