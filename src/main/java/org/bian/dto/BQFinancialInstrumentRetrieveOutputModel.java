package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis;
import org.bian.dto.BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialInstrumentRetrieveOutputModel
 */
public class BQFinancialInstrumentRetrieveOutputModel   {
  private String financialInstrumentPreconditions = null;

  private String financialInstrumentFeatureSchedule = null;

  private String financialInstrumentPostconditions = null;

  private String financialInstrumentFinancialInstrumentServiceType = null;

  private String financialInstrumentFinancialInstrumentServiceDescription = null;

  private String financialInstrumentFinancialInstrumentServiceInputsandOuputs = null;

  private String financialInstrumentFinancialInstrumentServiceWorkProduct = null;

  private String financialInstrumentRetrieveActionTaskReference = null;

  private Object financialInstrumentRetrieveActionTaskRecord = null;

  private String financialInstrumentRetrieveActionResponse = null;

  private BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport financialInstrumentInstanceReport = null;

  private BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis financialInstrumentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return financialInstrumentPreconditions
  **/

  public String getFinancialInstrumentPreconditions() {
    return financialInstrumentPreconditions;
  }

  public void setFinancialInstrumentPreconditions(String financialInstrumentPreconditions) {
    this.financialInstrumentPreconditions = financialInstrumentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return financialInstrumentFeatureSchedule
  **/

  public String getFinancialInstrumentFeatureSchedule() {
    return financialInstrumentFeatureSchedule;
  }

  public void setFinancialInstrumentFeatureSchedule(String financialInstrumentFeatureSchedule) {
    this.financialInstrumentFeatureSchedule = financialInstrumentFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return financialInstrumentPostconditions
  **/

  public String getFinancialInstrumentPostconditions() {
    return financialInstrumentPostconditions;
  }

  public void setFinancialInstrumentPostconditions(String financialInstrumentPostconditions) {
    this.financialInstrumentPostconditions = financialInstrumentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return financialInstrumentFinancialInstrumentServiceType
  **/

  public String getFinancialInstrumentFinancialInstrumentServiceType() {
    return financialInstrumentFinancialInstrumentServiceType;
  }

  public void setFinancialInstrumentFinancialInstrumentServiceType(String financialInstrumentFinancialInstrumentServiceType) {
    this.financialInstrumentFinancialInstrumentServiceType = financialInstrumentFinancialInstrumentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return financialInstrumentFinancialInstrumentServiceDescription
  **/

  public String getFinancialInstrumentFinancialInstrumentServiceDescription() {
    return financialInstrumentFinancialInstrumentServiceDescription;
  }

  public void setFinancialInstrumentFinancialInstrumentServiceDescription(String financialInstrumentFinancialInstrumentServiceDescription) {
    this.financialInstrumentFinancialInstrumentServiceDescription = financialInstrumentFinancialInstrumentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return financialInstrumentFinancialInstrumentServiceInputsandOuputs
  **/

  public String getFinancialInstrumentFinancialInstrumentServiceInputsandOuputs() {
    return financialInstrumentFinancialInstrumentServiceInputsandOuputs;
  }

  public void setFinancialInstrumentFinancialInstrumentServiceInputsandOuputs(String financialInstrumentFinancialInstrumentServiceInputsandOuputs) {
    this.financialInstrumentFinancialInstrumentServiceInputsandOuputs = financialInstrumentFinancialInstrumentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return financialInstrumentFinancialInstrumentServiceWorkProduct
  **/

  public String getFinancialInstrumentFinancialInstrumentServiceWorkProduct() {
    return financialInstrumentFinancialInstrumentServiceWorkProduct;
  }

  public void setFinancialInstrumentFinancialInstrumentServiceWorkProduct(String financialInstrumentFinancialInstrumentServiceWorkProduct) {
    this.financialInstrumentFinancialInstrumentServiceWorkProduct = financialInstrumentFinancialInstrumentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Instrument instance retrieve service call 
   * @return financialInstrumentRetrieveActionTaskReference
  **/

  public String getFinancialInstrumentRetrieveActionTaskReference() {
    return financialInstrumentRetrieveActionTaskReference;
  }

  public void setFinancialInstrumentRetrieveActionTaskReference(String financialInstrumentRetrieveActionTaskReference) {
    this.financialInstrumentRetrieveActionTaskReference = financialInstrumentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialInstrumentRetrieveActionTaskRecord
  **/

  public Object getFinancialInstrumentRetrieveActionTaskRecord() {
    return financialInstrumentRetrieveActionTaskRecord;
  }

  public void setFinancialInstrumentRetrieveActionTaskRecord(Object financialInstrumentRetrieveActionTaskRecord) {
    this.financialInstrumentRetrieveActionTaskRecord = financialInstrumentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialInstrumentRetrieveActionResponse
  **/

  public String getFinancialInstrumentRetrieveActionResponse() {
    return financialInstrumentRetrieveActionResponse;
  }

  public void setFinancialInstrumentRetrieveActionResponse(String financialInstrumentRetrieveActionResponse) {
    this.financialInstrumentRetrieveActionResponse = financialInstrumentRetrieveActionResponse;
  }


  /**
   * Get financialInstrumentInstanceReport
   * @return financialInstrumentInstanceReport
  **/

  public BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport getFinancialInstrumentInstanceReport() {
    return financialInstrumentInstanceReport;
  }

  public void setFinancialInstrumentInstanceReport(BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport financialInstrumentInstanceReport) {
    this.financialInstrumentInstanceReport = financialInstrumentInstanceReport;
  }


  /**
   * Get financialInstrumentInstanceAnalysis
   * @return financialInstrumentInstanceAnalysis
  **/

  public BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis getFinancialInstrumentInstanceAnalysis() {
    return financialInstrumentInstanceAnalysis;
  }

  public void setFinancialInstrumentInstanceAnalysis(BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis financialInstrumentInstanceAnalysis) {
    this.financialInstrumentInstanceAnalysis = financialInstrumentInstanceAnalysis;
  }


}

