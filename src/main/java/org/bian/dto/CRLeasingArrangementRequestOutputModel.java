package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRequestOutputModel
 */
public class CRLeasingArrangementRequestOutputModel   {
  private String leasingArrangementParameterType = null;

  private String leasingArrangementSelectedOption = null;

  private String leasingArrangementSchedule = null;

  private String leasingArrangementStatus = null;

  private String leasingArrangementRequestActionTaskReference = null;

  private Object leasingArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Arrangement instance request service call 
   * @return leasingArrangementRequestActionTaskReference
  **/

  public String getLeasingArrangementRequestActionTaskReference() {
    return leasingArrangementRequestActionTaskReference;
  }

  public void setLeasingArrangementRequestActionTaskReference(String leasingArrangementRequestActionTaskReference) {
    this.leasingArrangementRequestActionTaskReference = leasingArrangementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

