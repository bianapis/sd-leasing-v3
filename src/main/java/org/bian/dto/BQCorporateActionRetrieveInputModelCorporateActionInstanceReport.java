package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionRetrieveInputModelCorporateActionInstanceReport
 */
public class BQCorporateActionRetrieveInputModelCorporateActionInstanceReport   {
  private String corporateActionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateActionInstanceReportReference
  **/

  public String getCorporateActionInstanceReportReference() {
    return corporateActionInstanceReportReference;
  }

  public void setCorporateActionInstanceReportReference(String corporateActionInstanceReportReference) {
    this.corporateActionInstanceReportReference = corporateActionInstanceReportReference;
  }


}

