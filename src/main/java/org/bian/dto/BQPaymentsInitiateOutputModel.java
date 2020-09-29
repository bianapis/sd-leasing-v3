package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateOutputModel
 */
public class BQPaymentsInitiateOutputModel   {
  private String paymentsInstanceReference = null;

  private String paymentsInitiateActionReference = null;

  private Object paymentsInitiateActionRecord = null;

  private String paymentsInstanceStatus = null;

  private String paymentsPreconditions = null;

  private String paymentsFeatureSchedule = null;

  private String businessService = null;

  private String paymentsPostconditions = null;

  private String paymentsServiceType = null;

  private String paymentsServiceDescription = null;

  private String paymentsServiceInputsandOuputs = null;

  private String paymentsServiceWorkProduct = null;

  private String paymentsServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  **/

  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentsInitiateActionReference
  **/

  public String getPaymentsInitiateActionReference() {
    return paymentsInitiateActionReference;
  }

  public void setPaymentsInitiateActionReference(String paymentsInitiateActionReference) {
    this.paymentsInitiateActionReference = paymentsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentsInitiateActionRecord
  **/

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. initialised, pending, active) 
   * @return paymentsInstanceStatus
  **/

  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return paymentsPreconditions
  **/

  public String getPaymentsPreconditions() {
    return paymentsPreconditions;
  }

  public void setPaymentsPreconditions(String paymentsPreconditions) {
    this.paymentsPreconditions = paymentsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return paymentsFeatureSchedule
  **/

  public String getPaymentsFeatureSchedule() {
    return paymentsFeatureSchedule;
  }

  public void setPaymentsFeatureSchedule(String paymentsFeatureSchedule) {
    this.paymentsFeatureSchedule = paymentsFeatureSchedule;
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
   * @return paymentsPostconditions
  **/

  public String getPaymentsPostconditions() {
    return paymentsPostconditions;
  }

  public void setPaymentsPostconditions(String paymentsPostconditions) {
    this.paymentsPostconditions = paymentsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentsServiceType
  **/

  public String getPaymentsServiceType() {
    return paymentsServiceType;
  }

  public void setPaymentsServiceType(String paymentsServiceType) {
    this.paymentsServiceType = paymentsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentsServiceDescription
  **/

  public String getPaymentsServiceDescription() {
    return paymentsServiceDescription;
  }

  public void setPaymentsServiceDescription(String paymentsServiceDescription) {
    this.paymentsServiceDescription = paymentsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentsServiceInputsandOuputs
  **/

  public String getPaymentsServiceInputsandOuputs() {
    return paymentsServiceInputsandOuputs;
  }

  public void setPaymentsServiceInputsandOuputs(String paymentsServiceInputsandOuputs) {
    this.paymentsServiceInputsandOuputs = paymentsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentsServiceWorkProduct
  **/

  public String getPaymentsServiceWorkProduct() {
    return paymentsServiceWorkProduct;
  }

  public void setPaymentsServiceWorkProduct(String paymentsServiceWorkProduct) {
    this.paymentsServiceWorkProduct = paymentsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentsServiceName
  **/

  public String getPaymentsServiceName() {
    return paymentsServiceName;
  }

  public void setPaymentsServiceName(String paymentsServiceName) {
    this.paymentsServiceName = paymentsServiceName;
  }


}

