package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis;
import org.bian.dto.BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsRetrieveInputModel
 */
public class BQWithdrawalsRetrieveInputModel   {
  private Object withdrawalsRetrieveActionTaskRecord = null;

  private String withdrawalsRetrieveActionRequest = null;

  private BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport withdrawalsInstanceReport = null;

  private BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis withdrawalsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return withdrawalsRetrieveActionTaskRecord
  **/

  public Object getWithdrawalsRetrieveActionTaskRecord() {
    return withdrawalsRetrieveActionTaskRecord;
  }

  public void setWithdrawalsRetrieveActionTaskRecord(Object withdrawalsRetrieveActionTaskRecord) {
    this.withdrawalsRetrieveActionTaskRecord = withdrawalsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return withdrawalsRetrieveActionRequest
  **/

  public String getWithdrawalsRetrieveActionRequest() {
    return withdrawalsRetrieveActionRequest;
  }

  public void setWithdrawalsRetrieveActionRequest(String withdrawalsRetrieveActionRequest) {
    this.withdrawalsRetrieveActionRequest = withdrawalsRetrieveActionRequest;
  }


  /**
   * Get withdrawalsInstanceReport
   * @return withdrawalsInstanceReport
  **/

  public BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport getWithdrawalsInstanceReport() {
    return withdrawalsInstanceReport;
  }

  public void setWithdrawalsInstanceReport(BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport withdrawalsInstanceReport) {
    this.withdrawalsInstanceReport = withdrawalsInstanceReport;
  }


  /**
   * Get withdrawalsInstanceAnalysis
   * @return withdrawalsInstanceAnalysis
  **/

  public BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis getWithdrawalsInstanceAnalysis() {
    return withdrawalsInstanceAnalysis;
  }

  public void setWithdrawalsInstanceAnalysis(BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis withdrawalsInstanceAnalysis) {
    this.withdrawalsInstanceAnalysis = withdrawalsInstanceAnalysis;
  }


}

