package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeesRetrieveInputModelFeesInstanceAnalysis;
import org.bian.dto.BQFeesRetrieveInputModelFeesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveInputModel
 */
public class BQFeesRetrieveInputModel   {
  private Object feesRetrieveActionTaskRecord = null;

  private String feesRetrieveActionRequest = null;

  private BQFeesRetrieveInputModelFeesInstanceReport feesInstanceReport = null;

  private BQFeesRetrieveInputModelFeesInstanceAnalysis feesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return feesRetrieveActionTaskRecord
  **/

  public Object getFeesRetrieveActionTaskRecord() {
    return feesRetrieveActionTaskRecord;
  }

  public void setFeesRetrieveActionTaskRecord(Object feesRetrieveActionTaskRecord) {
    this.feesRetrieveActionTaskRecord = feesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return feesRetrieveActionRequest
  **/

  public String getFeesRetrieveActionRequest() {
    return feesRetrieveActionRequest;
  }

  public void setFeesRetrieveActionRequest(String feesRetrieveActionRequest) {
    this.feesRetrieveActionRequest = feesRetrieveActionRequest;
  }


  /**
   * Get feesInstanceReport
   * @return feesInstanceReport
  **/

  public BQFeesRetrieveInputModelFeesInstanceReport getFeesInstanceReport() {
    return feesInstanceReport;
  }

  public void setFeesInstanceReport(BQFeesRetrieveInputModelFeesInstanceReport feesInstanceReport) {
    this.feesInstanceReport = feesInstanceReport;
  }


  /**
   * Get feesInstanceAnalysis
   * @return feesInstanceAnalysis
  **/

  public BQFeesRetrieveInputModelFeesInstanceAnalysis getFeesInstanceAnalysis() {
    return feesInstanceAnalysis;
  }

  public void setFeesInstanceAnalysis(BQFeesRetrieveInputModelFeesInstanceAnalysis feesInstanceAnalysis) {
    this.feesInstanceAnalysis = feesInstanceAnalysis;
  }


}

