package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementUpdateOutputModel
 */
public class CRLeasingArrangementUpdateOutputModel   {
  private String leasingArrangementParameterType = null;

  private String leasingArrangementSelectedOption = null;

  private String leasingArrangementSchedule = null;

  private String leasingArrangementStatus = null;

  private String leasingArrangementUpdateActionTaskReference = null;

  private Object leasingArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return leasingArrangementUpdateActionTaskReference
  **/

  public String getLeasingArrangementUpdateActionTaskReference() {
    return leasingArrangementUpdateActionTaskReference;
  }

  public void setLeasingArrangementUpdateActionTaskReference(String leasingArrangementUpdateActionTaskReference) {
    this.leasingArrangementUpdateActionTaskReference = leasingArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return leasingArrangementUpdateActionTaskRecord
  **/

  public Object getLeasingArrangementUpdateActionTaskRecord() {
    return leasingArrangementUpdateActionTaskRecord;
  }

  public void setLeasingArrangementUpdateActionTaskRecord(Object leasingArrangementUpdateActionTaskRecord) {
    this.leasingArrangementUpdateActionTaskRecord = leasingArrangementUpdateActionTaskRecord;
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

