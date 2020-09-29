package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceAnalysis;
import org.bian.dto.BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialInstrumentRetrieveInputModel
 */
public class BQFinancialInstrumentRetrieveInputModel   {
  private Object financialInstrumentRetrieveActionTaskRecord = null;

  private String financialInstrumentRetrieveActionRequest = null;

  private BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceReport financialInstrumentInstanceReport = null;

  private BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceAnalysis financialInstrumentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialInstrumentRetrieveActionTaskRecord
  **/

  public Object getFinancialInstrumentRetrieveActionTaskRecord() {
    return financialInstrumentRetrieveActionTaskRecord;
  }

  public void setFinancialInstrumentRetrieveActionTaskRecord(Object financialInstrumentRetrieveActionTaskRecord) {
    this.financialInstrumentRetrieveActionTaskRecord = financialInstrumentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialInstrumentRetrieveActionRequest
  **/

  public String getFinancialInstrumentRetrieveActionRequest() {
    return financialInstrumentRetrieveActionRequest;
  }

  public void setFinancialInstrumentRetrieveActionRequest(String financialInstrumentRetrieveActionRequest) {
    this.financialInstrumentRetrieveActionRequest = financialInstrumentRetrieveActionRequest;
  }


  /**
   * Get financialInstrumentInstanceReport
   * @return financialInstrumentInstanceReport
  **/

  public BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceReport getFinancialInstrumentInstanceReport() {
    return financialInstrumentInstanceReport;
  }

  public void setFinancialInstrumentInstanceReport(BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceReport financialInstrumentInstanceReport) {
    this.financialInstrumentInstanceReport = financialInstrumentInstanceReport;
  }


  /**
   * Get financialInstrumentInstanceAnalysis
   * @return financialInstrumentInstanceAnalysis
  **/

  public BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceAnalysis getFinancialInstrumentInstanceAnalysis() {
    return financialInstrumentInstanceAnalysis;
  }

  public void setFinancialInstrumentInstanceAnalysis(BQFinancialInstrumentRetrieveInputModelFinancialInstrumentInstanceAnalysis financialInstrumentInstanceAnalysis) {
    this.financialInstrumentInstanceAnalysis = financialInstrumentInstanceAnalysis;
  }


}

