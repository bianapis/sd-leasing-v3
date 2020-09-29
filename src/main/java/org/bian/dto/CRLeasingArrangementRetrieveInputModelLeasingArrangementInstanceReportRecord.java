package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord
 */
public class CRLeasingArrangementRetrieveInputModelLeasingArrangementInstanceReportRecord   {
  private String leasingArrangementInstanceReportReference = null;

  private String leasingArrangementInstanceReportType = null;

  private String leasingArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return leasingArrangementInstanceReportReference
  **/

  public String getLeasingArrangementInstanceReportReference() {
    return leasingArrangementInstanceReportReference;
  }

  public void setLeasingArrangementInstanceReportReference(String leasingArrangementInstanceReportReference) {
    this.leasingArrangementInstanceReportReference = leasingArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return leasingArrangementInstanceReportParameters
  **/

  public String getLeasingArrangementInstanceReportParameters() {
    return leasingArrangementInstanceReportParameters;
  }

  public void setLeasingArrangementInstanceReportParameters(String leasingArrangementInstanceReportParameters) {
    this.leasingArrangementInstanceReportParameters = leasingArrangementInstanceReportParameters;
  }


}

