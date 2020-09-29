package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecord
 */
public class SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecord   {
  private String leasingServiceType = null;

  private String leasingServiceVersion = null;

  private String leasingServiceDescription = null;

  private SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines leasingServicePoliciesandGuidelines = null;

  private String leasingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return leasingServiceType
  **/

  public String getLeasingServiceType() {
    return leasingServiceType;
  }

  public void setLeasingServiceType(String leasingServiceType) {
    this.leasingServiceType = leasingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return leasingServiceVersion
  **/

  public String getLeasingServiceVersion() {
    return leasingServiceVersion;
  }

  public void setLeasingServiceVersion(String leasingServiceVersion) {
    this.leasingServiceVersion = leasingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return leasingServiceDescription
  **/

  public String getLeasingServiceDescription() {
    return leasingServiceDescription;
  }

  public void setLeasingServiceDescription(String leasingServiceDescription) {
    this.leasingServiceDescription = leasingServiceDescription;
  }


  /**
   * Get leasingServicePoliciesandGuidelines
   * @return leasingServicePoliciesandGuidelines
  **/

  public SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines getLeasingServicePoliciesandGuidelines() {
    return leasingServicePoliciesandGuidelines;
  }

  public void setLeasingServicePoliciesandGuidelines(SDLeasingRetrieveOutputModelLeasingOfferedServiceLeasingServiceRecordLeasingServicePoliciesandGuidelines leasingServicePoliciesandGuidelines) {
    this.leasingServicePoliciesandGuidelines = leasingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return leasingServiceSchedule
  **/

  public String getLeasingServiceSchedule() {
    return leasingServiceSchedule;
  }

  public void setLeasingServiceSchedule(String leasingServiceSchedule) {
    this.leasingServiceSchedule = leasingServiceSchedule;
  }


}

