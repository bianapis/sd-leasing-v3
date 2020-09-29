package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsUpdateInputModel
 */
public class BQDepositsUpdateInputModel   {
  private String leasingArrangementInstanceReference = null;

  private String depositsInstanceReference = null;

  private String depositsPreconditions = null;

  private String depositsFeatureSchedule = null;

  private String depositProcessing = null;

  private String depositsPostconditions = null;

  private String depositsDepositProcessingServiceType = null;

  private String depositsDepositProcessingServiceDescription = null;

  private String depositsDepositProcessingServiceInputsandOuputs = null;

  private String depositsDepositProcessingServiceWorkProduct = null;

  private String depositsDepositProcessingServiceName = null;

  private Object depositsUpdateActionTaskRecord = null;

  private String depositsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits instance 
   * @return depositsInstanceReference
  **/

  public String getDepositsInstanceReference() {
    return depositsInstanceReference;
  }

  public void setDepositsInstanceReference(String depositsInstanceReference) {
    this.depositsInstanceReference = depositsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return depositsPreconditions
  **/

  public String getDepositsPreconditions() {
    return depositsPreconditions;
  }

  public void setDepositsPreconditions(String depositsPreconditions) {
    this.depositsPreconditions = depositsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return depositsFeatureSchedule
  **/

  public String getDepositsFeatureSchedule() {
    return depositsFeatureSchedule;
  }

  public void setDepositsFeatureSchedule(String depositsFeatureSchedule) {
    this.depositsFeatureSchedule = depositsFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Arrangement specific Business Service 
   * @return depositProcessing
  **/

  public String getDepositProcessing() {
    return depositProcessing;
  }

  public void setDepositProcessing(String depositProcessing) {
    this.depositProcessing = depositProcessing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return depositsPostconditions
  **/

  public String getDepositsPostconditions() {
    return depositsPostconditions;
  }

  public void setDepositsPostconditions(String depositsPostconditions) {
    this.depositsPostconditions = depositsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return depositsDepositProcessingServiceType
  **/

  public String getDepositsDepositProcessingServiceType() {
    return depositsDepositProcessingServiceType;
  }

  public void setDepositsDepositProcessingServiceType(String depositsDepositProcessingServiceType) {
    this.depositsDepositProcessingServiceType = depositsDepositProcessingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return depositsDepositProcessingServiceDescription
  **/

  public String getDepositsDepositProcessingServiceDescription() {
    return depositsDepositProcessingServiceDescription;
  }

  public void setDepositsDepositProcessingServiceDescription(String depositsDepositProcessingServiceDescription) {
    this.depositsDepositProcessingServiceDescription = depositsDepositProcessingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return depositsDepositProcessingServiceInputsandOuputs
  **/

  public String getDepositsDepositProcessingServiceInputsandOuputs() {
    return depositsDepositProcessingServiceInputsandOuputs;
  }

  public void setDepositsDepositProcessingServiceInputsandOuputs(String depositsDepositProcessingServiceInputsandOuputs) {
    this.depositsDepositProcessingServiceInputsandOuputs = depositsDepositProcessingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return depositsDepositProcessingServiceWorkProduct
  **/

  public String getDepositsDepositProcessingServiceWorkProduct() {
    return depositsDepositProcessingServiceWorkProduct;
  }

  public void setDepositsDepositProcessingServiceWorkProduct(String depositsDepositProcessingServiceWorkProduct) {
    this.depositsDepositProcessingServiceWorkProduct = depositsDepositProcessingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return depositsDepositProcessingServiceName
  **/

  public String getDepositsDepositProcessingServiceName() {
    return depositsDepositProcessingServiceName;
  }

  public void setDepositsDepositProcessingServiceName(String depositsDepositProcessingServiceName) {
    this.depositsDepositProcessingServiceName = depositsDepositProcessingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsUpdateActionTaskRecord
  **/

  public Object getDepositsUpdateActionTaskRecord() {
    return depositsUpdateActionTaskRecord;
  }

  public void setDepositsUpdateActionTaskRecord(Object depositsUpdateActionTaskRecord) {
    this.depositsUpdateActionTaskRecord = depositsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsUpdateActionRequest
  **/

  public String getDepositsUpdateActionRequest() {
    return depositsUpdateActionRequest;
  }

  public void setDepositsUpdateActionRequest(String depositsUpdateActionRequest) {
    this.depositsUpdateActionRequest = depositsUpdateActionRequest;
  }


}

