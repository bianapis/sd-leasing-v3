package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup;
import org.bian.dto.SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement;
import org.bian.dto.SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDLeasingActivateOutputModelLeasingServiceConfigurationRecord
 */
public class SDLeasingActivateOutputModelLeasingServiceConfigurationRecord   {
  private String leasingServiceConfigurationSettingReference = null;

  private String leasingServiceConfigurationSettingDescription = null;

  private SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup = null;

  private SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceSubscription leasingServiceSubscription = null;

  private SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement leasingServiceAgreement = null;

  private String leasingServiceStatus = null;


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

  public SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup getLeasingServiceConfigurationSetup() {
    return leasingServiceConfigurationSetup;
  }

  public void setLeasingServiceConfigurationSetup(SDLeasingActivateInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup) {
    this.leasingServiceConfigurationSetup = leasingServiceConfigurationSetup;
  }


  /**
   * Get leasingServiceSubscription
   * @return leasingServiceSubscription
  **/

  public SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceSubscription getLeasingServiceSubscription() {
    return leasingServiceSubscription;
  }

  public void setLeasingServiceSubscription(SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceSubscription leasingServiceSubscription) {
    this.leasingServiceSubscription = leasingServiceSubscription;
  }


  /**
   * Get leasingServiceAgreement
   * @return leasingServiceAgreement
  **/

  public SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement getLeasingServiceAgreement() {
    return leasingServiceAgreement;
  }

  public void setLeasingServiceAgreement(SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement leasingServiceAgreement) {
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

