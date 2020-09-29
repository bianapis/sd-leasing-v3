package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord
 */
public class CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceReportRecord   {
  private String leasingArrangementInstanceReportData = null;

  private String leasingArrangementInstanceReportType = null;

  private Object leasingArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return leasingArrangementInstanceReportData
  **/

  public String getLeasingArrangementInstanceReportData() {
    return leasingArrangementInstanceReportData;
  }

  public void setLeasingArrangementInstanceReportData(String leasingArrangementInstanceReportData) {
    this.leasingArrangementInstanceReportData = leasingArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return leasingArrangementInstanceReportType
  **/

  public String getLeasingArrangementInstanceReportType() {
    return leasingArrangementInstanceReportType;
  }

  public void setLeasingArrangementInstanceReportType(String leasingArrangementInstanceReportType) {
    this.leasingArrangementInstanceReportType = leasingArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return leasingArrangementInstanceReport
  **/

  public Object getLeasingArrangementInstanceReport() {
    return leasingArrangementInstanceReport;
  }

  public void setLeasingArrangementInstanceReport(Object leasingArrangementInstanceReport) {
    this.leasingArrangementInstanceReport = leasingArrangementInstanceReport;
  }


}

