package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Model for testing model name same as property name
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Name   {
  @JsonProperty("name")
  @NotNull

  private Integer name;

  @JsonProperty("snake_case")
  
  private Integer snakeCase;

  @JsonProperty("property")
  
  private String property;

  @JsonProperty("123Number")
  
  private Integer _123number;

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public Name snakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
    return this;
  }

   /**
   * Get snakeCase
   * @return snakeCase
  **/
  public Integer getSnakeCase() {
    return snakeCase;
  }

  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  public Name property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public Name _123number(Integer _123number) {
    this._123number = _123number;
    return this;
  }

   /**
   * Get _123number
   * @return _123number
  **/
  public Integer get123number() {
    return _123number;
  }

  public void set123number(Integer _123number) {
    this._123number = _123number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(name, name.name) &&
        Objects.equals(snakeCase, name.snakeCase) &&
        Objects.equals(property, name.property) &&
        Objects.equals(_123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
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

