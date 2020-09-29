package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionRetrieveOutputModelCorporateActionInstanceReport
 */
public class BQCorporateActionRetrieveOutputModelCorporateActionInstanceReport   {
  private Object corporateActionInstanceReportRecord = null;

  private String corporateActionInstanceReportType = null;

  private String corporateActionInstanceReportParameters = null;

  private Object corporateActionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateActionInstanceReportRecord
  **/

  public Object getCorporateActionInstanceReportRecord() {
    return corporateActionInstanceReportRecord;
  }

  public void setCorporateActionInstanceReportRecord(Object corporateActionInstanceReportRecord) {
    this.corporateActionInstanceReportRecord = corporateActionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateActionInstanceReportType
  **/

  public String getCorporateActionInstanceReportType() {
    return corporateActionInstanceReportType;
  }

  public void setCorporateActionInstanceReportType(String corporateActionInstanceReportType) {
    this.corporateActionInstanceReportType = corporateActionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateActionInstanceReportParameters
  **/

  public String getCorporateActionInstanceReportParameters() {
    return corporateActionInstanceReportParameters;
  }

  public void setCorporateActionInstanceReportParameters(String corporateActionInstanceReportParameters) {
    this.corporateActionInstanceReportParameters = corporateActionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateActionInstanceReport
  **/

  public Object getCorporateActionInstanceReport() {
    return corporateActionInstanceReport;
  }

  public void setCorporateActionInstanceReport(Object corporateActionInstanceReport) {
    this.corporateActionInstanceReport = corporateActionInstanceReport;
  }


}

