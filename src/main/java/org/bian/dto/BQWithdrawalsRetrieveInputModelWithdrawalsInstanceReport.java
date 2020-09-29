package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport
 */
public class BQWithdrawalsRetrieveInputModelWithdrawalsInstanceReport   {
  private String withdrawalsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return withdrawalsInstanceReportReference
  **/

  public String getWithdrawalsInstanceReportReference() {
    return withdrawalsInstanceReportReference;
  }

  public void setWithdrawalsInstanceReportReference(String withdrawalsInstanceReportReference) {
    this.withdrawalsInstanceReportReference = withdrawalsInstanceReportReference;
  }


}

