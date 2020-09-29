package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeesRetrieveOutputModelFeesInstanceAnalysis;
import org.bian.dto.BQFeesRetrieveOutputModelFeesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveOutputModel
 */
public class BQFeesRetrieveOutputModel   {
  private String feesPreconditions = null;

  private String feesFeatureSchedule = null;

  private String businessService = null;

  private String feesPostconditions = null;

  private String feesServiceType = null;

  private String feesServiceDescription = null;

  private String feesServiceInputsandOuputs = null;

  private String feesServiceWorkProduct = null;

  private String feesServiceName = null;

  private String feesRetrieveActionTaskReference = null;

  private Object feesRetrieveActionTaskRecord = null;

  private String feesRetrieveActionResponse = null;

  private BQFeesRetrieveOutputModelFeesInstanceReport feesInstanceReport = null;

  private BQFeesRetrieveOutputModelFeesInstanceAnalysis feesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return feesPreconditions
  **/

  public String getFeesPreconditions() {
    return feesPreconditions;
  }

  public void setFeesPreconditions(String feesPreconditions) {
    this.feesPreconditions = feesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return feesFeatureSchedule
  **/

  public String getFeesFeatureSchedule() {
    return feesFeatureSchedule;
  }

  public void setFeesFeatureSchedule(String feesFeatureSchedule) {
    this.feesFeatureSchedule = feesFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return feesPostconditions
  **/

  public String getFeesPostconditions() {
    return feesPostconditions;
  }

  public void setFeesPostconditions(String feesPostconditions) {
    this.feesPostconditions = feesPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return feesServiceType
  **/

  public String getFeesServiceType() {
    return feesServiceType;
  }

  public void setFeesServiceType(String feesServiceType) {
    this.feesServiceType = feesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return feesServiceDescription
  **/

  public String getFeesServiceDescription() {
    return feesServiceDescription;
  }

  public void setFeesServiceDescription(String feesServiceDescription) {
    this.feesServiceDescription = feesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return feesServiceInputsandOuputs
  **/

  public String getFeesServiceInputsandOuputs() {
    return feesServiceInputsandOuputs;
  }

  public void setFeesServiceInputsandOuputs(String feesServiceInputsandOuputs) {
    this.feesServiceInputsandOuputs = feesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return feesServiceWorkProduct
  **/

  public String getFeesServiceWorkProduct() {
    return feesServiceWorkProduct;
  }

  public void setFeesServiceWorkProduct(String feesServiceWorkProduct) {
    this.feesServiceWorkProduct = feesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return feesServiceName
  **/

  public String getFeesServiceName() {
    return feesServiceName;
  }

  public void setFeesServiceName(String feesServiceName) {
    this.feesServiceName = feesServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fees instance retrieve service call 
   * @return feesRetrieveActionTaskReference
  **/

  public String getFeesRetrieveActionTaskReference() {
    return feesRetrieveActionTaskReference;
  }

  public void setFeesRetrieveActionTaskReference(String feesRetrieveActionTaskReference) {
    this.feesRetrieveActionTaskReference = feesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return feesRetrieveActionTaskRecord
  **/

  public Object getFeesRetrieveActionTaskRecord() {
    return feesRetrieveActionTaskRecord;
  }

  public void setFeesRetrieveActionTaskRecord(Object feesRetrieveActionTaskRecord) {
    this.feesRetrieveActionTaskRecord = feesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return feesRetrieveActionResponse
  **/

  public String getFeesRetrieveActionResponse() {
    return feesRetrieveActionResponse;
  }

  public void setFeesRetrieveActionResponse(String feesRetrieveActionResponse) {
    this.feesRetrieveActionResponse = feesRetrieveActionResponse;
  }


  /**
   * Get feesInstanceReport
   * @return feesInstanceReport
  **/

  public BQFeesRetrieveOutputModelFeesInstanceReport getFeesInstanceReport() {
    return feesInstanceReport;
  }

  public void setFeesInstanceReport(BQFeesRetrieveOutputModelFeesInstanceReport feesInstanceReport) {
    this.feesInstanceReport = feesInstanceReport;
  }


  /**
   * Get feesInstanceAnalysis
   * @return feesInstanceAnalysis
  **/

  public BQFeesRetrieveOutputModelFeesInstanceAnalysis getFeesInstanceAnalysis() {
    return feesInstanceAnalysis;
  }

  public void setFeesInstanceAnalysis(BQFeesRetrieveOutputModelFeesInstanceAnalysis feesInstanceAnalysis) {
    this.feesInstanceAnalysis = feesInstanceAnalysis;
  }


}

