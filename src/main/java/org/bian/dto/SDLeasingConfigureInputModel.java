package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingConfigureInputModelLeasingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingConfigureInputModel
 */
public class SDLeasingConfigureInputModel   {
  private Object leasingConfigurationActionTaskRecord = null;

  private String leasingServicingSessionReference = null;

  private String leasingServiceReference = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return leasingConfigurationActionTaskRecord
  **/

  public Object getLeasingConfigurationActionTaskRecord() {
    return leasingConfigurationActionTaskRecord;
  }

  public void setLeasingConfigurationActionTaskRecord(Object leasingConfigurationActionTaskRecord) {
    this.leasingConfigurationActionTaskRecord = leasingConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return leasingServicingSessionReference
  **/

  public String getLeasingServicingSessionReference() {
    return leasingServicingSessionReference;
  }

  public void setLeasingServicingSessionReference(String leasingServicingSessionReference) {
    this.leasingServicingSessionReference = leasingServicingSessionReference;
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

  public SDLeasingConfigureInputModelLeasingServiceConfigurationRecord getLeasingServiceConfigurationRecord() {
    return leasingServiceConfigurationRecord;
  }

  public void setLeasingServiceConfigurationRecord(SDLeasingConfigureInputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord) {
    this.leasingServiceConfigurationRecord = leasingServiceConfigurationRecord;
  }


}

