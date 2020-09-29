package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis
 */
public class BQCorporateActionRetrieveInputModelCorporateActionInstanceAnalysis   {
  private String corporateActionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateActionInstanceAnalysisReference
  **/

  public String getCorporateActionInstanceAnalysisReference() {
    return corporateActionInstanceAnalysisReference;
  }

  public void setCorporateActionInstanceAnalysisReference(String corporateActionInstanceAnalysisReference) {
    this.corporateActionInstanceAnalysisReference = corporateActionInstanceAnalysisReference;
  }


}

