package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLienRetrieveOutputModelLienInstanceAnalysis
 */
public class BQLienRetrieveOutputModelLienInstanceAnalysis   {
  private Object lienInstanceAnalysisRecord = null;

  private String lienInstanceAnalysisReportType = null;

  private String lienInstanceAnalysisParameters = null;

  private Object lienInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return lienInstanceAnalysisRecord
  **/

  public Object getLienInstanceAnalysisRecord() {
    return lienInstanceAnalysisRecord;
  }

  public void setLienInstanceAnalysisRecord(Object lienInstanceAnalysisRecord) {
    this.lienInstanceAnalysisRecord = lienInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return lienInstanceAnalysisReportType
  **/

  public String getLienInstanceAnalysisReportType() {
    return lienInstanceAnalysisReportType;
  }

  public void setLienInstanceAnalysisReportType(String lienInstanceAnalysisReportType) {
    this.lienInstanceAnalysisReportType = lienInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return lienInstanceAnalysisParameters
  **/

  public String getLienInstanceAnalysisParameters() {
    return lienInstanceAnalysisParameters;
  }

  public void setLienInstanceAnalysisParameters(String lienInstanceAnalysisParameters) {
    this.lienInstanceAnalysisParameters = lienInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return lienInstanceAnalysisReport
  **/

  public Object getLienInstanceAnalysisReport() {
    return lienInstanceAnalysisReport;
  }

  public void setLienInstanceAnalysisReport(Object lienInstanceAnalysisReport) {
    this.lienInstanceAnalysisReport = lienInstanceAnalysisReport;
  }


}

