package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLienRetrieveInputModelLienInstanceAnalysis;
import org.bian.dto.BQLienRetrieveInputModelLienInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLienRetrieveInputModel
 */
public class BQLienRetrieveInputModel   {
  private Object lienRetrieveActionTaskRecord = null;

  private String lienRetrieveActionRequest = null;

  private BQLienRetrieveInputModelLienInstanceReport lienInstanceReport = null;

  private BQLienRetrieveInputModelLienInstanceAnalysis lienInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return lienRetrieveActionTaskRecord
  **/

  public Object getLienRetrieveActionTaskRecord() {
    return lienRetrieveActionTaskRecord;
  }

  public void setLienRetrieveActionTaskRecord(Object lienRetrieveActionTaskRecord) {
    this.lienRetrieveActionTaskRecord = lienRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return lienRetrieveActionRequest
  **/

  public String getLienRetrieveActionRequest() {
    return lienRetrieveActionRequest;
  }

  public void setLienRetrieveActionRequest(String lienRetrieveActionRequest) {
    this.lienRetrieveActionRequest = lienRetrieveActionRequest;
  }


  /**
   * Get lienInstanceReport
   * @return lienInstanceReport
  **/

  public BQLienRetrieveInputModelLienInstanceReport getLienInstanceReport() {
    return lienInstanceReport;
  }

  public void setLienInstanceReport(BQLienRetrieveInputModelLienInstanceReport lienInstanceReport) {
    this.lienInstanceReport = lienInstanceReport;
  }


  /**
   * Get lienInstanceAnalysis
   * @return lienInstanceAnalysis
  **/

  public BQLienRetrieveInputModelLienInstanceAnalysis getLienInstanceAnalysis() {
    return lienInstanceAnalysis;
  }

  public void setLienInstanceAnalysis(BQLienRetrieveInputModelLienInstanceAnalysis lienInstanceAnalysis) {
    this.lienInstanceAnalysis = lienInstanceAnalysis;
  }


}

