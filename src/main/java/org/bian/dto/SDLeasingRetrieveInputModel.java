package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingOfferedService;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveInputModel
 */
public class SDLeasingRetrieveInputModel   {
  private Object leasingRetrieveActionTaskRecord = null;

  private String leasingRetrieveActionRequest = null;

  private SDLeasingRetrieveInputModelLeasingRetrieveActionRecord leasingRetrieveActionRecord = null;

  private SDLeasingRetrieveInputModelLeasingOfferedService leasingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leasingRetrieveActionTaskRecord
  **/

  public Object getLeasingRetrieveActionTaskRecord() {
    return leasingRetrieveActionTaskRecord;
  }

  public void setLeasingRetrieveActionTaskRecord(Object leasingRetrieveActionTaskRecord) {
    this.leasingRetrieveActionTaskRecord = leasingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return leasingRetrieveActionRequest
  **/

  public String getLeasingRetrieveActionRequest() {
    return leasingRetrieveActionRequest;
  }

  public void setLeasingRetrieveActionRequest(String leasingRetrieveActionRequest) {
    this.leasingRetrieveActionRequest = leasingRetrieveActionRequest;
  }


  /**
   * Get leasingRetrieveActionRecord
   * @return leasingRetrieveActionRecord
  **/

  public SDLeasingRetrieveInputModelLeasingRetrieveActionRecord getLeasingRetrieveActionRecord() {
    return leasingRetrieveActionRecord;
  }

  public void setLeasingRetrieveActionRecord(SDLeasingRetrieveInputModelLeasingRetrieveActionRecord leasingRetrieveActionRecord) {
    this.leasingRetrieveActionRecord = leasingRetrieveActionRecord;
  }


  /**
   * Get leasingOfferedService
   * @return leasingOfferedService
  **/

  public SDLeasingRetrieveInputModelLeasingOfferedService getLeasingOfferedService() {
    return leasingOfferedService;
  }

  public void setLeasingOfferedService(SDLeasingRetrieveInputModelLeasingOfferedService leasingOfferedService) {
    this.leasingOfferedService = leasingOfferedService;
  }


}

