package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingFeedbackOutputModelLeasingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingFeedbackOutputModel
 */
public class SDLeasingFeedbackOutputModel   {
  private String leasingFeedbackActionTaskReference = null;

  private Object leasingFeedbackActionTaskRecord = null;

  private SDLeasingFeedbackOutputModelLeasingFeedbackActionRecord leasingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return leasingFeedbackActionTaskReference
  **/

  public String getLeasingFeedbackActionTaskReference() {
    return leasingFeedbackActionTaskReference;
  }

  public void setLeasingFeedbackActionTaskReference(String leasingFeedbackActionTaskReference) {
    this.leasingFeedbackActionTaskReference = leasingFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return leasingFeedbackActionTaskRecord
  **/

  public Object getLeasingFeedbackActionTaskRecord() {
    return leasingFeedbackActionTaskRecord;
  }

  public void setLeasingFeedbackActionTaskRecord(Object leasingFeedbackActionTaskRecord) {
    this.leasingFeedbackActionTaskRecord = leasingFeedbackActionTaskRecord;
  }


  /**
   * Get leasingFeedbackActionRecord
   * @return leasingFeedbackActionRecord
  **/

  public SDLeasingFeedbackOutputModelLeasingFeedbackActionRecord getLeasingFeedbackActionRecord() {
    return leasingFeedbackActionRecord;
  }

  public void setLeasingFeedbackActionRecord(SDLeasingFeedbackOutputModelLeasingFeedbackActionRecord leasingFeedbackActionRecord) {
    this.leasingFeedbackActionRecord = leasingFeedbackActionRecord;
  }


}

