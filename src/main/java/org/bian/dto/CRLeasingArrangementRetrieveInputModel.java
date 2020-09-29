package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis;
import org.bian.dto.CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveInputModel
 */
public class CRLeasingArrangementRetrieveInputModel   {
  private Object leasingArrangementRetrieveActionTaskRecord = null;

  private String leasingArrangementRetrieveActionRequest = null;

  private CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord leasingArrangementInstanceReportRecord = null;

  private CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis leasingArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leasingArrangementRetrieveActionTaskRecord
  **/

  public Object getLeasingArrangementRetrieveActionTaskRecord() {
    return leasingArrangementRetrieveActionTaskRecord;
  }

  public void setLeasingArrangementRetrieveActionTaskRecord(Object leasingArrangementRetrieveActionTaskRecord) {
    this.leasingArrangementRetrieveActionTaskRecord = leasingArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return leasingArrangementRetrieveActionRequest
  **/

  public String getLeasingArrangementRetrieveActionRequest() {
    return leasingArrangementRetrieveActionRequest;
  }

  public void setLeasingArrangementRetrieveActionRequest(String leasingArrangementRetrieveActionRequest) {
    this.leasingArrangementRetrieveActionRequest = leasingArrangementRetrieveActionRequest;
  }


  /**
   * Get leasingArrangementInstanceReportRecord
   * @return leasingArrangementInstanceReportRecord
  **/

  public CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord getLeasingArrangementInstanceReportRecord() {
    return leasingArrangementInstanceReportRecord;
  }

  public void setLeasingArrangementInstanceReportRecord(CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord leasingArrangementInstanceReportRecord) {
    this.leasingArrangementInstanceReportRecord = leasingArrangementInstanceReportRecord;
  }


  /**
   * Get leasingArrangementInstanceAnalysis
   * @return leasingArrangementInstanceAnalysis
  **/

  public CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis getLeasingArrangementInstanceAnalysis() {
    return leasingArrangementInstanceAnalysis;
  }

  public void setLeasingArrangementInstanceAnalysis(CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis leasingArrangementInstanceAnalysis) {
    this.leasingArrangementInstanceAnalysis = leasingArrangementInstanceAnalysis;
  }


}

