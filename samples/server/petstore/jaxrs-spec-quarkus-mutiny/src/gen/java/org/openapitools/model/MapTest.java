package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@org.eclipse.microprofile.openapi.annotations.media.Schema(description="")
@JsonTypeName("MapTest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class MapTest  implements Serializable {
  private @Valid Map<String, Map<String, String>> mapMapOfString = new HashMap<>();
  public enum InnerEnum {

    UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("lower"));


    private String value;

    InnerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static InnerEnum fromString(String s) {
        for (InnerEnum b : InnerEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static InnerEnum fromValue(String value) {
        for (InnerEnum b : InnerEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid Map<String, InnerEnum> mapOfEnumString = new HashMap<>();
  private @Valid Map<String, Boolean> directMap = new HashMap<>();
  private @Valid Map<String, Boolean> indirectMap = new HashMap<>();

  protected MapTest(MapTestBuilder<?, ?> b) {
    this.mapMapOfString = b.mapMapOfString;
    this.mapOfEnumString = b.mapOfEnumString;
    this.directMap = b.directMap;
    this.indirectMap = b.indirectMap;
  }

  public MapTest() {
  }

  /**
   **/
  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("map_map_of_string")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  @JsonProperty("map_map_of_string")
  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    if (this.mapMapOfString == null) {
      this.mapMapOfString = new HashMap<>();
    }

    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

  public MapTest removeMapMapOfStringItem(String key) {
    if (this.mapMapOfString != null) {
      this.mapMapOfString.remove(key);
    }

    return this;
  }
  /**
   **/
  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("map_of_enum_string")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }

  @JsonProperty("map_of_enum_string")
  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    if (this.mapOfEnumString == null) {
      this.mapOfEnumString = new HashMap<>();
    }

    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

  public MapTest removeMapOfEnumStringItem(String key) {
    if (this.mapOfEnumString != null) {
      this.mapOfEnumString.remove(key);
    }

    return this;
  }
  /**
   **/
  public MapTest directMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("direct_map")
  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }

  @JsonProperty("direct_map")
  public void setDirectMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    if (this.directMap == null) {
      this.directMap = new HashMap<>();
    }

    this.directMap.put(key, directMapItem);
    return this;
  }

  public MapTest removeDirectMapItem(String key) {
    if (this.directMap != null) {
      this.directMap.remove(key);
    }

    return this;
  }
  /**
   **/
  public MapTest indirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("indirect_map")
  public Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }

  @JsonProperty("indirect_map")
  public void setIndirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    if (this.indirectMap == null) {
      this.indirectMap = new HashMap<>();
    }

    this.indirectMap.put(key, indirectMapItem);
    return this;
  }

  public MapTest removeIndirectMapItem(String key) {
    if (this.indirectMap != null) {
      this.indirectMap.remove(key);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(this.mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(this.mapOfEnumString, mapTest.mapOfEnumString) &&
        Objects.equals(this.directMap, mapTest.directMap) &&
        Objects.equals(this.indirectMap, mapTest.indirectMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString, directMap, indirectMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
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


  public static MapTestBuilder<?, ?> builder() {
    return new MapTestBuilderImpl();
  }

  private static final class MapTestBuilderImpl extends MapTestBuilder<MapTest, MapTestBuilderImpl> {

    @Override
    protected MapTestBuilderImpl self() {
      return this;
    }

    @Override
    public MapTest build() {
      return new MapTest(this);
    }
  }

  public static abstract class MapTestBuilder<C extends MapTest, B extends MapTestBuilder<C, B>>  {
    private Map<String, Map<String, String>> mapMapOfString = new HashMap<>();
    private Map<String, InnerEnum> mapOfEnumString = new HashMap<>();
    private Map<String, Boolean> directMap = new HashMap<>();
    private Map<String, Boolean> indirectMap = new HashMap<>();
    protected abstract B self();

    public abstract C build();

    public B mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
      this.mapMapOfString = mapMapOfString;
      return self();
    }
    public B mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
      this.mapOfEnumString = mapOfEnumString;
      return self();
    }
    public B directMap(Map<String, Boolean> directMap) {
      this.directMap = directMap;
      return self();
    }
    public B indirectMap(Map<String, Boolean> indirectMap) {
      this.indirectMap = indirectMap;
      return self();
    }
  }
}

