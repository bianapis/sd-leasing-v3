package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRequestInputModel
 */
public class CRLeasingArrangementRequestInputModel   {
  private String leasingServicingSessionReference = null;

  private String leasingArrangementInstanceReference = null;

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

  private Object leasingArrangementRequestActionTaskRecord = null;

  private CRLeasingArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return leasingServicingSessionReference
  **/

  public String getLeasingServicingSessionReference() {
    return leasingServicingSessionReference;
  }

  public void setLeasingServicingSessionReference(String leasingServicingSessionReference) {
    this.leasingServicingSessionReference = leasingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Leasing Arrangement instance 
   * @return leasingArrangementInstanceReference
  **/

  public String getLeasingArrangementInstanceReference() {
    return leasingArrangementInstanceReference;
  }

  public void setLeasingArrangementInstanceReference(String leasingArrangementInstanceReference) {
    this.leasingArrangementInstanceReference = leasingArrangementInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return leasingArrangementRequestActionTaskRecord
  **/

  public Object getLeasingArrangementRequestActionTaskRecord() {
    return leasingArrangementRequestActionTaskRecord;
  }

  public void setLeasingArrangementRequestActionTaskRecord(Object leasingArrangementRequestActionTaskRecord) {
    this.leasingArrangementRequestActionTaskRecord = leasingArrangementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRLeasingArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRLeasingArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

