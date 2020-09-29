/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LeasingApiService {

	SDLeasingActivateOutputModel activate(SDLeasingActivateInputModel request);
	
	SDLeasingConfigureOutputModel configure(String sdReferenceId, SDLeasingConfigureInputModel request);
	
	CRLeasingArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeasingArrangementControlInputModel request);
	
	BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request);
	
	BQLienExchangeOutputModel exchangeLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienExchangeInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQSweepExchangeOutputModel exchangeSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepExchangeInputModel request);
	
	CRLeasingArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeasingArrangementExchangeInputModel request);
	
	CRLeasingArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRLeasingArrangementExecuteInputModel request);
	
	SDLeasingFeedbackOutputModel feedback(String sdReferenceId, SDLeasingFeedbackInputModel request);
	
	CRLeasingArrangementInitiateOutputModel initiate(String sdReferenceId, CRLeasingArrangementInitiateInputModel request);
	
	BQCollateralInitiateOutputModel initiateCollateral(String sdReferenceId, String crReferenceId, BQCollateralInitiateInputModel request);
	
	BQCorporateActionInitiateOutputModel initiateCorporateaction(String sdReferenceId, String crReferenceId, BQCorporateActionInitiateInputModel request);
	
	BQDepositsInitiateOutputModel initiateDeposits(String sdReferenceId, String crReferenceId, BQDepositsInitiateInputModel request);
	
	BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request);
	
	BQFinancialInstrumentInitiateOutputModel initiateFinancialinstrument(String sdReferenceId, String crReferenceId, BQFinancialInstrumentInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQLienInitiateOutputModel initiateLien(String sdReferenceId, String crReferenceId, BQLienInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQSweepInitiateOutputModel initiateSweep(String sdReferenceId, String crReferenceId, BQSweepInitiateInputModel request);
	
	BQWithdrawalsInitiateOutputModel initiateWithdrawals(String sdReferenceId, String crReferenceId, BQWithdrawalsInitiateInputModel request);
	
	BQCollateralRequestOutputModel requestCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralRequestInputModel request);
	
	BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request);
	
	CRLeasingArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLeasingArrangementRequestInputModel request);
	
	CRLeasingArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCorporateActionRetrieveOutputModel retrieveCorporateaction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsRetrieveOutputModel retrieveDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialInstrumentRetrieveOutputModel retrieveFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQLienRetrieveOutputModel retrieveLien(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSweepRetrieveOutputModel retrieveSweep(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWithdrawalsRetrieveOutputModel retrieveWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDLeasingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLeasingArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeasingArrangementUpdateInputModel request);
	
	BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request);
	
	BQCorporateActionUpdateOutputModel updateCorporateaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionUpdateInputModel request);
	
	BQDepositsUpdateOutputModel updateDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsUpdateInputModel request);
	
	BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request);
	
	BQFinancialInstrumentUpdateOutputModel updateFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialInstrumentUpdateInputModel request);
	
	BQInterestUpdateOutputModel updateInterest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInterestUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQLienUpdateOutputModel updateLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
	BQSweepUpdateOutputModel updateSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepUpdateInputModel request);
	
	BQWithdrawalsUpdateOutputModel updateWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalsUpdateInputModel request);
	
}
