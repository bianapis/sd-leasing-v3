package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSweepRetrieveInputModelSweepInstanceReport
 */
public class BQSweepRetrieveInputModelSweepInstanceReport   {
  private String sweepInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return sweepInstanceReportReference
  **/

  public String getSweepInstanceReportReference() {
    return sweepInstanceReportReference;
  }

  public void setSweepInstanceReportReference(String sweepInstanceReportReference) {
    this.sweepInstanceReportReference = sweepInstanceReportReference;
  }


}

