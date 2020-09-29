package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingActivityAnalysis;
import org.bian.dto.SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord
 */
public class SDLeasingRetrieveOutputModelLeasingRetrieveActionRecord   {
  private SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingActivityAnalysis leasingActivityAnalysis = null;

  private SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis leasingPerformanceAnalysis = null;

  private SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get leasingActivityAnalysis
   * @return leasingActivityAnalysis
  **/

  public SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingActivityAnalysis getLeasingActivityAnalysis() {
    return leasingActivityAnalysis;
  }

  public void setLeasingActivityAnalysis(SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingActivityAnalysis leasingActivityAnalysis) {
    this.leasingActivityAnalysis = leasingActivityAnalysis;
  }


  /**
   * Get leasingPerformanceAnalysis
   * @return leasingPerformanceAnalysis
  **/

  public SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis getLeasingPerformanceAnalysis() {
    return leasingPerformanceAnalysis;
  }

  public void setLeasingPerformanceAnalysis(SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis leasingPerformanceAnalysis) {
    this.leasingPerformanceAnalysis = leasingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDLeasingRetrieveOutputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

