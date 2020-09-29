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
 * SDLeasingConfigureInputModelLeasingServiceConfigurationRecord
 */
public class SDLeasingConfigureInputModelLeasingServiceConfigurationRecord   {
  private String leasingServiceConfigurationSettingReference = null;

  private String leasingServiceConfigurationSettingType = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup leasingServiceConfigurationSetup = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceSubscription leasingServiceSubscription = null;

  private SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceAgreement leasingServiceAgreement = null;


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


}

