package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestUpdateInputModel
 */
public class BQInterestUpdateInputModel   {
  private String leasingArrangementInstanceReference = null;

  private String interestInstanceReference = null;

  private String interestPreconditions = null;

  private String interestFeatureSchedule = null;

  private String businessService = null;

  private String interestPostconditions = null;

  private String interestServiceType = null;

  private String interestServiceDescription = null;

  private String interestServiceInputsandOuputs = null;

  private String interestServiceWorkProduct = null;

  private String interestServiceName = null;

  private Object interestUpdateActionTaskRecord = null;

  private String interestUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Leasing Arrangement instance 
   * @return leasingArrangementInstanceReference
  **/

  public String getLeasingArrangementInstanceReference() {
    return leasingArrangementInstanceReference;
  }

  public void setLeasingArrangementInstanceReference(String leasingArrangementInstanceReference) {
    this.leasingArrangementInstanceReference = leasingArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Interest instance 
   * @return interestInstanceReference
  **/

  public String getInterestInstanceReference() {
    return interestInstanceReference;
  }

  public void setInterestInstanceReference(String interestInstanceReference) {
    this.interestInstanceReference = interestInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return interestUpdateActionTaskRecord
  **/

  public Object getInterestUpdateActionTaskRecord() {
    return interestUpdateActionTaskRecord;
  }

  public void setInterestUpdateActionTaskRecord(Object interestUpdateActionTaskRecord) {
    this.interestUpdateActionTaskRecord = interestUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return interestUpdateActionRequest
  **/

  public String getInterestUpdateActionRequest() {
    return interestUpdateActionRequest;
  }

  public void setInterestUpdateActionRequest(String interestUpdateActionRequest) {
    this.interestUpdateActionRequest = interestUpdateActionRequest;
  }


}

