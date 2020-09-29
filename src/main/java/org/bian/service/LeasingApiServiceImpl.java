/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LeasingApiServiceImpl implements LeasingApiService {

	public SDLeasingActivateOutputModel activate(SDLeasingActivateInputModel request){
		return JsonReader.read("activate-SDLeasingActivateOutputModel.json",new TypeReference<SDLeasingActivateOutputModel>(){});
	}
	
	public SDLeasingConfigureOutputModel configure(String sdReferenceId, SDLeasingConfigureInputModel request){
		return JsonReader.read("configure-SDLeasingConfigureOutputModel.json",new TypeReference<SDLeasingConfigureOutputModel>(){});
	}
	
	public CRLeasingArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeasingArrangementControlInputModel request){
		return JsonReader.read("control-CRLeasingArrangementControlOutputModel.json",new TypeReference<CRLeasingArrangementControlOutputModel>(){});
	}
	
	public BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQFeesExchangeOutputModel.json",new TypeReference<BQFeesExchangeOutputModel>(){});
	}
	
	public BQLienExchangeOutputModel exchangeLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienExchangeInputModel request){
		return JsonReader.read("exchange-BQLienExchangeOutputModel.json",new TypeReference<BQLienExchangeOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQSweepExchangeOutputModel exchangeSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepExchangeInputModel request){
		return JsonReader.read("exchange-BQSweepExchangeOutputModel.json",new TypeReference<BQSweepExchangeOutputModel>(){});
	}
	
	public CRLeasingArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeasingArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRLeasingArrangementExchangeOutputModel.json",new TypeReference<CRLeasingArrangementExchangeOutputModel>(){});
	}
	
	public CRLeasingArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRLeasingArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRLeasingArrangementExecuteOutputModel.json",new TypeReference<CRLeasingArrangementExecuteOutputModel>(){});
	}
	
	public SDLeasingFeedbackOutputModel feedback(String sdReferenceId, SDLeasingFeedbackInputModel request){
		return JsonReader.read("feedback-SDLeasingFeedbackOutputModel.json",new TypeReference<SDLeasingFeedbackOutputModel>(){});
	}
	
	public CRLeasingArrangementInitiateOutputModel initiate(String sdReferenceId, CRLeasingArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRLeasingArrangementInitiateOutputModel.json",new TypeReference<CRLeasingArrangementInitiateOutputModel>(){});
	}
	
	public BQCollateralInitiateOutputModel initiateCollateral(String sdReferenceId, String crReferenceId, BQCollateralInitiateInputModel request){
		return JsonReader.read("initiate-BQCollateralInitiateOutputModel.json",new TypeReference<BQCollateralInitiateOutputModel>(){});
	}
	
	public BQCorporateActionInitiateOutputModel initiateCorporateaction(String sdReferenceId, String crReferenceId, BQCorporateActionInitiateInputModel request){
		return JsonReader.read("initiate-BQCorporateActionInitiateOutputModel.json",new TypeReference<BQCorporateActionInitiateOutputModel>(){});
	}
	
	public BQDepositsInitiateOutputModel initiateDeposits(String sdReferenceId, String crReferenceId, BQDepositsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsInitiateOutputModel.json",new TypeReference<BQDepositsInitiateOutputModel>(){});
	}
	
	public BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQFeesInitiateOutputModel.json",new TypeReference<BQFeesInitiateOutputModel>(){});
	}
	
	public BQFinancialInstrumentInitiateOutputModel initiateFinancialinstrument(String sdReferenceId, String crReferenceId, BQFinancialInstrumentInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialInstrumentInitiateOutputModel.json",new TypeReference<BQFinancialInstrumentInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQLienInitiateOutputModel initiateLien(String sdReferenceId, String crReferenceId, BQLienInitiateInputModel request){
		return JsonReader.read("initiate-BQLienInitiateOutputModel.json",new TypeReference<BQLienInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQSweepInitiateOutputModel initiateSweep(String sdReferenceId, String crReferenceId, BQSweepInitiateInputModel request){
		return JsonReader.read("initiate-BQSweepInitiateOutputModel.json",new TypeReference<BQSweepInitiateOutputModel>(){});
	}
	
	public BQWithdrawalsInitiateOutputModel initiateWithdrawals(String sdReferenceId, String crReferenceId, BQWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQWithdrawalsInitiateOutputModel.json",new TypeReference<BQWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQCollateralRequestOutputModel requestCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralRequestInputModel request){
		return JsonReader.read("request-BQCollateralRequestOutputModel.json",new TypeReference<BQCollateralRequestOutputModel>(){});
	}
	
	public BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request){
		return JsonReader.read("request-BQFeesRequestOutputModel.json",new TypeReference<BQFeesRequestOutputModel>(){});
	}
	
	public CRLeasingArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLeasingArrangementRequestInputModel request){
		return JsonReader.read("request-CRLeasingArrangementRequestOutputModel.json",new TypeReference<CRLeasingArrangementRequestOutputModel>(){});
	}
	
	public CRLeasingArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLeasingArrangementRetrieveOutputModel.json",new TypeReference<CRLeasingArrangementRetrieveOutputModel>(){});
	}
	
	public BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralRetrieveOutputModel.json",new TypeReference<BQCollateralRetrieveOutputModel>(){});
	}
	
	public BQCorporateActionRetrieveOutputModel retrieveCorporateaction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCorporateActionRetrieveOutputModel.json",new TypeReference<BQCorporateActionRetrieveOutputModel>(){});
	}
	
	public BQDepositsRetrieveOutputModel retrieveDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsRetrieveOutputModel.json",new TypeReference<BQDepositsRetrieveOutputModel>(){});
	}
	
	public BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeesRetrieveOutputModel.json",new TypeReference<BQFeesRetrieveOutputModel>(){});
	}
	
	public BQFinancialInstrumentRetrieveOutputModel retrieveFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialInstrumentRetrieveOutputModel.json",new TypeReference<BQFinancialInstrumentRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQLienRetrieveOutputModel retrieveLien(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLienRetrieveOutputModel.json",new TypeReference<BQLienRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQSweepRetrieveOutputModel retrieveSweep(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSweepRetrieveOutputModel.json",new TypeReference<BQSweepRetrieveOutputModel>(){});
	}
	
	public BQWithdrawalsRetrieveOutputModel retrieveWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWithdrawalsRetrieveOutputModel.json",new TypeReference<BQWithdrawalsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDLeasingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLeasingRetrieveOutputModel.json",new TypeReference<SDLeasingRetrieveOutputModel>(){});
	}
	
	public CRLeasingArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeasingArrangementUpdateInputModel request){
		return JsonReader.read("update-CRLeasingArrangementUpdateOutputModel.json",new TypeReference<CRLeasingArrangementUpdateOutputModel>(){});
	}
	
	public BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request){
		return JsonReader.read("update-BQCollateralUpdateOutputModel.json",new TypeReference<BQCollateralUpdateOutputModel>(){});
	}
	
	public BQCorporateActionUpdateOutputModel updateCorporateaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionUpdateInputModel request){
		return JsonReader.read("update-BQCorporateActionUpdateOutputModel.json",new TypeReference<BQCorporateActionUpdateOutputModel>(){});
	}
	
	public BQDepositsUpdateOutputModel updateDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsUpdateOutputModel.json",new TypeReference<BQDepositsUpdateOutputModel>(){});
	}
	
	public BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request){
		return JsonReader.read("update-BQFeesUpdateOutputModel.json",new TypeReference<BQFeesUpdateOutputModel>(){});
	}
	
	public BQFinancialInstrumentUpdateOutputModel updateFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialInstrumentUpdateInputModel request){
		return JsonReader.read("update-BQFinancialInstrumentUpdateOutputModel.json",new TypeReference<BQFinancialInstrumentUpdateOutputModel>(){});
	}
	
	public BQInterestUpdateOutputModel updateInterest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInterestUpdateInputModel request){
		return JsonReader.read("update-BQInterestUpdateOutputModel.json",new TypeReference<BQInterestUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQLienUpdateOutputModel updateLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienUpdateInputModel request){
		return JsonReader.read("update-BQLienUpdateOutputModel.json",new TypeReference<BQLienUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
	public BQSweepUpdateOutputModel updateSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepUpdateInputModel request){
		return JsonReader.read("update-BQSweepUpdateOutputModel.json",new TypeReference<BQSweepUpdateOutputModel>(){});
	}
	
	public BQWithdrawalsUpdateOutputModel updateWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQWithdrawalsUpdateOutputModel.json",new TypeReference<BQWithdrawalsUpdateOutputModel>(){});
	}
	
}
