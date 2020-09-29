package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines
 */
public class SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines   {
  private String leasingServiceEligibility = null;

  private String leasingServiceIntendedUses = null;

  private String leasingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return leasingServiceEligibility
  **/

  public String getLeasingServiceEligibility() {
    return leasingServiceEligibility;
  }

  public void setLeasingServiceEligibility(String leasingServiceEligibility) {
    this.leasingServiceEligibility = leasingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return leasingServiceIntendedUses
  **/

  public String getLeasingServiceIntendedUses() {
    return leasingServiceIntendedUses;
  }

  public void setLeasingServiceIntendedUses(String leasingServiceIntendedUses) {
    this.leasingServiceIntendedUses = leasingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return leasingServicePricingandTerms
  **/

  public String getLeasingServicePricingandTerms() {
    return leasingServicePricingandTerms;
  }

  public void setLeasingServicePricingandTerms(String leasingServicePricingandTerms) {
    this.leasingServicePricingandTerms = leasingServicePricingandTerms;
  }


}

