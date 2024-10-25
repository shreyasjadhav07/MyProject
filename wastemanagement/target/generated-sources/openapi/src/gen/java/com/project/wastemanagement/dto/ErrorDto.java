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
 * Error Payload
 */
@ApiModel(description = "Error Payload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T22:03:52.612060600+05:30[Asia/Calcutta]")
public class ErrorDto   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("rootCause")
  private String rootCause;

  @JsonProperty("advice")
  private String advice;

  public ErrorDto code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error Code
   * @return code
  */
  @ApiModelProperty(example = "400", value = "Error Code")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error Message
   * @return message
  */
  @ApiModelProperty(example = "some sample error", value = "Error Message")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * The root cause
   * @return rootCause
  */
  @ApiModelProperty(example = "the root cause of the error", value = "The root cause")


  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }

  public ErrorDto advice(String advice) {
    this.advice = advice;
    return this;
  }

  /**
   * The possible soultion to the error
   * @return advice
  */
  @ApiModelProperty(example = "an advice with which the error could be resolved", value = "The possible soultion to the error")


  public String getAdvice() {
    return advice;
  }

  public void setAdvice(String advice) {
    this.advice = advice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto error = (ErrorDto) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.rootCause, error.rootCause) &&
        Objects.equals(this.advice, error.advice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, rootCause, advice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
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

