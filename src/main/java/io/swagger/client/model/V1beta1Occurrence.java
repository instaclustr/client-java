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
import io.swagger.client.model.V1beta1NoteKind;
import io.swagger.client.model.V1beta1Resource;
import io.swagger.client.model.V1beta1attestationDetails;
import io.swagger.client.model.V1beta1buildDetails;
import io.swagger.client.model.V1beta1deploymentDetails;
import io.swagger.client.model.V1beta1discoveryDetails;
import io.swagger.client.model.V1beta1imageDetails;
import io.swagger.client.model.V1beta1packageDetails;
import io.swagger.client.model.V1beta1vulnerabilityDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * An instance of an analysis type that has been found on a resource.
 */
@Schema(description = "An instance of an analysis type that has been found on a resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1Occurrence {
  @SerializedName("name")
  private String name = null;

  @SerializedName("resource")
  private V1beta1Resource resource = null;

  @SerializedName("noteName")
  private String noteName = null;

  @SerializedName("kind")
  private V1beta1NoteKind kind = null;

  @SerializedName("remediation")
  private String remediation = null;

  @SerializedName("createTime")
  private OffsetDateTime createTime = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("vulnerability")
  private V1beta1vulnerabilityDetails vulnerability = null;

  @SerializedName("build")
  private V1beta1buildDetails build = null;

  @SerializedName("derivedImage")
  private V1beta1imageDetails derivedImage = null;

  @SerializedName("installation")
  private V1beta1packageDetails installation = null;

  @SerializedName("deployment")
  private V1beta1deploymentDetails deployment = null;

  @SerializedName("discovered")
  private V1beta1discoveryDetails discovered = null;

  @SerializedName("attestation")
  private V1beta1attestationDetails attestation = null;

  public V1beta1Occurrence name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;.
   * @return name
  **/
  @Schema(description = "The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1Occurrence resource(V1beta1Resource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public V1beta1Resource getResource() {
    return resource;
  }

  public void setResource(V1beta1Resource resource) {
    this.resource = resource;
  }

  public V1beta1Occurrence noteName(String noteName) {
    this.noteName = noteName;
    return this;
  }

   /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. This field can be used as a filter in list requests.
   * @return noteName
  **/
  @Schema(description = "Required. Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.")
  public String getNoteName() {
    return noteName;
  }

  public void setNoteName(String noteName) {
    this.noteName = noteName;
  }

  public V1beta1Occurrence kind(V1beta1NoteKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public V1beta1NoteKind getKind() {
    return kind;
  }

  public void setKind(V1beta1NoteKind kind) {
    this.kind = kind;
  }

  public V1beta1Occurrence remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

   /**
   * A description of actions that can be taken to remedy the note.
   * @return remediation
  **/
  @Schema(description = "A description of actions that can be taken to remedy the note.")
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }

   /**
   * Output only. The time this occurrence was created.
   * @return createTime
  **/
  @Schema(description = "Output only. The time this occurrence was created.")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

   /**
   * Output only. The time this occurrence was last updated.
   * @return updateTime
  **/
  @Schema(description = "Output only. The time this occurrence was last updated.")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public V1beta1Occurrence vulnerability(V1beta1vulnerabilityDetails vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

   /**
   * Get vulnerability
   * @return vulnerability
  **/
  @Schema(description = "")
  public V1beta1vulnerabilityDetails getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(V1beta1vulnerabilityDetails vulnerability) {
    this.vulnerability = vulnerability;
  }

  public V1beta1Occurrence build(V1beta1buildDetails build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @Schema(description = "")
  public V1beta1buildDetails getBuild() {
    return build;
  }

  public void setBuild(V1beta1buildDetails build) {
    this.build = build;
  }

  public V1beta1Occurrence derivedImage(V1beta1imageDetails derivedImage) {
    this.derivedImage = derivedImage;
    return this;
  }

   /**
   * Get derivedImage
   * @return derivedImage
  **/
  @Schema(description = "")
  public V1beta1imageDetails getDerivedImage() {
    return derivedImage;
  }

  public void setDerivedImage(V1beta1imageDetails derivedImage) {
    this.derivedImage = derivedImage;
  }

  public V1beta1Occurrence installation(V1beta1packageDetails installation) {
    this.installation = installation;
    return this;
  }

   /**
   * Get installation
   * @return installation
  **/
  @Schema(description = "")
  public V1beta1packageDetails getInstallation() {
    return installation;
  }

  public void setInstallation(V1beta1packageDetails installation) {
    this.installation = installation;
  }

  public V1beta1Occurrence deployment(V1beta1deploymentDetails deployment) {
    this.deployment = deployment;
    return this;
  }

   /**
   * Get deployment
   * @return deployment
  **/
  @Schema(description = "")
  public V1beta1deploymentDetails getDeployment() {
    return deployment;
  }

  public void setDeployment(V1beta1deploymentDetails deployment) {
    this.deployment = deployment;
  }

  public V1beta1Occurrence discovered(V1beta1discoveryDetails discovered) {
    this.discovered = discovered;
    return this;
  }

   /**
   * Get discovered
   * @return discovered
  **/
  @Schema(description = "")
  public V1beta1discoveryDetails getDiscovered() {
    return discovered;
  }

  public void setDiscovered(V1beta1discoveryDetails discovered) {
    this.discovered = discovered;
  }

  public V1beta1Occurrence attestation(V1beta1attestationDetails attestation) {
    this.attestation = attestation;
    return this;
  }

   /**
   * Get attestation
   * @return attestation
  **/
  @Schema(description = "")
  public V1beta1attestationDetails getAttestation() {
    return attestation;
  }

  public void setAttestation(V1beta1attestationDetails attestation) {
    this.attestation = attestation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Occurrence v1beta1Occurrence = (V1beta1Occurrence) o;
    return Objects.equals(this.name, v1beta1Occurrence.name) &&
        Objects.equals(this.resource, v1beta1Occurrence.resource) &&
        Objects.equals(this.noteName, v1beta1Occurrence.noteName) &&
        Objects.equals(this.kind, v1beta1Occurrence.kind) &&
        Objects.equals(this.remediation, v1beta1Occurrence.remediation) &&
        Objects.equals(this.createTime, v1beta1Occurrence.createTime) &&
        Objects.equals(this.updateTime, v1beta1Occurrence.updateTime) &&
        Objects.equals(this.vulnerability, v1beta1Occurrence.vulnerability) &&
        Objects.equals(this.build, v1beta1Occurrence.build) &&
        Objects.equals(this.derivedImage, v1beta1Occurrence.derivedImage) &&
        Objects.equals(this.installation, v1beta1Occurrence.installation) &&
        Objects.equals(this.deployment, v1beta1Occurrence.deployment) &&
        Objects.equals(this.discovered, v1beta1Occurrence.discovered) &&
        Objects.equals(this.attestation, v1beta1Occurrence.attestation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resource, noteName, kind, remediation, createTime, updateTime, vulnerability, build, derivedImage, installation, deployment, discovered, attestation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Occurrence {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    noteName: ").append(toIndentedString(noteName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    derivedImage: ").append(toIndentedString(derivedImage)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    discovered: ").append(toIndentedString(discovered)).append("\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
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
