package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsRetrieveOutputModelWithdrawalsInstanceAnalysis
 */
public class BQWithdrawalsRetrieveOutputModelWithdrawalsInstanceAnalysis   {
  private Object withdrawalsInstanceAnalysisRecord = null;

  private String withdrawalsInstanceAnalysisReportType = null;

  private String withdrawalsInstanceAnalysisParameters = null;

  private Object withdrawalsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return withdrawalsInstanceAnalysisRecord
  **/

  public Object getWithdrawalsInstanceAnalysisRecord() {
    return withdrawalsInstanceAnalysisRecord;
  }

  public void setWithdrawalsInstanceAnalysisRecord(Object withdrawalsInstanceAnalysisRecord) {
    this.withdrawalsInstanceAnalysisRecord = withdrawalsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return withdrawalsInstanceAnalysisReportType
  **/

  public String getWithdrawalsInstanceAnalysisReportType() {
    return withdrawalsInstanceAnalysisReportType;
  }

  public void setWithdrawalsInstanceAnalysisReportType(String withdrawalsInstanceAnalysisReportType) {
    this.withdrawalsInstanceAnalysisReportType = withdrawalsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return withdrawalsInstanceAnalysisParameters
  **/

  public String getWithdrawalsInstanceAnalysisParameters() {
    return withdrawalsInstanceAnalysisParameters;
  }

  public void setWithdrawalsInstanceAnalysisParameters(String withdrawalsInstanceAnalysisParameters) {
    this.withdrawalsInstanceAnalysisParameters = withdrawalsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return withdrawalsInstanceAnalysisReport
  **/

  public Object getWithdrawalsInstanceAnalysisReport() {
    return withdrawalsInstanceAnalysisReport;
  }

  public void setWithdrawalsInstanceAnalysisReport(Object withdrawalsInstanceAnalysisReport) {
    this.withdrawalsInstanceAnalysisReport = withdrawalsInstanceAnalysisReport;
  }


}

