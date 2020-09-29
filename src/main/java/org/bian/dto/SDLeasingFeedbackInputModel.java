package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingFeedbackInputModelLeasingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingFeedbackInputModel
 */
public class SDLeasingFeedbackInputModel   {
  private Object leasingFeedbackActionTaskRecord = null;

  private SDLeasingFeedbackInputModelLeasingFeedbackActionRecord leasingFeedbackActionRecord = null;


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

  public SDLeasingFeedbackInputModelLeasingFeedbackActionRecord getLeasingFeedbackActionRecord() {
    return leasingFeedbackActionRecord;
  }

  public void setLeasingFeedbackActionRecord(SDLeasingFeedbackInputModelLeasingFeedbackActionRecord leasingFeedbackActionRecord) {
    this.leasingFeedbackActionRecord = leasingFeedbackActionRecord;
  }


}

