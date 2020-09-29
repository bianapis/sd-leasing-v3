package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveOutputModelFeesInstanceAnalysis
 */
public class BQFeesRetrieveOutputModelFeesInstanceAnalysis   {
  private Object feesInstanceAnalysisRecord = null;

  private String feesInstanceAnalysisReportType = null;

  private String feesInstanceAnalysisParameters = null;

  private Object feesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return feesInstanceAnalysisRecord
  **/

  public Object getFeesInstanceAnalysisRecord() {
    return feesInstanceAnalysisRecord;
  }

  public void setFeesInstanceAnalysisRecord(Object feesInstanceAnalysisRecord) {
    this.feesInstanceAnalysisRecord = feesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return feesInstanceAnalysisReportType
  **/

  public String getFeesInstanceAnalysisReportType() {
    return feesInstanceAnalysisReportType;
  }

  public void setFeesInstanceAnalysisReportType(String feesInstanceAnalysisReportType) {
    this.feesInstanceAnalysisReportType = feesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return feesInstanceAnalysisParameters
  **/

  public String getFeesInstanceAnalysisParameters() {
    return feesInstanceAnalysisParameters;
  }

  public void setFeesInstanceAnalysisParameters(String feesInstanceAnalysisParameters) {
    this.feesInstanceAnalysisParameters = feesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return feesInstanceAnalysisReport
  **/

  public Object getFeesInstanceAnalysisReport() {
    return feesInstanceAnalysisReport;
  }

  public void setFeesInstanceAnalysisReport(Object feesInstanceAnalysisReport) {
    this.feesInstanceAnalysisReport = feesInstanceAnalysisReport;
  }


}

