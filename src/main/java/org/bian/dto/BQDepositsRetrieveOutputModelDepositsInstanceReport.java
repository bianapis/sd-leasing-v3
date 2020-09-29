package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsRetrieveOutputModelDepositsInstanceReport
 */
public class BQDepositsRetrieveOutputModelDepositsInstanceReport   {
  private Object depositsInstanceReportRecord = null;

  private String depositsInstanceReportType = null;

  private String depositsInstanceReportParameters = null;

  private Object depositsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositsInstanceReportRecord
  **/

  public Object getDepositsInstanceReportRecord() {
    return depositsInstanceReportRecord;
  }

  public void setDepositsInstanceReportRecord(Object depositsInstanceReportRecord) {
    this.depositsInstanceReportRecord = depositsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositsInstanceReportType
  **/

  public String getDepositsInstanceReportType() {
    return depositsInstanceReportType;
  }

  public void setDepositsInstanceReportType(String depositsInstanceReportType) {
    this.depositsInstanceReportType = depositsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositsInstanceReportParameters
  **/

  public String getDepositsInstanceReportParameters() {
    return depositsInstanceReportParameters;
  }

  public void setDepositsInstanceReportParameters(String depositsInstanceReportParameters) {
    this.depositsInstanceReportParameters = depositsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositsInstanceReport
  **/

  public Object getDepositsInstanceReport() {
    return depositsInstanceReport;
  }

  public void setDepositsInstanceReport(Object depositsInstanceReport) {
    this.depositsInstanceReport = depositsInstanceReport;
  }


}

