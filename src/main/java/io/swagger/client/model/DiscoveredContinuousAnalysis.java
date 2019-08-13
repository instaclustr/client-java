/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Whether the resource is continuously analyzed.   - CONTINUOUS_ANALYSIS_UNSPECIFIED: Unknown.  - ACTIVE: The resource is continuously analyzed.  - INACTIVE: The resource is ignored for continuous analysis.
 */
@JsonAdapter(DiscoveredContinuousAnalysis.Adapter.class)
public enum DiscoveredContinuousAnalysis {
  CONTINUOUS_ANALYSIS_UNSPECIFIED("CONTINUOUS_ANALYSIS_UNSPECIFIED"),
  ACTIVE("ACTIVE"),
  INACTIVE("INACTIVE");

  private String value;

  DiscoveredContinuousAnalysis(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiscoveredContinuousAnalysis fromValue(String text) {
    for (DiscoveredContinuousAnalysis b : DiscoveredContinuousAnalysis.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiscoveredContinuousAnalysis> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiscoveredContinuousAnalysis enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiscoveredContinuousAnalysis read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiscoveredContinuousAnalysis.fromValue(String.valueOf(value));
    }
  }
}