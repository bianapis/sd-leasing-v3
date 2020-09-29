package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription
 */
public class SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription   {
  private String leasingServiceSubscriberReference = null;

  private String leasingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return leasingServiceSubscriberReference
  **/

  public String getLeasingServiceSubscriberReference() {
    return leasingServiceSubscriberReference;
  }

  public void setLeasingServiceSubscriberReference(String leasingServiceSubscriberReference) {
    this.leasingServiceSubscriberReference = leasingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return leasingServiceSubscriberAccessProfile
  **/

  public String getLeasingServiceSubscriberAccessProfile() {
    return leasingServiceSubscriberAccessProfile;
  }

  public void setLeasingServiceSubscriberAccessProfile(String leasingServiceSubscriberAccessProfile) {
    this.leasingServiceSubscriberAccessProfile = leasingServiceSubscriberAccessProfile;
  }


}

