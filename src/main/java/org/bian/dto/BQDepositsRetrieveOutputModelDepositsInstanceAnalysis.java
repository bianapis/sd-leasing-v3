package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsRetrieveOutputModelDepositsInstanceAnalysis
 */
public class BQDepositsRetrieveOutputModelDepositsInstanceAnalysis   {
  private Object depositsInstanceAnalysisRecord = null;

  private String depositsInstanceAnalysisReportType = null;

  private String depositsInstanceAnalysisParameters = null;

  private Object depositsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositsInstanceAnalysisRecord
  **/

  public Object getDepositsInstanceAnalysisRecord() {
    return depositsInstanceAnalysisRecord;
  }

  public void setDepositsInstanceAnalysisRecord(Object depositsInstanceAnalysisRecord) {
    this.depositsInstanceAnalysisRecord = depositsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositsInstanceAnalysisReportType
  **/

  public String getDepositsInstanceAnalysisReportType() {
    return depositsInstanceAnalysisReportType;
  }

  public void setDepositsInstanceAnalysisReportType(String depositsInstanceAnalysisReportType) {
    this.depositsInstanceAnalysisReportType = depositsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositsInstanceAnalysisParameters
  **/

  public String getDepositsInstanceAnalysisParameters() {
    return depositsInstanceAnalysisParameters;
  }

  public void setDepositsInstanceAnalysisParameters(String depositsInstanceAnalysisParameters) {
    this.depositsInstanceAnalysisParameters = depositsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositsInstanceAnalysisReport
  **/

  public Object getDepositsInstanceAnalysisReport() {
    return depositsInstanceAnalysisReport;
  }

  public void setDepositsInstanceAnalysisReport(Object depositsInstanceAnalysisReport) {
    this.depositsInstanceAnalysisReport = depositsInstanceAnalysisReport;
  }


}

