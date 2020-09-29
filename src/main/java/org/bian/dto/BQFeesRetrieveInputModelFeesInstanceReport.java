package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveInputModelFeesInstanceReport
 */
public class BQFeesRetrieveInputModelFeesInstanceReport   {
  private String feesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return feesInstanceReportReference
  **/

  public String getFeesInstanceReportReference() {
    return feesInstanceReportReference;
  }

  public void setFeesInstanceReportReference(String feesInstanceReportReference) {
    this.feesInstanceReportReference = feesInstanceReportReference;
  }


}

