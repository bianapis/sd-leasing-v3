package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSweepRetrieveOutputModelSweepInstanceReport
 */
public class BQSweepRetrieveOutputModelSweepInstanceReport   {
  private Object sweepInstanceReportRecord = null;

  private String sweepInstanceReportType = null;

  private String sweepInstanceReportParameters = null;

  private Object sweepInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return sweepInstanceReportRecord
  **/

  public Object getSweepInstanceReportRecord() {
    return sweepInstanceReportRecord;
  }

  public void setSweepInstanceReportRecord(Object sweepInstanceReportRecord) {
    this.sweepInstanceReportRecord = sweepInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return sweepInstanceReportType
  **/

  public String getSweepInstanceReportType() {
    return sweepInstanceReportType;
  }

  public void setSweepInstanceReportType(String sweepInstanceReportType) {
    this.sweepInstanceReportType = sweepInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return sweepInstanceReportParameters
  **/

  public String getSweepInstanceReportParameters() {
    return sweepInstanceReportParameters;
  }

  public void setSweepInstanceReportParameters(String sweepInstanceReportParameters) {
    this.sweepInstanceReportParameters = sweepInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return sweepInstanceReport
  **/

  public Object getSweepInstanceReport() {
    return sweepInstanceReport;
  }

  public void setSweepInstanceReport(Object sweepInstanceReport) {
    this.sweepInstanceReport = sweepInstanceReport;
  }


}

