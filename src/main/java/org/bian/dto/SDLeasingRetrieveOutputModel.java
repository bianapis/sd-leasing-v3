package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingOfferedService;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveOutputModel
 */
public class SDLeasingRetrieveOutputModel   {
  private String leasingRetrieveActionTaskReference = null;

  private Object leasingRetrieveActionTaskRecord = null;

  private String leasingRetrieveActionResponse = null;

  private SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord leasingRetrieveActionRecord = null;

  private SDLeasingRetrieveOutputModelLeasingOfferedService leasingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return leasingRetrieveActionTaskReference
  **/

  public String getLeasingRetrieveActionTaskReference() {
    return leasingRetrieveActionTaskReference;
  }

  public void setLeasingRetrieveActionTaskReference(String leasingRetrieveActionTaskReference) {
    this.leasingRetrieveActionTaskReference = leasingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return leasingRetrieveActionResponse
  **/

  public String getLeasingRetrieveActionResponse() {
    return leasingRetrieveActionResponse;
  }

  public void setLeasingRetrieveActionResponse(String leasingRetrieveActionResponse) {
    this.leasingRetrieveActionResponse = leasingRetrieveActionResponse;
  }


  /**
   * Get leasingRetrieveActionRecord
   * @return leasingRetrieveActionRecord
  **/

  public SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord getLeasingRetrieveActionRecord() {
    return leasingRetrieveActionRecord;
  }

  public void setLeasingRetrieveActionRecord(SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord leasingRetrieveActionRecord) {
    this.leasingRetrieveActionRecord = leasingRetrieveActionRecord;
  }


  /**
   * Get leasingOfferedService
   * @return leasingOfferedService
  **/

  public SDLeasingRetrieveOutputModelLeasingOfferedService getLeasingOfferedService() {
    return leasingOfferedService;
  }

  public void setLeasingOfferedService(SDLeasingRetrieveOutputModelLeasingOfferedService leasingOfferedService) {
    this.leasingOfferedService = leasingOfferedService;
  }


}

