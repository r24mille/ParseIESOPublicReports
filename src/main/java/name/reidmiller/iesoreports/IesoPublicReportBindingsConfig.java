package name.reidmiller.iesoreports;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import name.reidmiller.iesoreports.client.AdequacyClient;
import name.reidmiller.iesoreports.client.DayAheadAdequacyClient;
import name.reidmiller.iesoreports.client.DayAheadAreaOperatingReserveShortfallClient;
import name.reidmiller.iesoreports.client.DayAheadAreaReserveConstraintsClient;
import name.reidmiller.iesoreports.client.DayAheadConstrainedTotalsClient;
import name.reidmiller.iesoreports.client.DayAheadIntertieSchedulingLimitsClient;
import name.reidmiller.iesoreports.client.DayAheadSecurityConstraintsClient;
import name.reidmiller.iesoreports.client.DayAheadShadowPricesClient;
import name.reidmiller.iesoreports.client.DispatchAreaOperatingReserveShortfallsClient;
import name.reidmiller.iesoreports.client.DispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient;
import name.reidmiller.iesoreports.client.DispatchSecurityConstraintsClient;
import name.reidmiller.iesoreports.client.GeneratorOutputCapabilityClient;
import name.reidmiller.iesoreports.client.GlobalAdjustmentRatesClient;
import name.reidmiller.iesoreports.client.HistoricalTransmissionOutagesClient;
import name.reidmiller.iesoreports.client.HourlyOntarioEnergyPriceReportClient;
import name.reidmiller.iesoreports.client.IntertieScheduleAndFlowClient;
import name.reidmiller.iesoreports.client.NetInterchangeSchedulingLimitClient;
import name.reidmiller.iesoreports.client.PlannedTransmissionOutagesDayClient;
import name.reidmiller.iesoreports.client.PlannedTransmissionOutagesMonthClient;
import name.reidmiller.iesoreports.client.PlannedTransmissionOutagesSixMonthsClient;
import name.reidmiller.iesoreports.client.PredispatchAreaOperatingReserveShortfallsClient;
import name.reidmiller.iesoreports.client.PredispatchAreaReserveConstraintsClient;
import name.reidmiller.iesoreports.client.PredispatchConstrainedTotalsClient;
import name.reidmiller.iesoreports.client.PredispatchIntertieSchedulingLimitsClient;
import name.reidmiller.iesoreports.client.PredispatchMarketPriceClient;
import name.reidmiller.iesoreports.client.PredispatchMarketTotalsClient;
import name.reidmiller.iesoreports.client.PredispatchSecurityConstraintsClient;
import name.reidmiller.iesoreports.client.PredispatchShadowPricesClient;
import name.reidmiller.iesoreports.client.RealtimeAreaReserveConstraintsClient;
import name.reidmiller.iesoreports.client.RealtimeConstrainedTotalsClient;
import name.reidmiller.iesoreports.client.RealtimeIntertieSchedulingLimitsClient;
import name.reidmiller.iesoreports.client.RealtimeMarketPriceClient;
import name.reidmiller.iesoreports.client.RealtimeMarketTotalsClient;
import name.reidmiller.iesoreports.client.RealtimeOperatingReserveInMarketClient;
import name.reidmiller.iesoreports.client.RealtimeShadowPricesClient;
import name.reidmiller.iesoreports.client.SurplusBaseloadGenerationClient;
import name.reidmiller.iesoreports.client.TraPostAuctionMcpLtRoundOneClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class IesoPublicReportBindingsConfig {
	static Logger logger = LogManager
			.getLogger(IesoPublicReportBindingsConfig.class.getName());

	/**
	 * Adequacy
	 * 
	 * @return
	 */
	@Bean
	public static AdequacyClient adequacyClient() {
		AdequacyClient adequacyClient = null;
		try {
			adequacyClient = new AdequacyClient(
					buildURL("http://reports.ieso.ca/public/Adequacy/PUB_Adequacy.xml"),
					buildMarshaller("ca.ieso.reports.schema.adequacy"),
					buildMarshaller("ca.ieso.reports.schema.adequacy"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return adequacyClient;
	}

	/**
	 * Day-Ahead Adequacy
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadAdequacyClient dayAheadAdequacyClient() {
		DayAheadAdequacyClient dayAheadAdequacyClient = null;
		try {
			dayAheadAdequacyClient = new DayAheadAdequacyClient(
					buildURL("http://reports.ieso.ca/public/DAAdequacy/PUB_DAAdequacy.xml"),
					buildMarshaller("ca.ieso.reports.schema.daadequacy"),
					buildMarshaller("ca.ieso.reports.schema.daadequacy"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadAdequacyClient;
	}

	/**
	 * Day-Ahead Area Operating Reserve Shortfall
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadAreaOperatingReserveShortfallClient dayAheadAreaOperatingReserveShortfallClient() {
		DayAheadAreaOperatingReserveShortfallClient dayAheadAreaOperatingReserveShortfallClient = null;
		try {
			dayAheadAreaOperatingReserveShortfallClient = new DayAheadAreaOperatingReserveShortfallClient(
					buildURL("http://reports.ieso.ca/public/DAAreaOpResShortfall/PUB_DAAreaOpResShortfall.xml"),
					buildMarshaller("ca.ieso.reports.schema.daareaopresshortfall"),
					buildMarshaller("ca.ieso.reports.schema.daareaopresshortfall"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadAreaOperatingReserveShortfallClient;
	}

	/**
	 * Day-Ahead Area Reserve Constraints
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadAreaReserveConstraintsClient dayAheadAreaReserveConstraintsClient() {
		DayAheadAreaReserveConstraintsClient dayAheadAreaReserveConstraintsClient = null;
		try {
			dayAheadAreaReserveConstraintsClient = new DayAheadAreaReserveConstraintsClient(
					buildURL("http://reports.ieso.ca/public/DAAreaReserveConst/PUB_DAAreaReserveConst.xml"),
					buildMarshaller("ca.ieso.reports.schema.daareareserveconst"),
					buildMarshaller("ca.ieso.reports.schema.daareareserveconst"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadAreaReserveConstraintsClient;
	}

	/**
	 * Day-Ahead Constrained Totals
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadConstrainedTotalsClient dayAheadConstrainedTotalsClient() {
		DayAheadConstrainedTotalsClient dayAheadConstrainedTotalsClient = null;
		try {
			dayAheadConstrainedTotalsClient = new DayAheadConstrainedTotalsClient(
					buildURL("http://reports.ieso.ca/public/DAConstTotals/PUB_DAConstTotals.xml"),
					buildMarshaller("ca.ieso.reports.schema.daconsttotals"),
					buildMarshaller("ca.ieso.reports.schema.daconsttotals"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadConstrainedTotalsClient;
	}

	/**
	 * Day-Ahead Intertie Scheduling Limits
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadIntertieSchedulingLimitsClient dayAheadIntertieSchedulingLimitsClient() {
		DayAheadIntertieSchedulingLimitsClient dayAheadIntertieSchedulingLimitsClient = null;
		try {
			dayAheadIntertieSchedulingLimitsClient = new DayAheadIntertieSchedulingLimitsClient(
					buildURL("http://reports.ieso.ca/public/DAIntertieSchedLimits/PUB_DAIntertieSchedLimits.xml"),
					buildMarshaller("ca.ieso.reports.schema.daintertieschedlimits"),
					buildMarshaller("ca.ieso.reports.schema.daintertieschedlimits"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadIntertieSchedulingLimitsClient;
	}

	/**
	 * Day-Ahead Security Constraints
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadSecurityConstraintsClient dayAheadSecurityConstraintsClient() {
		DayAheadSecurityConstraintsClient dayAheadSecurityConstraintsClient = null;
		try {
			dayAheadSecurityConstraintsClient = new DayAheadSecurityConstraintsClient(
					buildURL("http://reports.ieso.ca/public/DASecurityConstraints/PUB_DASecurityConstraints.xml"),
					buildMarshaller("ca.ieso.reports.schema.dasecurityconstraints"),
					buildMarshaller("ca.ieso.reports.schema.dasecurityconstraints"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadSecurityConstraintsClient;
	}

	/**
	 * Day-Ahead Shadow Prices
	 * 
	 * @return
	 */
	@Bean
	public static DayAheadShadowPricesClient dayAheadShadowPricesClient() {
		DayAheadShadowPricesClient dayAheadShadowPricesClient = null;
		try {
			dayAheadShadowPricesClient = new DayAheadShadowPricesClient(
					buildURL("http://reports.ieso.ca/public/DAShadowPrices/PUB_DAShadowPrices.xml"),
					buildMarshaller("ca.ieso.reports.schema.dashadowprices"),
					buildMarshaller("ca.ieso.reports.schema.dashadowprices"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dayAheadShadowPricesClient;
	}

	/**
	 * Dispatch Area Operating Reserve: Total Scheduled and Total Energy Called
	 * 
	 * @return
	 */
	@Bean
	public static DispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient dispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient() {
		DispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient dispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient = null;
		try {
			dispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient = new DispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient(
					buildURL("http://reports.ieso.ca/public/DispAreaOpResAndEnergyCalled/PUB_DispAreaOpResAndEnergyCalled.xml"),
					buildMarshaller("ca.ieso.reports.schema.dispareaopresandenergycalled"),
					buildMarshaller("ca.ieso.reports.schema.dispareaopresandenergycalled"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dispatchAreaOperatingReserveTotalScheduledAndTotalEnergyCalledClient;
	}

	/**
	 * Dispatch Area Operating Reserve Shortfalls
	 * 
	 * @return
	 */
	@Bean
	public static DispatchAreaOperatingReserveShortfallsClient dispatchAreaOperatingReserveShortfallsClient() {
		DispatchAreaOperatingReserveShortfallsClient dispatchAreaOperatingReserveShortfallsClient = null;
		try {
			dispatchAreaOperatingReserveShortfallsClient = new DispatchAreaOperatingReserveShortfallsClient(
					buildURL("http://reports.ieso.ca/public/DispAreaOpResShortfalls/PUB_DispAreaOpResShortfalls.xml"),
					buildMarshaller("ca.ieso.reports.schema.dispareaopresshortfalls"),
					buildMarshaller("ca.ieso.reports.schema.dispareaopresshortfalls"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dispatchAreaOperatingReserveShortfallsClient;
	}

	/**
	 * Dispatch Security Constraints
	 * 
	 * @return
	 */
	@Bean
	public static DispatchSecurityConstraintsClient dispatchSecurityConstraintsClient() {
		DispatchSecurityConstraintsClient dispatchSecurityConstraintsClient = null;
		try {
			dispatchSecurityConstraintsClient = new DispatchSecurityConstraintsClient(
					buildURL("http://reports.ieso.ca/public/DispSecurityConstraints/PUB_DispSecurityConstraints.xml"),
					buildMarshaller("ca.ieso.reports.schema.dispsecurityconstraints"),
					buildMarshaller("ca.ieso.reports.schema.dispsecurityconstraints"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return dispatchSecurityConstraintsClient;
	}

	/**
	 * Hourly Ontario Energy Price (HOEP) Report
	 * 
	 * @return
	 */
	@Bean
	public static HourlyOntarioEnergyPriceReportClient hourlyOntarioEnergyPriceReportClient() {
		HourlyOntarioEnergyPriceReportClient hourlyOntarioEnergyPriceReportClient = null;
		try {
			hourlyOntarioEnergyPriceReportClient = new HourlyOntarioEnergyPriceReportClient(
					buildURL("http://reports.ieso.ca/public/DispUnconsHOEP/PUB_DispUnconsHOEP.xml"),
					buildMarshaller("ca.ieso.reports.schema.dispunconshoep"),
					buildMarshaller("ca.ieso.reports.schema.dispunconshoep"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return hourlyOntarioEnergyPriceReportClient;
	}

	/**
	 * Generator Output Capability
	 * 
	 * @return
	 */
	@Bean
	public static GeneratorOutputCapabilityClient generatorOutputCapabilityClient() {
		GeneratorOutputCapabilityClient generatorOutputCapabilityClient = null;
		try {
			generatorOutputCapabilityClient = new GeneratorOutputCapabilityClient(
					buildURL("http://reports.ieso.ca/public/GenOutputCapability/PUB_GenOutputCapability.xml"),
					buildMarshaller("ca.ieso.reports.schema.genoutputcapability"),
					buildMarshaller("ca.ieso.reports.schema.genoutputcapability"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return generatorOutputCapabilityClient;
	}

	/**
	 * IESO Global Adjustment Class B Rates
	 * 
	 * @return
	 */
	@Bean
	public static GlobalAdjustmentRatesClient globalAdjustmentRatesClient() {
		GlobalAdjustmentRatesClient globalAdjustmentRatesClient = null;
		try {
			globalAdjustmentRatesClient = new GlobalAdjustmentRatesClient(
					buildURL("http://reports.ieso.ca/public/GlobalAdjustment/PUB_GlobalAdjustment.xml"),
					buildMarshaller("ca.ieso.reports.schema.globaladjustment"),
					buildMarshaller("ca.ieso.reports.schema.globaladjustment"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return globalAdjustmentRatesClient;
	}

	/**
	 * Historical Transmission Outages
	 * 
	 * @return
	 */
	@Bean
	public static HistoricalTransmissionOutagesClient historicalTransmissionOutagesClient() {
		HistoricalTransmissionOutagesClient historicalTransmissionOutagesClient = null;
		try {
			historicalTransmissionOutagesClient = new HistoricalTransmissionOutagesClient(
					buildURL("http://reports.ieso.ca/public/IOMSPublicHistoricOutageHour/PUB_IOMSPublicHistoricOutageHour.xml"),
					buildMarshaller("ca.ieso.reports.schema.iomspublichistoricoutagehour"),
					buildMarshaller("ca.ieso.reports.schema.iomspublichistoricoutagehour"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return historicalTransmissionOutagesClient;
	}

	/**
	 * Planned Transmission Outages (Day)
	 * 
	 * @return
	 */
	@Bean
	public static PlannedTransmissionOutagesDayClient plannedTransmissionOutagesDayClient() {
		PlannedTransmissionOutagesDayClient plannedTransmissionOutagesDayClient = null;
		try {
			plannedTransmissionOutagesDayClient = new PlannedTransmissionOutagesDayClient(
					buildURL("http://reports.ieso.ca/public/IOMSPublicPlannedOutageDay/PUB_IOMSPublicPlannedOutageDay.xml"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplannedoutageday"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplannedoutageday"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return plannedTransmissionOutagesDayClient;
	}

	/**
	 * Planned Transmission Outages (Month)
	 * 
	 * @return
	 */
	@Bean
	public static PlannedTransmissionOutagesMonthClient plannedTransmissionOutagesMonthClient() {
		PlannedTransmissionOutagesMonthClient plannedTransmissionOutagesMonthClient = null;
		try {
			plannedTransmissionOutagesMonthClient = new PlannedTransmissionOutagesMonthClient(
					buildURL("http://reports.ieso.ca/public/IOMSPublicPlannedOutageMonth/PUB_IOMSPublicPlannedOutageMonth.xml"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplanneodutagemonth"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplanneodutagemonth"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return plannedTransmissionOutagesMonthClient;
	}

	/**
	 * Planned Transmission Outages (Six Months)
	 * 
	 * @return
	 */
	@Bean
	public static PlannedTransmissionOutagesSixMonthsClient plannedTransmissionOutagesSixMonthsClient() {
		PlannedTransmissionOutagesSixMonthsClient plannedTransmissionOutagesSixMonthsClient = null;
		try {
			plannedTransmissionOutagesSixMonthsClient = new PlannedTransmissionOutagesSixMonthsClient(
					buildURL("http://reports.ieso.ca/public/IOMSPublicPlannedOutageSixMonths/PUB_IOMSPublicPlannedOutageSixMonths.xml"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplannedoutagesixmonths"),
					buildMarshaller("ca.ieso.reports.schema.iomspublicplannedoutagesixmonths"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return plannedTransmissionOutagesSixMonthsClient;
	}

	/**
	 * Intertie Schedule and Flow Report
	 * 
	 * @return
	 */
	@Bean
	public static IntertieScheduleAndFlowClient intertieScheduleAndFlowClient() {
		IntertieScheduleAndFlowClient intertieScheduleAndFlowClient = null;
		try {
			intertieScheduleAndFlowClient = new IntertieScheduleAndFlowClient(
					buildURL("http://reports.ieso.ca/public/IntertieScheduleFlow/PUB_IntertieScheduleFlow.xml"),
					buildMarshaller("ca.ieso.reports.schema.intertiescheduleflow"),
					buildMarshaller("ca.ieso.reports.schema.intertiescheduleflow"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return intertieScheduleAndFlowClient;
	}

	/**
	 * Net Interchange Scheduling Limit Report
	 * 
	 * @return
	 */
	@Bean
	public static NetInterchangeSchedulingLimitClient netInterchangeSchedulingLimitClient() {
		NetInterchangeSchedulingLimitClient netInterchangeSchedulingLimitClient = null;
		try {
			netInterchangeSchedulingLimitClient = new NetInterchangeSchedulingLimitClient(
					buildURL("http://reports.ieso.ca/public/NISLShadowPrices/PUB_NISLShadowPrices.xml"),
					buildMarshaller("ca.ieso.reports.schema.nislshadowprices"),
					buildMarshaller("ca.ieso.reports.schema.nislshadowpricess"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return netInterchangeSchedulingLimitClient;
	}

	/**
	 * Predispatch Area Operating Reserve Shortfalls
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchAreaOperatingReserveShortfallsClient predispatchAreaOperatingReserveShortfallsClient() {
		PredispatchAreaOperatingReserveShortfallsClient predispatchAreaOperatingReserveShortfallsClient = null;
		try {
			predispatchAreaOperatingReserveShortfallsClient = new PredispatchAreaOperatingReserveShortfallsClient(
					buildURL("http://reports.ieso.ca/public/PredispAreaOpResShortfalls/PUB_PredispAreaOpResShortfalls.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispareaopresshortfalls"),
					buildMarshaller("ca.ieso.reports.schema.predispareaopresshortfalls"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchAreaOperatingReserveShortfallsClient;
	}

	/**
	 * Predispatch Area Reserve Constraints Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchAreaReserveConstraintsClient predispatchAreaReserveConstraintsClient() {
		PredispatchAreaReserveConstraintsClient predispatchAreaReserveConstraintsClient = null;
		try {
			predispatchAreaReserveConstraintsClient = new PredispatchAreaReserveConstraintsClient(
					buildURL("http://reports.ieso.ca/public/PredispAreaReserveConst/PUB_PredispAreaReserveConst.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispareareserveconst"),
					buildMarshaller("ca.ieso.reports.schema.predispareareserveconst"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchAreaReserveConstraintsClient;
	}

	/**
	 * Predispatch Constrained Totals Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchConstrainedTotalsClient predispatchConstrainedTotalsClient() {
		PredispatchConstrainedTotalsClient predispatchConstrainedTotalsClient = null;
		try {
			predispatchConstrainedTotalsClient = new PredispatchConstrainedTotalsClient(
					buildURL("http://reports.ieso.ca/public/PredispConstTotals/PUB_PredispConstTotals.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispconsttotals"),
					buildMarshaller("ca.ieso.reports.schema.predispconsttotals"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchConstrainedTotalsClient;
	}

	/**
	 * Predispatch Intertie Scheduling Limits Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchIntertieSchedulingLimitsClient predispatchIntertieSchedulingLimitsClient() {
		PredispatchIntertieSchedulingLimitsClient predispatchIntertieSchedulingLimitsClient = null;
		try {
			predispatchIntertieSchedulingLimitsClient = new PredispatchIntertieSchedulingLimitsClient(
					buildURL("http://reports.ieso.ca/public/PredispIntertieSchedLimits/PUB_PredispIntertieSchedLimits.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispintertieschedlimits"),
					buildMarshaller("ca.ieso.reports.schema.predispintertieschedlimits"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchIntertieSchedulingLimitsClient;
	}

	/**
	 * Predispatch Market Price Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchMarketPriceClient predispatchMarketPriceClient() {
		PredispatchMarketPriceClient predispatchMarketPriceClient = null;
		try {
			predispatchMarketPriceClient = new PredispatchMarketPriceClient(
					buildURL("http://reports.ieso.ca/public/PredispMktPrice/PUB_PredispMktPrice.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispmktprice"),
					buildMarshaller("ca.ieso.reports.schema.predispmktprice"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchMarketPriceClient;
	}

	/**
	 * Predispatch Market Totals Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchMarketTotalsClient predispatchMarketTotalsClient() {
		PredispatchMarketTotalsClient predispatchMarketTotalsClient = null;
		try {
			predispatchMarketTotalsClient = new PredispatchMarketTotalsClient(
					buildURL("http://reports.ieso.ca/public/PredispMktTotals/PUB_PredispMktTotals.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispmkttotals"),
					buildMarshaller("ca.ieso.reports.schema.predispmkttotals"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchMarketTotalsClient;
	}

	/**
	 * Predispatch Security Constraints
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchSecurityConstraintsClient predispatchSecurityConstraintsClient() {
		PredispatchSecurityConstraintsClient predispatchSecurityConstraintsClient = null;
		try {
			predispatchSecurityConstraintsClient = new PredispatchSecurityConstraintsClient(
					buildURL("http://reports.ieso.ca/public/PredispSecurityConstraints/PUB_PredispSecurityConstraints.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispsecurityconstraints"),
					buildMarshaller("ca.ieso.reports.schema.predispsecurityconstraints"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchSecurityConstraintsClient;
	}

	/**
	 * Predispatch Shadow Prices Report
	 * 
	 * @return
	 */
	@Bean
	public static PredispatchShadowPricesClient predispatchShadowPricesClient() {
		PredispatchShadowPricesClient predispatchShadowPricesClient = null;
		try {
			predispatchShadowPricesClient = new PredispatchShadowPricesClient(
					buildURL("http://reports.ieso.ca/public/PredispShadowPrices/PUB_PredispShadowPrices.xml"),
					buildMarshaller("ca.ieso.reports.schema.predispshadowprices"),
					buildMarshaller("ca.ieso.reports.schema.predispshadowprices"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return predispatchShadowPricesClient;
	}

	/**
	 * Realtime Area Reserve Constraints Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeAreaReserveConstraintsClient realtimeAreaReserveConstraintsClient() {
		RealtimeAreaReserveConstraintsClient realtimeAreaReserveConstraintsClient = null;
		try {
			realtimeAreaReserveConstraintsClient = new RealtimeAreaReserveConstraintsClient(
					buildURL("http://reports.ieso.ca/public/RealtimeAreaReserveConst/PUB_RealtimeAreaReserveConst.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimeareareserveconst"),
					buildMarshaller("ca.ieso.reports.schema.realtimeareareserveconst"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeAreaReserveConstraintsClient;
	}

	/**
	 * Realtime Constrained Totals Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeConstrainedTotalsClient realtimeConstrainedTotalsClient() {
		RealtimeConstrainedTotalsClient realtimeConstrainedTotalsClient = null;
		try {
			realtimeConstrainedTotalsClient = new RealtimeConstrainedTotalsClient(
					buildURL("http://reports.ieso.ca/public/RealtimeConstTotals/PUB_RealtimeConstTotals.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimeconsttotals"),
					buildMarshaller("ca.ieso.reports.schema.realtimeconsttotals"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeConstrainedTotalsClient;
	}

	/**
	 * Realtime Intertie Scheduling Limits Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeIntertieSchedulingLimitsClient realtimeIntertieSchedulingLimitsClient() {
		RealtimeIntertieSchedulingLimitsClient realtimeIntertieSchedulingLimitsClient = null;
		try {
			realtimeIntertieSchedulingLimitsClient = new RealtimeIntertieSchedulingLimitsClient(
					buildURL("http://reports.ieso.ca/public/RealtimeIntertieSchedLimits/PUB_RealtimeIntertieSchedLimits.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimeintertieschedlimits"),
					buildMarshaller("ca.ieso.reports.schema.realtimeintertieschedlimits"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeIntertieSchedulingLimitsClient;
	}

	/**
	 * Realtime Market Price Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeMarketPriceClient realtimeMarketPriceClient() {
		RealtimeMarketPriceClient realtimeMarketPriceClient = null;
		try {
			realtimeMarketPriceClient = new RealtimeMarketPriceClient(
					buildURL("http://reports.ieso.ca/public/RealtimeMktPrice/PUB_RealtimeMktPrice.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimemktprice"),
					buildMarshaller("ca.ieso.reports.schema.realtimemktprice"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeMarketPriceClient;
	}

	/**
	 * Realtime Market Totals Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeMarketTotalsClient realtimeMarketTotalsClient() {
		RealtimeMarketTotalsClient realtimeMarketTotalsClient = null;
		try {
			realtimeMarketTotalsClient = new RealtimeMarketTotalsClient(
					buildURL("http://reports.ieso.ca/public/PredispMktTotals/PUB_PredispMktTotals.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimemkttotals"),
					buildMarshaller("ca.ieso.reports.schema.realtimemkttotals"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeMarketTotalsClient;
	}

	/**
	 * Realtime Operating Reserve In Market Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeOperatingReserveInMarketClient realtimeOperatingReserveInMarketClient() {
		RealtimeOperatingReserveInMarketClient realtimeOperatingReserveInMarketClient = null;
		try {
			realtimeOperatingReserveInMarketClient = new RealtimeOperatingReserveInMarketClient(
					buildURL("http://reports.ieso.ca/public/RealtimeORIM/PUB_RealtimeORIM.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimeorim"),
					buildMarshaller("ca.ieso.reports.schema.realtimeorim"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeOperatingReserveInMarketClient;
	}

	/**
	 * Realtime Shadow Prices Report
	 * 
	 * @return
	 */
	@Bean
	public static RealtimeShadowPricesClient realtimeShadowPricesClient() {
		RealtimeShadowPricesClient realtimeShadowPricesClient = null;
		try {
			realtimeShadowPricesClient = new RealtimeShadowPricesClient(
					buildURL("http://reports.ieso.ca/public/RealtimeShadowPrices/PUB_RealtimeShadowPrices.xml"),
					buildMarshaller("ca.ieso.reports.schema.realtimeshadowprices"),
					buildMarshaller("ca.ieso.reports.schema.realtimeshadowprices"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return realtimeShadowPricesClient;
	}

	/**
	 * Surplus Baseload Generation Report
	 * 
	 * @return
	 */
	@Bean
	public static SurplusBaseloadGenerationClient surplusBaseloadGenerationClient() {
		SurplusBaseloadGenerationClient surplusBaseloadGenerationClient = null;

		surplusBaseloadGenerationClient = new SurplusBaseloadGenerationClient(
				surplusBaseloadGenerationDateFormat(), new Date(),
				"http://www.ieso.ca/weather/mkt4/sbg/PUB_SurplusBaseloadGen_",
				"_v1.xml", buildMarshaller("ca.ieso.reports.schema.sbg"),
				buildMarshaller("ca.ieso.reports.schema.sbg"));

		return surplusBaseloadGenerationClient;
	}

	@Bean
	public static SimpleDateFormat surplusBaseloadGenerationDateFormat() {
		return new SimpleDateFormat("yyyyMMdd");
	}

	/**
	 * Transmission Rights Auction (TRA) Post Auction MCP LT Round 1 Report
	 * 
	 * @return
	 */
	@Bean
	public static TraPostAuctionMcpLtRoundOneClient traPostAuctionMcpLtRoundOneClient() {
		TraPostAuctionMcpLtRoundOneClient traPostAuctionMcpLtRoundOneClient = null;
		try {
			traPostAuctionMcpLtRoundOneClient = new TraPostAuctionMcpLtRoundOneClient(
					buildURL("http://reports.ieso.ca/public/TRAPostauctionMCPLTr1/PUB_TRAPostauctionMCPLTr1.xml"),
					buildMarshaller("ca.ieso.reports.schema.trapostauctionmcpltr1"),
					buildMarshaller("ca.ieso.reports.schema.trapostauctionmcpltr1"));
		} catch (MalformedURLException e) {
			logger.error(e.getLocalizedMessage());
		}

		return traPostAuctionMcpLtRoundOneClient;
	}

	private static Jaxb2Marshaller buildMarshaller(String contextPath) {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setContextPath(contextPath);
		return jaxb2Marshaller;
	}

	private static URL buildURL(String urlString) throws MalformedURLException {
		URL url = new URL(
				"http://reports.ieso.ca/public/Adequacy/PUB_Adequacy.xml");
		return url;
	}
}