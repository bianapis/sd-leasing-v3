package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis
 */
public class CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceAnalysis   {
  private String leasingArrangementInstanceAnalysisReference = null;

  private String leasingArrangementInstanceAnalysisReportType = null;

  private String leasingArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return leasingArrangementInstanceAnalysisReference
  **/

  public String getLeasingArrangementInstanceAnalysisReference() {
    return leasingArrangementInstanceAnalysisReference;
  }

  public void setLeasingArrangementInstanceAnalysisReference(String leasingArrangementInstanceAnalysisReference) {
    this.leasingArrangementInstanceAnalysisReference = leasingArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return leasingArrangementInstanceAnalysisParameters
  **/

  public String getLeasingArrangementInstanceAnalysisParameters() {
    return leasingArrangementInstanceAnalysisParameters;
  }

  public void setLeasingArrangementInstanceAnalysisParameters(String leasingArrangementInstanceAnalysisParameters) {
    this.leasingArrangementInstanceAnalysisParameters = leasingArrangementInstanceAnalysisParameters;
  }


}

