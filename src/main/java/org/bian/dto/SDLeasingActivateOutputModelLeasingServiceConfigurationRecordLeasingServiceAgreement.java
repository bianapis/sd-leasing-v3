package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement
 */
public class SDLeasingActivateOutputModelLeasingServiceConfigurationRecordLeasingServiceAgreement   {
  private String leasingServiceAgreementReference = null;

  private String leasingServiceUserReference = null;

  private String leasingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return leasingServiceAgreementReference
  **/

  public String getLeasingServiceAgreementReference() {
    return leasingServiceAgreementReference;
  }

  public void setLeasingServiceAgreementReference(String leasingServiceAgreementReference) {
    this.leasingServiceAgreementReference = leasingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return leasingServiceUserReference
  **/

  public String getLeasingServiceUserReference() {
    return leasingServiceUserReference;
  }

  public void setLeasingServiceUserReference(String leasingServiceUserReference) {
    this.leasingServiceUserReference = leasingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return leasingServiceAgreementTermsandConditions
  **/

  public String getLeasingServiceAgreementTermsandConditions() {
    return leasingServiceAgreementTermsandConditions;
  }

  public void setLeasingServiceAgreementTermsandConditions(String leasingServiceAgreementTermsandConditions) {
    this.leasingServiceAgreementTermsandConditions = leasingServiceAgreementTermsandConditions;
  }


}

