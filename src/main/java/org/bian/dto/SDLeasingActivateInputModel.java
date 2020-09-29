package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingActivateInputModelLeasingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingActivateInputModel
 */
public class SDLeasingActivateInputModel   {
  private Object leasingActivationActionTaskRecord = null;

  private String leasingCenterReference = null;

  private String leasingServiceReference = null;

  private SDLeasingActivateInputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return leasingActivationActionTaskRecord
  **/

  public Object getLeasingActivationActionTaskRecord() {
    return leasingActivationActionTaskRecord;
  }

  public void setLeasingActivationActionTaskRecord(Object leasingActivationActionTaskRecord) {
    this.leasingActivationActionTaskRecord = leasingActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return leasingCenterReference
  **/

  public String getLeasingCenterReference() {
    return leasingCenterReference;
  }

  public void setLeasingCenterReference(String leasingCenterReference) {
    this.leasingCenterReference = leasingCenterReference;
  }


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
   * Get leasingServiceConfigurationRecord
   * @return leasingServiceConfigurationRecord
  **/

  public SDLeasingActivateInputModelLeasingServiceConfigurationRecord getLeasingServiceConfigurationRecord() {
    return leasingServiceConfigurationRecord;
  }

  public void setLeasingServiceConfigurationRecord(SDLeasingActivateInputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord) {
    this.leasingServiceConfigurationRecord = leasingServiceConfigurationRecord;
  }


}

