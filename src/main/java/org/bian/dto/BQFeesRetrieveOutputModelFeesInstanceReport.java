package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveOutputModelFeesInstanceReport
 */
public class BQFeesRetrieveOutputModelFeesInstanceReport   {
  private Object feesInstanceReportRecord = null;

  private String feesInstanceReportType = null;

  private String feesInstanceReportParameters = null;

  private Object feesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return feesInstanceReportRecord
  **/

  public Object getFeesInstanceReportRecord() {
    return feesInstanceReportRecord;
  }

  public void setFeesInstanceReportRecord(Object feesInstanceReportRecord) {
    this.feesInstanceReportRecord = feesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return feesInstanceReportType
  **/

  public String getFeesInstanceReportType() {
    return feesInstanceReportType;
  }

  public void setFeesInstanceReportType(String feesInstanceReportType) {
    this.feesInstanceReportType = feesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return feesInstanceReportParameters
  **/

  public String getFeesInstanceReportParameters() {
    return feesInstanceReportParameters;
  }

  public void setFeesInstanceReportParameters(String feesInstanceReportParameters) {
    this.feesInstanceReportParameters = feesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return feesInstanceReport
  **/

  public Object getFeesInstanceReport() {
    return feesInstanceReport;
  }

  public void setFeesInstanceReport(Object feesInstanceReport) {
    this.feesInstanceReport = feesInstanceReport;
  }


}

