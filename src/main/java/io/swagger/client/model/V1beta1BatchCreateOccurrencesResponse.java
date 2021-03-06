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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.V1beta1Occurrence;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response for creating occurrences in batch.
 */
@Schema(description = "Response for creating occurrences in batch.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1BatchCreateOccurrencesResponse {
  @SerializedName("occurrences")
  private List<V1beta1Occurrence> occurrences = null;

  public V1beta1BatchCreateOccurrencesResponse occurrences(List<V1beta1Occurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public V1beta1BatchCreateOccurrencesResponse addOccurrencesItem(V1beta1Occurrence occurrencesItem) {
    if (this.occurrences == null) {
      this.occurrences = new ArrayList<V1beta1Occurrence>();
    }
    this.occurrences.add(occurrencesItem);
    return this;
  }

   /**
   * The occurrences that were created.
   * @return occurrences
  **/
  @Schema(description = "The occurrences that were created.")
  public List<V1beta1Occurrence> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(List<V1beta1Occurrence> occurrences) {
    this.occurrences = occurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1BatchCreateOccurrencesResponse v1beta1BatchCreateOccurrencesResponse = (V1beta1BatchCreateOccurrencesResponse) o;
    return Objects.equals(this.occurrences, v1beta1BatchCreateOccurrencesResponse.occurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurrences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1BatchCreateOccurrencesResponse {\n");
    
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
