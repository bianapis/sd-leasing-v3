package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis
 */
public class BQWithdrawalsRetrieveInputModelWithdrawalsInstanceAnalysis   {
  private String withdrawalsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return withdrawalsInstanceAnalysisReference
  **/

  public String getWithdrawalsInstanceAnalysisReference() {
    return withdrawalsInstanceAnalysisReference;
  }

  public void setWithdrawalsInstanceAnalysisReference(String withdrawalsInstanceAnalysisReference) {
    this.withdrawalsInstanceAnalysisReference = withdrawalsInstanceAnalysisReference;
  }


}

