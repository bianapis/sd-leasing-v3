package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis;
import org.bian.dto.BQCorporateActionRetrieveInputModelCorporateActionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCorporateActionRetrieveInputModel
 */
public class BQCorporateActionRetrieveInputModel   {
  private Object corporateActionRetrieveActionTaskRecord = null;

  private String corporateActionRetrieveActionRequest = null;

  private BQCorporateActionRetrieveInputModelCorporateActionInstanceReport corporateActionInstanceReport = null;

  private BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis corporateActionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateActionRetrieveActionTaskRecord
  **/

  public Object getCorporateActionRetrieveActionTaskRecord() {
    return corporateActionRetrieveActionTaskRecord;
  }

  public void setCorporateActionRetrieveActionTaskRecord(Object corporateActionRetrieveActionTaskRecord) {
    this.corporateActionRetrieveActionTaskRecord = corporateActionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateActionRetrieveActionRequest
  **/

  public String getCorporateActionRetrieveActionRequest() {
    return corporateActionRetrieveActionRequest;
  }

  public void setCorporateActionRetrieveActionRequest(String corporateActionRetrieveActionRequest) {
    this.corporateActionRetrieveActionRequest = corporateActionRetrieveActionRequest;
  }


  /**
   * Get corporateActionInstanceReport
   * @return corporateActionInstanceReport
  **/

  public BQCorporateActionRetrieveInputModelCorporateActionInstanceReport getCorporateActionInstanceReport() {
    return corporateActionInstanceReport;
  }

  public void setCorporateActionInstanceReport(BQCorporateActionRetrieveInputModelCorporateActionInstanceReport corporateActionInstanceReport) {
    this.corporateActionInstanceReport = corporateActionInstanceReport;
  }


  /**
   * Get corporateActionInstanceAnalysis
   * @return corporateActionInstanceAnalysis
  **/

  public BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis getCorporateActionInstanceAnalysis() {
    return corporateActionInstanceAnalysis;
  }

  public void setCorporateActionInstanceAnalysis(BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis corporateActionInstanceAnalysis) {
    this.corporateActionInstanceAnalysis = corporateActionInstanceAnalysis;
  }


}

