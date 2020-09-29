package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionRetrieveOutputModelCorporateActionInstanceAnalysis
 */
public class BQCorporateActionRetrieveOutputModelCorporateActionInstanceAnalysis   {
  private Object corporateActionInstanceAnalysisRecord = null;

  private String corporateActionInstanceAnalysisReportType = null;

  private String corporateActionInstanceAnalysisParameters = null;

  private Object corporateActionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateActionInstanceAnalysisRecord
  **/

  public Object getCorporateActionInstanceAnalysisRecord() {
    return corporateActionInstanceAnalysisRecord;
  }

  public void setCorporateActionInstanceAnalysisRecord(Object corporateActionInstanceAnalysisRecord) {
    this.corporateActionInstanceAnalysisRecord = corporateActionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateActionInstanceAnalysisReportType
  **/

  public String getCorporateActionInstanceAnalysisReportType() {
    return corporateActionInstanceAnalysisReportType;
  }

  public void setCorporateActionInstanceAnalysisReportType(String corporateActionInstanceAnalysisReportType) {
    this.corporateActionInstanceAnalysisReportType = corporateActionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateActionInstanceAnalysisParameters
  **/

  public String getCorporateActionInstanceAnalysisParameters() {
    return corporateActionInstanceAnalysisParameters;
  }

  public void setCorporateActionInstanceAnalysisParameters(String corporateActionInstanceAnalysisParameters) {
    this.corporateActionInstanceAnalysisParameters = corporateActionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateActionInstanceAnalysisReport
  **/

  public Object getCorporateActionInstanceAnalysisReport() {
    return corporateActionInstanceAnalysisReport;
  }

  public void setCorporateActionInstanceAnalysisReport(Object corporateActionInstanceAnalysisReport) {
    this.corporateActionInstanceAnalysisReport = corporateActionInstanceAnalysisReport;
  }


}

