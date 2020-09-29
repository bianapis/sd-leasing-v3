package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport
 */
public class BQFinancialInstrumentRetrieveOutputModelFinancialInstrumentInstanceReport   {
  private Object financialInstrumentInstanceReportRecord = null;

  private String financialInstrumentInstanceReportType = null;

  private String financialInstrumentInstanceReportParameters = null;

  private Object financialInstrumentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialInstrumentInstanceReportRecord
  **/

  public Object getFinancialInstrumentInstanceReportRecord() {
    return financialInstrumentInstanceReportRecord;
  }

  public void setFinancialInstrumentInstanceReportRecord(Object financialInstrumentInstanceReportRecord) {
    this.financialInstrumentInstanceReportRecord = financialInstrumentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialInstrumentInstanceReportType
  **/

  public String getFinancialInstrumentInstanceReportType() {
    return financialInstrumentInstanceReportType;
  }

  public void setFinancialInstrumentInstanceReportType(String financialInstrumentInstanceReportType) {
    this.financialInstrumentInstanceReportType = financialInstrumentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialInstrumentInstanceReportParameters
  **/

  public String getFinancialInstrumentInstanceReportParameters() {
    return financialInstrumentInstanceReportParameters;
  }

  public void setFinancialInstrumentInstanceReportParameters(String financialInstrumentInstanceReportParameters) {
    this.financialInstrumentInstanceReportParameters = financialInstrumentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialInstrumentInstanceReport
  **/

  public Object getFinancialInstrumentInstanceReport() {
    return financialInstrumentInstanceReport;
  }

  public void setFinancialInstrumentInstanceReport(Object financialInstrumentInstanceReport) {
    this.financialInstrumentInstanceReport = financialInstrumentInstanceReport;
  }


}

