package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralInitiateOutputModel
 */
public class BQCollateralInitiateOutputModel   {
  private String collateralInstanceReference = null;

  private String collateralInitiateActionReference = null;

  private Object collateralInitiateActionRecord = null;

  private String collateralInstanceStatus = null;

  private String collateralPreconditions = null;

  private String collateralFeatureSchedule = null;

  private String businessService = null;

  private String collateralPostconditions = null;

  private String collateralServiceType = null;

  private String collateralServiceDescription = null;

  private String collateralServiceInputsandOuputs = null;

  private String collateralServiceWorkProduct = null;

  private String collateralServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral instance 
   * @return collateralInstanceReference
  **/

  public String getCollateralInstanceReference() {
    return collateralInstanceReference;
  }

  public void setCollateralInstanceReference(String collateralInstanceReference) {
    this.collateralInstanceReference = collateralInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return collateralInitiateActionReference
  **/

  public String getCollateralInitiateActionReference() {
    return collateralInitiateActionReference;
  }

  public void setCollateralInitiateActionReference(String collateralInitiateActionReference) {
    this.collateralInitiateActionReference = collateralInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return collateralInitiateActionRecord
  **/

  public Object getCollateralInitiateActionRecord() {
    return collateralInitiateActionRecord;
  }

  public void setCollateralInitiateActionRecord(Object collateralInitiateActionRecord) {
    this.collateralInitiateActionRecord = collateralInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral instance (e.g. initialised, pending, active) 
   * @return collateralInstanceStatus
  **/

  public String getCollateralInstanceStatus() {
    return collateralInstanceStatus;
  }

  public void setCollateralInstanceStatus(String collateralInstanceStatus) {
    this.collateralInstanceStatus = collateralInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return collateralPreconditions
  **/

  public String getCollateralPreconditions() {
    return collateralPreconditions;
  }

  public void setCollateralPreconditions(String collateralPreconditions) {
    this.collateralPreconditions = collateralPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return collateralFeatureSchedule
  **/

  public String getCollateralFeatureSchedule() {
    return collateralFeatureSchedule;
  }

  public void setCollateralFeatureSchedule(String collateralFeatureSchedule) {
    this.collateralFeatureSchedule = collateralFeatureSchedule;
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
   * @return collateralPostconditions
  **/

  public String getCollateralPostconditions() {
    return collateralPostconditions;
  }

  public void setCollateralPostconditions(String collateralPostconditions) {
    this.collateralPostconditions = collateralPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collateralServiceType
  **/

  public String getCollateralServiceType() {
    return collateralServiceType;
  }

  public void setCollateralServiceType(String collateralServiceType) {
    this.collateralServiceType = collateralServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collateralServiceDescription
  **/

  public String getCollateralServiceDescription() {
    return collateralServiceDescription;
  }

  public void setCollateralServiceDescription(String collateralServiceDescription) {
    this.collateralServiceDescription = collateralServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collateralServiceInputsandOuputs
  **/

  public String getCollateralServiceInputsandOuputs() {
    return collateralServiceInputsandOuputs;
  }

  public void setCollateralServiceInputsandOuputs(String collateralServiceInputsandOuputs) {
    this.collateralServiceInputsandOuputs = collateralServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collateralServiceWorkProduct
  **/

  public String getCollateralServiceWorkProduct() {
    return collateralServiceWorkProduct;
  }

  public void setCollateralServiceWorkProduct(String collateralServiceWorkProduct) {
    this.collateralServiceWorkProduct = collateralServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collateralServiceName
  **/

  public String getCollateralServiceName() {
    return collateralServiceName;
  }

  public void setCollateralServiceName(String collateralServiceName) {
    this.collateralServiceName = collateralServiceName;
  }


}

