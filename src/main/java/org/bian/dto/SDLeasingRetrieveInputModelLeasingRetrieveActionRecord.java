package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingActivityAnalysis;
import org.bian.dto.SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDLeasingRetrieveInputModelLeasingRetrieveActionRecord
 */
public class SDLeasingRetrieveInputModelLeasingRetrieveActionRecord   {
  private SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingActivityAnalysis leasingActivityAnalysis = null;

  private SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis leasingPerformanceAnalysis = null;

  private SDLeasingRetrieveInputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get leasingActivityAnalysis
   * @return leasingActivityAnalysis
  **/

  public SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingActivityAnalysis getLeasingActivityAnalysis() {
    return leasingActivityAnalysis;
  }

  public void setLeasingActivityAnalysis(SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingActivityAnalysis leasingActivityAnalysis) {
    this.leasingActivityAnalysis = leasingActivityAnalysis;
  }


  /**
   * Get leasingPerformanceAnalysis
   * @return leasingPerformanceAnalysis
  **/

  public SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis getLeasingPerformanceAnalysis() {
    return leasingPerformanceAnalysis;
  }

  public void setLeasingPerformanceAnalysis(SDLeasingRetrieveInputModelLeasingRetrieveActionRecordLeasingPerformanceAnalysis leasingPerformanceAnalysis) {
    this.leasingPerformanceAnalysis = leasingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDLeasingRetrieveInputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDLeasingRetrieveInputModelLeasingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

