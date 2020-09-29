package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis
 */
public class BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceAnalysis   {
  private Object financialInstrumentInstanceAnalysisRecord = null;

  private String financialInstrumentInstanceAnalysisReportType = null;

  private String financialInstrumentInstanceAnalysisParameters = null;

  private Object financialInstrumentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialInstrumentInstanceAnalysisRecord
  **/

  public Object getFinancialInstrumentInstanceAnalysisRecord() {
    return financialInstrumentInstanceAnalysisRecord;
  }

  public void setFinancialInstrumentInstanceAnalysisRecord(Object financialInstrumentInstanceAnalysisRecord) {
    this.financialInstrumentInstanceAnalysisRecord = financialInstrumentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialInstrumentInstanceAnalysisReportType
  **/

  public String getFinancialInstrumentInstanceAnalysisReportType() {
    return financialInstrumentInstanceAnalysisReportType;
  }

  public void setFinancialInstrumentInstanceAnalysisReportType(String financialInstrumentInstanceAnalysisReportType) {
    this.financialInstrumentInstanceAnalysisReportType = financialInstrumentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialInstrumentInstanceAnalysisParameters
  **/

  public String getFinancialInstrumentInstanceAnalysisParameters() {
    return financialInstrumentInstanceAnalysisParameters;
  }

  public void setFinancialInstrumentInstanceAnalysisParameters(String financialInstrumentInstanceAnalysisParameters) {
    this.financialInstrumentInstanceAnalysisParameters = financialInstrumentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialInstrumentInstanceAnalysisReport
  **/

  public Object getFinancialInstrumentInstanceAnalysisReport() {
    return financialInstrumentInstanceAnalysisReport;
  }

  public void setFinancialInstrumentInstanceAnalysisReport(Object financialInstrumentInstanceAnalysisReport) {
    this.financialInstrumentInstanceAnalysisReport = financialInstrumentInstanceAnalysisReport;
  }


}

