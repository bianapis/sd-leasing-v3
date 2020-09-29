package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDLeasingActivateInputModelLeasingServiceConfigurationRecord
 */
public class SDLeasingActivateInputModelLeasingServiceConfigurationRecord   {
  private String leasingServiceConfigurationSettingReference = null;

  private String leasingServiceConfigurationSettingType = null;

  private SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return leasingServiceConfigurationSettingReference
  **/

  public String getLeasingServiceConfigurationSettingReference() {
    return leasingServiceConfigurationSettingReference;
  }

  public void setLeasingServiceConfigurationSettingReference(String leasingServiceConfigurationSettingReference) {
    this.leasingServiceConfigurationSettingReference = leasingServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return leasingServiceConfigurationSettingType
  **/

  public String getLeasingServiceConfigurationSettingType() {
    return leasingServiceConfigurationSettingType;
  }

  public void setLeasingServiceConfigurationSettingType(String leasingServiceConfigurationSettingType) {
    this.leasingServiceConfigurationSettingType = leasingServiceConfigurationSettingType;
  }


  /**
   * Get leasingServiceConfigurationSetup
   * @return leasingServiceConfigurationSetup
  **/

  public SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup getLeasingServiceConfigurationSetup() {
    return leasingServiceConfigurationSetup;
  }

  public void setLeasingServiceConfigurationSetup(SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup) {
    this.leasingServiceConfigurationSetup = leasingServiceConfigurationSetup;
  }


}

