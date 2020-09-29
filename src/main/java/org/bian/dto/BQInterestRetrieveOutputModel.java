package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceAnalysis;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModel
 */
public class BQInterestRetrieveOutputModel   {
  private String interestPreconditions = null;

  private String interestFeatureSchedule = null;

  private String businessService = null;

  private String interestPostconditions = null;

  private String interestServiceType = null;

  private String interestServiceDescription = null;

  private String interestServiceInputsandOuputs = null;

  private String interestServiceWorkProduct = null;

  private String interestServiceName = null;

  private String interestRetrieveActionTaskReference = null;

  private Object interestRetrieveActionTaskRecord = null;

  private String interestRetrieveActionResponse = null;

  private BQInterestRetrieveOutputModelInterestInstanceReport interestInstanceReport = null;

  private BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return interestPreconditions
  **/

  public String getInterestPreconditions() {
    return interestPreconditions;
  }

  public void setInterestPreconditions(String interestPreconditions) {
    this.interestPreconditions = interestPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return interestFeatureSchedule
  **/

  public String getInterestFeatureSchedule() {
    return interestFeatureSchedule;
  }

  public void setInterestFeatureSchedule(String interestFeatureSchedule) {
    this.interestFeatureSchedule = interestFeatureSchedule;
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
   * @return interestPostconditions
  **/

  public String getInterestPostconditions() {
    return interestPostconditions;
  }

  public void setInterestPostconditions(String interestPostconditions) {
    this.interestPostconditions = interestPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return interestServiceType
  **/

  public String getInterestServiceType() {
    return interestServiceType;
  }

  public void setInterestServiceType(String interestServiceType) {
    this.interestServiceType = interestServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return interestServiceDescription
  **/

  public String getInterestServiceDescription() {
    return interestServiceDescription;
  }

  public void setInterestServiceDescription(String interestServiceDescription) {
    this.interestServiceDescription = interestServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return interestServiceInputsandOuputs
  **/

  public String getInterestServiceInputsandOuputs() {
    return interestServiceInputsandOuputs;
  }

  public void setInterestServiceInputsandOuputs(String interestServiceInputsandOuputs) {
    this.interestServiceInputsandOuputs = interestServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return interestServiceWorkProduct
  **/

  public String getInterestServiceWorkProduct() {
    return interestServiceWorkProduct;
  }

  public void setInterestServiceWorkProduct(String interestServiceWorkProduct) {
    this.interestServiceWorkProduct = interestServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return interestServiceName
  **/

  public String getInterestServiceName() {
    return interestServiceName;
  }

  public void setInterestServiceName(String interestServiceName) {
    this.interestServiceName = interestServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interest instance retrieve service call 
   * @return interestRetrieveActionTaskReference
  **/

  public String getInterestRetrieveActionTaskReference() {
    return interestRetrieveActionTaskReference;
  }

  public void setInterestRetrieveActionTaskReference(String interestRetrieveActionTaskReference) {
    this.interestRetrieveActionTaskReference = interestRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interestRetrieveActionTaskRecord
  **/

  public Object getInterestRetrieveActionTaskRecord() {
    return interestRetrieveActionTaskRecord;
  }

  public void setInterestRetrieveActionTaskRecord(Object interestRetrieveActionTaskRecord) {
    this.interestRetrieveActionTaskRecord = interestRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return interestRetrieveActionResponse
  **/

  public String getInterestRetrieveActionResponse() {
    return interestRetrieveActionResponse;
  }

  public void setInterestRetrieveActionResponse(String interestRetrieveActionResponse) {
    this.interestRetrieveActionResponse = interestRetrieveActionResponse;
  }


  /**
   * Get interestInstanceReport
   * @return interestInstanceReport
  **/

  public BQInterestRetrieveOutputModelInterestInstanceReport getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(BQInterestRetrieveOutputModelInterestInstanceReport interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }


  /**
   * Get interestInstanceAnalysis
   * @return interestInstanceAnalysis
  **/

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis getInterestInstanceAnalysis() {
    return interestInstanceAnalysis;
  }

  public void setInterestInstanceAnalysis(BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
  }


}

