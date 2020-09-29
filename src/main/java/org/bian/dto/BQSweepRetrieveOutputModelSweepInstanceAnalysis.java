package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSweepRetrieveOutputModelSweepInstanceAnalysis
 */
public class BQSweepRetrieveOutputModelSweepInstanceAnalysis   {
  private Object sweepInstanceAnalysisRecord = null;

  private String sweepInstanceAnalysisReportType = null;

  private String sweepInstanceAnalysisParameters = null;

  private Object sweepInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return sweepInstanceAnalysisRecord
  **/

  public Object getSweepInstanceAnalysisRecord() {
    return sweepInstanceAnalysisRecord;
  }

  public void setSweepInstanceAnalysisRecord(Object sweepInstanceAnalysisRecord) {
    this.sweepInstanceAnalysisRecord = sweepInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return sweepInstanceAnalysisReportType
  **/

  public String getSweepInstanceAnalysisReportType() {
    return sweepInstanceAnalysisReportType;
  }

  public void setSweepInstanceAnalysisReportType(String sweepInstanceAnalysisReportType) {
    this.sweepInstanceAnalysisReportType = sweepInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return sweepInstanceAnalysisParameters
  **/

  public String getSweepInstanceAnalysisParameters() {
    return sweepInstanceAnalysisParameters;
  }

  public void setSweepInstanceAnalysisParameters(String sweepInstanceAnalysisParameters) {
    this.sweepInstanceAnalysisParameters = sweepInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return sweepInstanceAnalysisReport
  **/

  public Object getSweepInstanceAnalysisReport() {
    return sweepInstanceAnalysisReport;
  }

  public void setSweepInstanceAnalysisReport(Object sweepInstanceAnalysisReport) {
    this.sweepInstanceAnalysisReport = sweepInstanceAnalysisReport;
  }


}

