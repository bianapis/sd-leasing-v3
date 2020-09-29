package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsRetrieveInputModelDepositsInstanceAnalysis;
import org.bian.dto.BQDepositsRetrieveInputModelDepositsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositsRetrieveInputModel
 */
public class BQDepositsRetrieveInputModel   {
  private Object depositsRetrieveActionTaskRecord = null;

  private String depositsRetrieveActionRequest = null;

  private BQDepositsRetrieveInputModelDepositsInstanceReport depositsInstanceReport = null;

  private BQDepositsRetrieveInputModelDepositsInstanceAnalysis depositsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositsRetrieveActionTaskRecord
  **/

  public Object getDepositsRetrieveActionTaskRecord() {
    return depositsRetrieveActionTaskRecord;
  }

  public void setDepositsRetrieveActionTaskRecord(Object depositsRetrieveActionTaskRecord) {
    this.depositsRetrieveActionTaskRecord = depositsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositsRetrieveActionRequest
  **/

  public String getDepositsRetrieveActionRequest() {
    return depositsRetrieveActionRequest;
  }

  public void setDepositsRetrieveActionRequest(String depositsRetrieveActionRequest) {
    this.depositsRetrieveActionRequest = depositsRetrieveActionRequest;
  }


  /**
   * Get depositsInstanceReport
   * @return depositsInstanceReport
  **/

  public BQDepositsRetrieveInputModelDepositsInstanceReport getDepositsInstanceReport() {
    return depositsInstanceReport;
  }

  public void setDepositsInstanceReport(BQDepositsRetrieveInputModelDepositsInstanceReport depositsInstanceReport) {
    this.depositsInstanceReport = depositsInstanceReport;
  }


  /**
   * Get depositsInstanceAnalysis
   * @return depositsInstanceAnalysis
  **/

  public BQDepositsRetrieveInputModelDepositsInstanceAnalysis getDepositsInstanceAnalysis() {
    return depositsInstanceAnalysis;
  }

  public void setDepositsInstanceAnalysis(BQDepositsRetrieveInputModelDepositsInstanceAnalysis depositsInstanceAnalysis) {
    this.depositsInstanceAnalysis = depositsInstanceAnalysis;
  }


}

