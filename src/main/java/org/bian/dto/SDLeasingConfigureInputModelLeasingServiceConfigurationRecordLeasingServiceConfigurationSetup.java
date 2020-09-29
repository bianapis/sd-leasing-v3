package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup
 */
public class SDLeasingConfigureInputModelLeasingServiceConfigurationRecordLeasingServiceConfigurationSetup   {
  private String leasingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return leasingServiceConfigurationParameter
  **/

  public String getLeasingServiceConfigurationParameter() {
    return leasingServiceConfigurationParameter;
  }

  public void setLeasingServiceConfigurationParameter(String leasingServiceConfigurationParameter) {
    this.leasingServiceConfigurationParameter = leasingServiceConfigurationParameter;
  }


}

