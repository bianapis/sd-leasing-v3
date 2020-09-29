package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSweepUpdateOutputModel
 */
public class BQSweepUpdateOutputModel   {
  private String sweepPreconditions = null;

  private String sweepFeatureSchedule = null;

  private String businessService = null;

  private String sweepPostconditions = null;

  private String sweepServiceType = null;

  private String sweepServiceDescription = null;

  private String sweepServiceInputsandOuputs = null;

  private String sweepServiceWorkProduct = null;

  private String sweepServiceName = null;

  private String sweepUpdateActionTaskReference = null;

  private Object sweepUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return sweepPreconditions
  **/

  public String getSweepPreconditions() {
    return sweepPreconditions;
  }

  public void setSweepPreconditions(String sweepPreconditions) {
    this.sweepPreconditions = sweepPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return sweepFeatureSchedule
  **/

  public String getSweepFeatureSchedule() {
    return sweepFeatureSchedule;
  }

  public void setSweepFeatureSchedule(String sweepFeatureSchedule) {
    this.sweepFeatureSchedule = sweepFeatureSchedule;
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
   * @return sweepPostconditions
  **/

  public String getSweepPostconditions() {
    return sweepPostconditions;
  }

  public void setSweepPostconditions(String sweepPostconditions) {
    this.sweepPostconditions = sweepPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return sweepServiceType
  **/

  public String getSweepServiceType() {
    return sweepServiceType;
  }

  public void setSweepServiceType(String sweepServiceType) {
    this.sweepServiceType = sweepServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return sweepServiceDescription
  **/

  public String getSweepServiceDescription() {
    return sweepServiceDescription;
  }

  public void setSweepServiceDescription(String sweepServiceDescription) {
    this.sweepServiceDescription = sweepServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return sweepServiceInputsandOuputs
  **/

  public String getSweepServiceInputsandOuputs() {
    return sweepServiceInputsandOuputs;
  }

  public void setSweepServiceInputsandOuputs(String sweepServiceInputsandOuputs) {
    this.sweepServiceInputsandOuputs = sweepServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return sweepServiceWorkProduct
  **/

  public String getSweepServiceWorkProduct() {
    return sweepServiceWorkProduct;
  }

  public void setSweepServiceWorkProduct(String sweepServiceWorkProduct) {
    this.sweepServiceWorkProduct = sweepServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return sweepServiceName
  **/

  public String getSweepServiceName() {
    return sweepServiceName;
  }

  public void setSweepServiceName(String sweepServiceName) {
    this.sweepServiceName = sweepServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return sweepUpdateActionTaskReference
  **/

  public String getSweepUpdateActionTaskReference() {
    return sweepUpdateActionTaskReference;
  }

  public void setSweepUpdateActionTaskReference(String sweepUpdateActionTaskReference) {
    this.sweepUpdateActionTaskReference = sweepUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return sweepUpdateActionTaskRecord
  **/

  public Object getSweepUpdateActionTaskRecord() {
    return sweepUpdateActionTaskRecord;
  }

  public void setSweepUpdateActionTaskRecord(Object sweepUpdateActionTaskRecord) {
    this.sweepUpdateActionTaskRecord = sweepUpdateActionTaskRecord;
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

