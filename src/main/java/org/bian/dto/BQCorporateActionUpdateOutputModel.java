package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionUpdateOutputModel
 */
public class BQCorporateActionUpdateOutputModel   {
  private String corporateActionPreconditions = null;

  private String corporateActionFeatureSchedule = null;

  private String bSCorporateActionProcessing = null;

  private String corporateActionPostconditions = null;

  private String corporateActionBSCorporateActionProcessingServiceType = null;

  private String corporateActionBSCorporateActionProcessingServiceDescription = null;

  private String corporateActionBSCorporateActionProcessingServiceInputsandOuputs = null;

  private String corporateActionBSCorporateActionProcessingServiceWorkProduct = null;

  private String corporateActionBSCorporateActionProcessingServiceName = null;

  private String corporateActionUpdateActionTaskReference = null;

  private Object corporateActionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return corporateActionPreconditions
  **/

  public String getCorporateActionPreconditions() {
    return corporateActionPreconditions;
  }

  public void setCorporateActionPreconditions(String corporateActionPreconditions) {
    this.corporateActionPreconditions = corporateActionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return corporateActionFeatureSchedule
  **/

  public String getCorporateActionFeatureSchedule() {
    return corporateActionFeatureSchedule;
  }

  public void setCorporateActionFeatureSchedule(String corporateActionFeatureSchedule) {
    this.corporateActionFeatureSchedule = corporateActionFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Arrangement specific Business Service 
   * @return bSCorporateActionProcessing
  **/

  public String getBSCorporateActionProcessing() {
    return bSCorporateActionProcessing;
  }

  public void setBSCorporateActionProcessing(String bSCorporateActionProcessing) {
    this.bSCorporateActionProcessing = bSCorporateActionProcessing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return corporateActionPostconditions
  **/

  public String getCorporateActionPostconditions() {
    return corporateActionPostconditions;
  }

  public void setCorporateActionPostconditions(String corporateActionPostconditions) {
    this.corporateActionPostconditions = corporateActionPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return corporateActionBSCorporateActionProcessingServiceType
  **/

  public String getCorporateActionBSCorporateActionProcessingServiceType() {
    return corporateActionBSCorporateActionProcessingServiceType;
  }

  public void setCorporateActionBSCorporateActionProcessingServiceType(String corporateActionBSCorporateActionProcessingServiceType) {
    this.corporateActionBSCorporateActionProcessingServiceType = corporateActionBSCorporateActionProcessingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return corporateActionBSCorporateActionProcessingServiceDescription
  **/

  public String getCorporateActionBSCorporateActionProcessingServiceDescription() {
    return corporateActionBSCorporateActionProcessingServiceDescription;
  }

  public void setCorporateActionBSCorporateActionProcessingServiceDescription(String corporateActionBSCorporateActionProcessingServiceDescription) {
    this.corporateActionBSCorporateActionProcessingServiceDescription = corporateActionBSCorporateActionProcessingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return corporateActionBSCorporateActionProcessingServiceInputsandOuputs
  **/

  public String getCorporateActionBSCorporateActionProcessingServiceInputsandOuputs() {
    return corporateActionBSCorporateActionProcessingServiceInputsandOuputs;
  }

  public void setCorporateActionBSCorporateActionProcessingServiceInputsandOuputs(String corporateActionBSCorporateActionProcessingServiceInputsandOuputs) {
    this.corporateActionBSCorporateActionProcessingServiceInputsandOuputs = corporateActionBSCorporateActionProcessingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return corporateActionBSCorporateActionProcessingServiceWorkProduct
  **/

  public String getCorporateActionBSCorporateActionProcessingServiceWorkProduct() {
    return corporateActionBSCorporateActionProcessingServiceWorkProduct;
  }

  public void setCorporateActionBSCorporateActionProcessingServiceWorkProduct(String corporateActionBSCorporateActionProcessingServiceWorkProduct) {
    this.corporateActionBSCorporateActionProcessingServiceWorkProduct = corporateActionBSCorporateActionProcessingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return corporateActionBSCorporateActionProcessingServiceName
  **/

  public String getCorporateActionBSCorporateActionProcessingServiceName() {
    return corporateActionBSCorporateActionProcessingServiceName;
  }

  public void setCorporateActionBSCorporateActionProcessingServiceName(String corporateActionBSCorporateActionProcessingServiceName) {
    this.corporateActionBSCorporateActionProcessingServiceName = corporateActionBSCorporateActionProcessingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateActionUpdateActionTaskReference
  **/

  public String getCorporateActionUpdateActionTaskReference() {
    return corporateActionUpdateActionTaskReference;
  }

  public void setCorporateActionUpdateActionTaskReference(String corporateActionUpdateActionTaskReference) {
    this.corporateActionUpdateActionTaskReference = corporateActionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateActionUpdateActionTaskRecord
  **/

  public Object getCorporateActionUpdateActionTaskRecord() {
    return corporateActionUpdateActionTaskRecord;
  }

  public void setCorporateActionUpdateActionTaskRecord(Object corporateActionUpdateActionTaskRecord) {
    this.corporateActionUpdateActionTaskRecord = corporateActionUpdateActionTaskRecord;
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

