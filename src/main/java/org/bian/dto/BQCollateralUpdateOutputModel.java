package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralUpdateOutputModel
 */
public class BQCollateralUpdateOutputModel   {
  private String collateralPreconditions = null;

  private String collateralFeatureSchedule = null;

  private String businessService = null;

  private String collateralPostconditions = null;

  private String collateralServiceType = null;

  private String collateralServiceDescription = null;

  private String collateralServiceInputsandOuputs = null;

  private String collateralServiceWorkProduct = null;

  private String collateralServiceName = null;

  private String collateralUpdateActionTaskReference = null;

  private Object collateralUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collateralUpdateActionTaskReference
  **/

  public String getCollateralUpdateActionTaskReference() {
    return collateralUpdateActionTaskReference;
  }

  public void setCollateralUpdateActionTaskReference(String collateralUpdateActionTaskReference) {
    this.collateralUpdateActionTaskReference = collateralUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collateralUpdateActionTaskRecord
  **/

  public Object getCollateralUpdateActionTaskRecord() {
    return collateralUpdateActionTaskRecord;
  }

  public void setCollateralUpdateActionTaskRecord(Object collateralUpdateActionTaskRecord) {
    this.collateralUpdateActionTaskRecord = collateralUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

