package com.project.wastemanagement.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WasteManagementDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T22:03:52.612060600+05:30[Asia/Calcutta]")
public class WasteManagementDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("userNumber")
  private Long userNumber;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("dustBinNo")
  private String dustBinNo;

  @JsonProperty("weight")
  private Double weight;

  public WasteManagementDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * primary key
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "primary key")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WasteManagementDto userNumber(Long userNumber) {
    this.userNumber = userNumber;
    return this;
  }

  /**
   * user phone no
   * @return userNumber
  */
  @ApiModelProperty(value = "user phone no")


  public Long getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(Long userNumber) {
    this.userNumber = userNumber;
  }

  public WasteManagementDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * the userName
   * @return userName
  */
  @ApiModelProperty(value = "the userName")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public WasteManagementDto dustBinNo(String dustBinNo) {
    this.dustBinNo = dustBinNo;
    return this;
  }

  /**
   * serial no of dustbin
   * @return dustBinNo
  */
  @ApiModelProperty(value = "serial no of dustbin")


  public String getDustBinNo() {
    return dustBinNo;
  }

  public void setDustBinNo(String dustBinNo) {
    this.dustBinNo = dustBinNo;
  }

  public WasteManagementDto weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * serial no of dustbin
   * @return weight
  */
  @ApiModelProperty(value = "serial no of dustbin")


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WasteManagementDto wasteManagement = (WasteManagementDto) o;
    return Objects.equals(this.id, wasteManagement.id) &&
        Objects.equals(this.userNumber, wasteManagement.userNumber) &&
        Objects.equals(this.userName, wasteManagement.userName) &&
        Objects.equals(this.dustBinNo, wasteManagement.dustBinNo) &&
        Objects.equals(this.weight, wasteManagement.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userNumber, userName, dustBinNo, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WasteManagementDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userNumber: ").append(toIndentedString(userNumber)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    dustBinNo: ").append(toIndentedString(dustBinNo)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

