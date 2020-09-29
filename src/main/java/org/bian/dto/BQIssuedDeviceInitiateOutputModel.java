package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateOutputModel
 */
public class BQIssuedDeviceInitiateOutputModel   {
  private String issuedDeviceInstanceReference = null;

  private String issuedDeviceInitiateActionReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private String issuedDeviceInstanceStatus = null;

  private String issuedDevicePreconditions = null;

  private String issuedDeviceFeatureSchedule = null;

  private String businessService = null;

  private String issuedDevicePostconditions = null;

  private String issuedDeviceServiceType = null;

  private String issuedDeviceServiceDescription = null;

  private String issuedDeviceServiceInputsandOuputs = null;

  private String issuedDeviceServiceWorkProduct = null;

  private String issuedDeviceServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  **/

  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return issuedDeviceInitiateActionReference
  **/

  public String getIssuedDeviceInitiateActionReference() {
    return issuedDeviceInitiateActionReference;
  }

  public void setIssuedDeviceInitiateActionReference(String issuedDeviceInitiateActionReference) {
    this.issuedDeviceInitiateActionReference = issuedDeviceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device instance (e.g. initialised, pending, active) 
   * @return issuedDeviceInstanceStatus
  **/

  public String getIssuedDeviceInstanceStatus() {
    return issuedDeviceInstanceStatus;
  }

  public void setIssuedDeviceInstanceStatus(String issuedDeviceInstanceStatus) {
    this.issuedDeviceInstanceStatus = issuedDeviceInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return issuedDevicePreconditions
  **/

  public String getIssuedDevicePreconditions() {
    return issuedDevicePreconditions;
  }

  public void setIssuedDevicePreconditions(String issuedDevicePreconditions) {
    this.issuedDevicePreconditions = issuedDevicePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return issuedDeviceFeatureSchedule
  **/

  public String getIssuedDeviceFeatureSchedule() {
    return issuedDeviceFeatureSchedule;
  }

  public void setIssuedDeviceFeatureSchedule(String issuedDeviceFeatureSchedule) {
    this.issuedDeviceFeatureSchedule = issuedDeviceFeatureSchedule;
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
   * @return issuedDevicePostconditions
  **/

  public String getIssuedDevicePostconditions() {
    return issuedDevicePostconditions;
  }

  public void setIssuedDevicePostconditions(String issuedDevicePostconditions) {
    this.issuedDevicePostconditions = issuedDevicePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return issuedDeviceServiceType
  **/

  public String getIssuedDeviceServiceType() {
    return issuedDeviceServiceType;
  }

  public void setIssuedDeviceServiceType(String issuedDeviceServiceType) {
    this.issuedDeviceServiceType = issuedDeviceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return issuedDeviceServiceDescription
  **/

  public String getIssuedDeviceServiceDescription() {
    return issuedDeviceServiceDescription;
  }

  public void setIssuedDeviceServiceDescription(String issuedDeviceServiceDescription) {
    this.issuedDeviceServiceDescription = issuedDeviceServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return issuedDeviceServiceInputsandOuputs
  **/

  public String getIssuedDeviceServiceInputsandOuputs() {
    return issuedDeviceServiceInputsandOuputs;
  }

  public void setIssuedDeviceServiceInputsandOuputs(String issuedDeviceServiceInputsandOuputs) {
    this.issuedDeviceServiceInputsandOuputs = issuedDeviceServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return issuedDeviceServiceWorkProduct
  **/

  public String getIssuedDeviceServiceWorkProduct() {
    return issuedDeviceServiceWorkProduct;
  }

  public void setIssuedDeviceServiceWorkProduct(String issuedDeviceServiceWorkProduct) {
    this.issuedDeviceServiceWorkProduct = issuedDeviceServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return issuedDeviceServiceName
  **/

  public String getIssuedDeviceServiceName() {
    return issuedDeviceServiceName;
  }

  public void setIssuedDeviceServiceName(String issuedDeviceServiceName) {
    this.issuedDeviceServiceName = issuedDeviceServiceName;
  }


}

