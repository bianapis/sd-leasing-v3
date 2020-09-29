package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsRetrieveOutputModelWithdrawalsInstanceReport
 */
public class BQWithdrawalsRetrieveOutputModelWithdrawalsInstanceReport   {
  private Object withdrawalsInstanceReportRecord = null;

  private String withdrawalsInstanceReportType = null;

  private String withdrawalsInstanceReportParameters = null;

  private Object withdrawalsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return withdrawalsInstanceReportRecord
  **/

  public Object getWithdrawalsInstanceReportRecord() {
    return withdrawalsInstanceReportRecord;
  }

  public void setWithdrawalsInstanceReportRecord(Object withdrawalsInstanceReportRecord) {
    this.withdrawalsInstanceReportRecord = withdrawalsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return withdrawalsInstanceReportType
  **/

  public String getWithdrawalsInstanceReportType() {
    return withdrawalsInstanceReportType;
  }

  public void setWithdrawalsInstanceReportType(String withdrawalsInstanceReportType) {
    this.withdrawalsInstanceReportType = withdrawalsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return withdrawalsInstanceReportParameters
  **/

  public String getWithdrawalsInstanceReportParameters() {
    return withdrawalsInstanceReportParameters;
  }

  public void setWithdrawalsInstanceReportParameters(String withdrawalsInstanceReportParameters) {
    this.withdrawalsInstanceReportParameters = withdrawalsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return withdrawalsInstanceReport
  **/

  public Object getWithdrawalsInstanceReport() {
    return withdrawalsInstanceReport;
  }

  public void setWithdrawalsInstanceReport(Object withdrawalsInstanceReport) {
    this.withdrawalsInstanceReport = withdrawalsInstanceReport;
  }


}

