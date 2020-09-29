package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLienRetrieveOutputModelLienInstanceReport
 */
public class BQLienRetrieveOutputModelLienInstanceReport   {
  private Object lienInstanceReportRecord = null;

  private String lienInstanceReportType = null;

  private String lienInstanceReportParameters = null;

  private Object lienInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return lienInstanceReportRecord
  **/

  public Object getLienInstanceReportRecord() {
    return lienInstanceReportRecord;
  }

  public void setLienInstanceReportRecord(Object lienInstanceReportRecord) {
    this.lienInstanceReportRecord = lienInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return lienInstanceReportType
  **/

  public String getLienInstanceReportType() {
    return lienInstanceReportType;
  }

  public void setLienInstanceReportType(String lienInstanceReportType) {
    this.lienInstanceReportType = lienInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return lienInstanceReportParameters
  **/

  public String getLienInstanceReportParameters() {
    return lienInstanceReportParameters;
  }

  public void setLienInstanceReportParameters(String lienInstanceReportParameters) {
    this.lienInstanceReportParameters = lienInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return lienInstanceReport
  **/

  public Object getLienInstanceReport() {
    return lienInstanceReport;
  }

  public void setLienInstanceReport(Object lienInstanceReport) {
    this.lienInstanceReport = lienInstanceReport;
  }


}

