/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
 */
@JsonPropertyOrder({
  HealthCheckResult.JSON_PROPERTY_NULLABLE_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class HealthCheckResult {
  public static final String JSON_PROPERTY_NULLABLE_MESSAGE = "NullableMessage";
  private JsonNullable<String> nullableMessage = JsonNullable.<String>undefined();

  public HealthCheckResult() { 
  }

  public HealthCheckResult nullableMessage(@javax.annotation.Nullable String nullableMessage) {
    this.nullableMessage = JsonNullable.<String>of(nullableMessage);
    return this;
  }

  /**
   * Get nullableMessage
   * @return nullableMessage
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getNullableMessage() {
        return nullableMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NULLABLE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNullableMessage_JsonNullable() {
    return nullableMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_NULLABLE_MESSAGE)
  public void setNullableMessage_JsonNullable(JsonNullable<String> nullableMessage) {
    this.nullableMessage = nullableMessage;
  }

  public void setNullableMessage(@javax.annotation.Nullable String nullableMessage) {
    this.nullableMessage = JsonNullable.<String>of(nullableMessage);
  }


  /**
   * Return true if this HealthCheckResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    nullableMessage: ").append(toIndentedString(nullableMessage)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `NullableMessage` to the URL query string
    if (getNullableMessage() != null) {
      joiner.add(String.format("%sNullableMessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNullableMessage()))));
    }

    return joiner.toString();
  }

    public static class Builder {

    private HealthCheckResult instance;

    public Builder() {
      this(new HealthCheckResult());
    }

    protected Builder(HealthCheckResult instance) {
      this.instance = instance;
    }

    public HealthCheckResult.Builder nullableMessage(String nullableMessage) {
      this.instance.nullableMessage = JsonNullable.<String>of(nullableMessage);
      return this;
    }
    public HealthCheckResult.Builder nullableMessage(JsonNullable<String> nullableMessage) {
      this.instance.nullableMessage = nullableMessage;
      return this;
    }


    /**
    * returns a built HealthCheckResult instance.
    *
    * The builder is not reusable.
    */
    public HealthCheckResult build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static HealthCheckResult.Builder builder() {
    return new HealthCheckResult.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public HealthCheckResult.Builder toBuilder() {
    return new HealthCheckResult.Builder()
      .nullableMessage(getNullableMessage());
  }

}

