package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingOfferedServiceLeasingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveInputModelLeasingOfferedService
 */
public class SDLeasingRetrieveInputModelLeasingOfferedService   {
  private String leasingServiceReference = null;

  private SDLeasingRetrieveInputModelLeasingOfferedServiceLeasingServiceRecord leasingServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return leasingServiceReference
  **/

  public String getLeasingServiceReference() {
    return leasingServiceReference;
  }

  public void setLeasingServiceReference(String leasingServiceReference) {
    this.leasingServiceReference = leasingServiceReference;
  }


  /**
   * Get leasingServiceRecord
   * @return leasingServiceRecord
  **/

  public SDLeasingRetrieveInputModelLeasingOfferedServiceLeasingServiceRecord getLeasingServiceRecord() {
    return leasingServiceRecord;
  }

  public void setLeasingServiceRecord(SDLeasingRetrieveInputModelLeasingOfferedServiceLeasingServiceRecord leasingServiceRecord) {
    this.leasingServiceRecord = leasingServiceRecord;
  }


}

