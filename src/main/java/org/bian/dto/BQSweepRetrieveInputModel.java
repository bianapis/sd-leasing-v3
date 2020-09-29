package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSweepRetrieveInputModelSweepInstanceAnalysis;
import org.bian.dto.BQSweepRetrieveInputModelSweepInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSweepRetrieveInputModel
 */
public class BQSweepRetrieveInputModel   {
  private Object sweepRetrieveActionTaskRecord = null;

  private String sweepRetrieveActionRequest = null;

  private BQSweepRetrieveInputModelSweepInstanceReport sweepInstanceReport = null;

  private BQSweepRetrieveInputModelSweepInstanceAnalysis sweepInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return sweepRetrieveActionTaskRecord
  **/

  public Object getSweepRetrieveActionTaskRecord() {
    return sweepRetrieveActionTaskRecord;
  }

  public void setSweepRetrieveActionTaskRecord(Object sweepRetrieveActionTaskRecord) {
    this.sweepRetrieveActionTaskRecord = sweepRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return sweepRetrieveActionRequest
  **/

  public String getSweepRetrieveActionRequest() {
    return sweepRetrieveActionRequest;
  }

  public void setSweepRetrieveActionRequest(String sweepRetrieveActionRequest) {
    this.sweepRetrieveActionRequest = sweepRetrieveActionRequest;
  }


  /**
   * Get sweepInstanceReport
   * @return sweepInstanceReport
  **/

  public BQSweepRetrieveInputModelSweepInstanceReport getSweepInstanceReport() {
    return sweepInstanceReport;
  }

  public void setSweepInstanceReport(BQSweepRetrieveInputModelSweepInstanceReport sweepInstanceReport) {
    this.sweepInstanceReport = sweepInstanceReport;
  }


  /**
   * Get sweepInstanceAnalysis
   * @return sweepInstanceAnalysis
  **/

  public BQSweepRetrieveInputModelSweepInstanceAnalysis getSweepInstanceAnalysis() {
    return sweepInstanceAnalysis;
  }

  public void setSweepInstanceAnalysis(BQSweepRetrieveInputModelSweepInstanceAnalysis sweepInstanceAnalysis) {
    this.sweepInstanceAnalysis = sweepInstanceAnalysis;
  }


}

