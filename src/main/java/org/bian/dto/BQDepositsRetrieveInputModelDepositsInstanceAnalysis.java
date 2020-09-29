package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsRetrieveInputModelDepositsInstanceAnalysis
 */
public class BQDepositsRetrieveInputModelDepositsInstanceAnalysis   {
  private String depositsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositsInstanceAnalysisReference
  **/

  public String getDepositsInstanceAnalysisReference() {
    return depositsInstanceAnalysisReference;
  }

  public void setDepositsInstanceAnalysisReference(String depositsInstanceAnalysisReference) {
    this.depositsInstanceAnalysisReference = depositsInstanceAnalysisReference;
  }


}

