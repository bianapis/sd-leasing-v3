package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingConfigureOutputModel
 */
public class SDLeasingConfigureOutputModel   {
  private String leasingConfigurationActionTaskReference = null;

  private Object leasingConfigurationActionTaskRecord = null;

  private SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord = null;

  private String leasingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return leasingConfigurationActionTaskReference
  **/

  public String getLeasingConfigurationActionTaskReference() {
    return leasingConfigurationActionTaskReference;
  }

  public void setLeasingConfigurationActionTaskReference(String leasingConfigurationActionTaskReference) {
    this.leasingConfigurationActionTaskReference = leasingConfigurationActionTaskReference;
  }


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
   * Get leasingServiceConfigurationRecord
   * @return leasingServiceConfigurationRecord
  **/

  public SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord getLeasingServiceConfigurationRecord() {
    return leasingServiceConfigurationRecord;
  }

  public void setLeasingServiceConfigurationRecord(SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord) {
    this.leasingServiceConfigurationRecord = leasingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return leasingServicingSessionStatus
  **/

  public String getLeasingServicingSessionStatus() {
    return leasingServicingSessionStatus;
  }

  public void setLeasingServicingSessionStatus(String leasingServicingSessionStatus) {
    this.leasingServicingSessionStatus = leasingServicingSessionStatus;
  }


}

