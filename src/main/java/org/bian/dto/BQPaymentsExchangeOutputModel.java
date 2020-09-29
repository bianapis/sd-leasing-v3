package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsExchangeOutputModel
 */
public class BQPaymentsExchangeOutputModel   {
  private String paymentsPreconditions = null;

  private String paymentsFeatureSchedule = null;

  private String businessService = null;

  private String paymentsPostconditions = null;

  private String paymentsServiceType = null;

  private String paymentsServiceDescription = null;

  private String paymentsServiceInputsandOuputs = null;

  private String paymentsServiceWorkProduct = null;

  private String paymentsServiceName = null;

  private String paymentsExchangeActionTaskReference = null;

  private Object paymentsExchangeActionTaskRecord = null;

  private String paymentsExchangeActionResponse = null;

  private String paymentsInstanceStatus = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance exchange service call 
   * @return paymentsExchangeActionTaskReference
  **/

  public String getPaymentsExchangeActionTaskReference() {
    return paymentsExchangeActionTaskReference;
  }

  public void setPaymentsExchangeActionTaskReference(String paymentsExchangeActionTaskReference) {
    this.paymentsExchangeActionTaskReference = paymentsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentsExchangeActionTaskRecord
  **/

  public Object getPaymentsExchangeActionTaskRecord() {
    return paymentsExchangeActionTaskRecord;
  }

  public void setPaymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentsExchangeActionResponse
  **/

  public String getPaymentsExchangeActionResponse() {
    return paymentsExchangeActionResponse;
  }

  public void setPaymentsExchangeActionResponse(String paymentsExchangeActionResponse) {
    this.paymentsExchangeActionResponse = paymentsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. accepted, rejected, verified) 
   * @return paymentsInstanceStatus
  **/

  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }


}

