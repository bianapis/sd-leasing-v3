package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingActivateOutputModelLeasingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingActivateOutputModel
 */
public class SDLeasingActivateOutputModel   {
  private String leasingActivationActionTaskReference = null;

  private Object leasingActivationActionTaskRecord = null;

  private String leasingServicingSessionReference = null;

  private Object leasingServicingSessionRecord = null;

  private SDLeasingActivateOutputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord = null;

  private String leasingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return leasingActivationActionTaskReference
  **/

  public String getLeasingActivationActionTaskReference() {
    return leasingActivationActionTaskReference;
  }

  public void setLeasingActivationActionTaskReference(String leasingActivationActionTaskReference) {
    this.leasingActivationActionTaskReference = leasingActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return leasingServicingSessionRecord
  **/

  public Object getLeasingServicingSessionRecord() {
    return leasingServicingSessionRecord;
  }

  public void setLeasingServicingSessionRecord(Object leasingServicingSessionRecord) {
    this.leasingServicingSessionRecord = leasingServicingSessionRecord;
  }


  /**
   * Get leasingServiceConfigurationRecord
   * @return leasingServiceConfigurationRecord
  **/

  public SDLeasingActivateOutputModelLeasingServiceConfigurationRecord getLeasingServiceConfigurationRecord() {
    return leasingServiceConfigurationRecord;
  }

  public void setLeasingServiceConfigurationRecord(SDLeasingActivateOutputModelLeasingServiceConfigurationRecord leasingServiceConfigurationRecord) {
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

