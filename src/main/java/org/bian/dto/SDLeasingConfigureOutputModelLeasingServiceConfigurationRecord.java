package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceAgreement;
import org.bian.dto.SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup;
import org.bian.dto.SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord
 */
public class SDLeasingConfigureOutputModelLeasingServiceConfigurationRecord   {
  private String leasingServiceConfigurationSettingDescription = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription leasingServiceSubscription = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceAgreement leasingServiceAgreement = null;

  private String leasingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return leasingServiceConfigurationSettingDescription
  **/

  public String getLeasingServiceConfigurationSettingDescription() {
    return leasingServiceConfigurationSettingDescription;
  }

  public void setLeasingServiceConfigurationSettingDescription(String leasingServiceConfigurationSettingDescription) {
    this.leasingServiceConfigurationSettingDescription = leasingServiceConfigurationSettingDescription;
  }


  /**
   * Get leasingServiceConfigurationSetup
   * @return leasingServiceConfigurationSetup
  **/

  public SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup getLeasingServiceConfigurationSetup() {
    return leasingServiceConfigurationSetup;
  }

  public void setLeasingServiceConfigurationSetup(SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup) {
    this.leasingServiceConfigurationSetup = leasingServiceConfigurationSetup;
  }


  /**
   * Get leasingServiceSubscription
   * @return leasingServiceSubscription
  **/

  public SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription getLeasingServiceSubscription() {
    return leasingServiceSubscription;
  }

  public void setLeasingServiceSubscription(SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription leasingServiceSubscription) {
    this.leasingServiceSubscription = leasingServiceSubscription;
  }


  /**
   * Get leasingServiceAgreement
   * @return leasingServiceAgreement
  **/

  public SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceAgreement getLeasingServiceAgreement() {
    return leasingServiceAgreement;
  }

  public void setLeasingServiceAgreement(SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceAgreement leasingServiceAgreement) {
    this.leasingServiceAgreement = leasingServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return leasingServiceStatus
  **/

  public String getLeasingServiceStatus() {
    return leasingServiceStatus;
  }

  public void setLeasingServiceStatus(String leasingServiceStatus) {
    this.leasingServiceStatus = leasingServiceStatus;
  }


}

