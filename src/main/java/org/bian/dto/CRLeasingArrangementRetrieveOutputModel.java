package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis;
import org.bian.dto.CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveOutputModel
 */
public class CRLeasingArrangementRetrieveOutputModel   {
  private String leasingArrangementParameterType = null;

  private String leasingArrangementSelectedOption = null;

  private String leasingArrangementType = null;

  private String leasingArrangementReference = null;

  private String leasingArrangementSchedule = null;

  private String leasingArrangementStatus = null;

  private String leasingArrangementCurrency = null;

  private String leasingArrangementRegulationReference = null;

  private String leasingArrangementRegulationType = null;

  private String leasingArrangementJurisdiction = null;

  private String leasingArrangementBookingLocation = null;

  private String leasingArrangementAccountType = null;

  private String leasingArrangementAccountReference = null;

  private String leasingArrangementRetrieveActionTaskReference = null;

  private Object leasingArrangementRetrieveActionTaskRecord = null;

  private String leasingArrangementRetrieveActionResponse = null;

  private CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord leasingArrangementInstanceReportRecord = null;

  private CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis leasingArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Leasing Arrangement 
   * @return leasingArrangementParameterType
  **/

  public String getLeasingArrangementParameterType() {
    return leasingArrangementParameterType;
  }

  public void setLeasingArrangementParameterType(String leasingArrangementParameterType) {
    this.leasingArrangementParameterType = leasingArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Leasing Arrangement 
   * @return leasingArrangementSelectedOption
  **/

  public String getLeasingArrangementSelectedOption() {
    return leasingArrangementSelectedOption;
  }

  public void setLeasingArrangementSelectedOption(String leasingArrangementSelectedOption) {
    this.leasingArrangementSelectedOption = leasingArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Leasing Arrangement 
   * @return leasingArrangementType
  **/

  public String getLeasingArrangementType() {
    return leasingArrangementType;
  }

  public void setLeasingArrangementType(String leasingArrangementType) {
    this.leasingArrangementType = leasingArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Leasing Arrangement 
   * @return leasingArrangementReference
  **/

  public String getLeasingArrangementReference() {
    return leasingArrangementReference;
  }

  public void setLeasingArrangementReference(String leasingArrangementReference) {
    this.leasingArrangementReference = leasingArrangementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Leasing Arrangement 
   * @return leasingArrangementSchedule
  **/

  public String getLeasingArrangementSchedule() {
    return leasingArrangementSchedule;
  }

  public void setLeasingArrangementSchedule(String leasingArrangementSchedule) {
    this.leasingArrangementSchedule = leasingArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Leasing Arrangement 
   * @return leasingArrangementStatus
  **/

  public String getLeasingArrangementStatus() {
    return leasingArrangementStatus;
  }

  public void setLeasingArrangementStatus(String leasingArrangementStatus) {
    this.leasingArrangementStatus = leasingArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Leasing Arrangement 
   * @return leasingArrangementCurrency
  **/

  public String getLeasingArrangementCurrency() {
    return leasingArrangementCurrency;
  }

  public void setLeasingArrangementCurrency(String leasingArrangementCurrency) {
    this.leasingArrangementCurrency = leasingArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Leasing Arrangement 
   * @return leasingArrangementRegulationReference
  **/

  public String getLeasingArrangementRegulationReference() {
    return leasingArrangementRegulationReference;
  }

  public void setLeasingArrangementRegulationReference(String leasingArrangementRegulationReference) {
    this.leasingArrangementRegulationReference = leasingArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Leasing Arrangement 
   * @return leasingArrangementRegulationType
  **/

  public String getLeasingArrangementRegulationType() {
    return leasingArrangementRegulationType;
  }

  public void setLeasingArrangementRegulationType(String leasingArrangementRegulationType) {
    this.leasingArrangementRegulationType = leasingArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Leasing Arrangement in case of legal dispute. 
   * @return leasingArrangementJurisdiction
  **/

  public String getLeasingArrangementJurisdiction() {
    return leasingArrangementJurisdiction;
  }

  public void setLeasingArrangementJurisdiction(String leasingArrangementJurisdiction) {
    this.leasingArrangementJurisdiction = leasingArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Leasing Arrangement, are entered. 
   * @return leasingArrangementBookingLocation
  **/

  public String getLeasingArrangementBookingLocation() {
    return leasingArrangementBookingLocation;
  }

  public void setLeasingArrangementBookingLocation(String leasingArrangementBookingLocation) {
    this.leasingArrangementBookingLocation = leasingArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Leasing Arrangement 
   * @return leasingArrangementAccountType
  **/

  public String getLeasingArrangementAccountType() {
    return leasingArrangementAccountType;
  }

  public void setLeasingArrangementAccountType(String leasingArrangementAccountType) {
    this.leasingArrangementAccountType = leasingArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Leasing Arrangement 
   * @return leasingArrangementAccountReference
  **/

  public String getLeasingArrangementAccountReference() {
    return leasingArrangementAccountReference;
  }

  public void setLeasingArrangementAccountReference(String leasingArrangementAccountReference) {
    this.leasingArrangementAccountReference = leasingArrangementAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Arrangement instance retrieve service call 
   * @return leasingArrangementRetrieveActionTaskReference
  **/

  public String getLeasingArrangementRetrieveActionTaskReference() {
    return leasingArrangementRetrieveActionTaskReference;
  }

  public void setLeasingArrangementRetrieveActionTaskReference(String leasingArrangementRetrieveActionTaskReference) {
    this.leasingArrangementRetrieveActionTaskReference = leasingArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leasingArrangementRetrieveActionTaskRecord
  **/

  public Object getLeasingArrangementRetrieveActionTaskRecord() {
    return leasingArrangementRetrieveActionTaskRecord;
  }

  public void setLeasingArrangementRetrieveActionTaskRecord(Object leasingArrangementRetrieveActionTaskRecord) {
    this.leasingArrangementRetrieveActionTaskRecord = leasingArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return leasingArrangementRetrieveActionResponse
  **/

  public String getLeasingArrangementRetrieveActionResponse() {
    return leasingArrangementRetrieveActionResponse;
  }

  public void setLeasingArrangementRetrieveActionResponse(String leasingArrangementRetrieveActionResponse) {
    this.leasingArrangementRetrieveActionResponse = leasingArrangementRetrieveActionResponse;
  }


  /**
   * Get leasingArrangementInstanceReportRecord
   * @return leasingArrangementInstanceReportRecord
  **/

  public CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord getLeasingArrangementInstanceReportRecord() {
    return leasingArrangementInstanceReportRecord;
  }

  public void setLeasingArrangementInstanceReportRecord(CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord leasingArrangementInstanceReportRecord) {
    this.leasingArrangementInstanceReportRecord = leasingArrangementInstanceReportRecord;
  }


  /**
   * Get leasingArrangementInstanceAnalysis
   * @return leasingArrangementInstanceAnalysis
  **/

  public CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis getLeasingArrangementInstanceAnalysis() {
    return leasingArrangementInstanceAnalysis;
  }

  public void setLeasingArrangementInstanceAnalysis(CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis leasingArrangementInstanceAnalysis) {
    this.leasingArrangementInstanceAnalysis = leasingArrangementInstanceAnalysis;
  }


}

