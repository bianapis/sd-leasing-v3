package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis
 */
public class CRLeasingArrangementRetrieveOutputModelLeasingArrangementInstanceAnalysis   {
  private String leasingArrangementInstanceAnalysisData = null;

  private String leasingArrangementInstanceAnalysisReportType = null;

  private Object leasingArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return leasingArrangementInstanceAnalysisData
  **/

  public String getLeasingArrangementInstanceAnalysisData() {
    return leasingArrangementInstanceAnalysisData;
  }

  public void setLeasingArrangementInstanceAnalysisData(String leasingArrangementInstanceAnalysisData) {
    this.leasingArrangementInstanceAnalysisData = leasingArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return leasingArrangementInstanceAnalysisReportType
  **/

  public String getLeasingArrangementInstanceAnalysisReportType() {
    return leasingArrangementInstanceAnalysisReportType;
  }

  public void setLeasingArrangementInstanceAnalysisReportType(String leasingArrangementInstanceAnalysisReportType) {
    this.leasingArrangementInstanceAnalysisReportType = leasingArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return leasingArrangementInstanceAnalysisReport
  **/

  public Object getLeasingArrangementInstanceAnalysisReport() {
    return leasingArrangementInstanceAnalysisReport;
  }

  public void setLeasingArrangementInstanceAnalysisReport(Object leasingArrangementInstanceAnalysisReport) {
    this.leasingArrangementInstanceAnalysisReport = leasingArrangementInstanceAnalysisReport;
  }


}

