/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.grafeas.client.Basis;
import io.grafeas.client.BuildType;
import io.grafeas.client.Deployable;
import io.grafeas.client.Discovery;
import io.grafeas.client.ModelPackage;
import io.grafeas.client.RelatedUrl;
import io.grafeas.client.VulnerabilityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Note provides a detailed description of a note using information from the provider of the note.
 */
@ApiModel(description = "Note provides a detailed description of a note using information from the provider of the note.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:44:14.136-04:00")
public class Note   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("longDescription")
  private String longDescription = null;

  /**
   * This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests. @OutputOnly
   */
  public enum KindEnum {
    @SerializedName("CUSTOM")
    CUSTOM("CUSTOM"),
    
    @SerializedName("PACKAGE_VULNERABILITY")
    PACKAGE_VULNERABILITY("PACKAGE_VULNERABILITY"),
    
    @SerializedName("BUILD_DETAILS")
    BUILD_DETAILS("BUILD_DETAILS"),
    
    @SerializedName("IMAGE_BASIS")
    IMAGE_BASIS("IMAGE_BASIS"),
    
    @SerializedName("PACKAGE_MANAGER")
    PACKAGE_MANAGER("PACKAGE_MANAGER"),
    
    @SerializedName("DEPLOYABLE")
    DEPLOYABLE("DEPLOYABLE"),
    
    @SerializedName("DISCOVERY")
    DISCOVERY("DISCOVERY");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("vulnerabilityType")
  private VulnerabilityType vulnerabilityType = null;

  @SerializedName("buildType")
  private BuildType buildType = null;

  @SerializedName("baseImage")
  private Basis baseImage = null;

  @SerializedName("package")
  private ModelPackage _package = null;

  @SerializedName("deployable")
  private Deployable deployable = null;

  @SerializedName("discovery")
  private Discovery discovery = null;

  @SerializedName("relatedUrl")
  private List<RelatedUrl> relatedUrl = new ArrayList<RelatedUrl>();

  @SerializedName("expirationTime")
  private String expirationTime = null;

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("updateTime")
  private String updateTime = null;

  @SerializedName("operationName")
  private String operationName = null;

  @SerializedName("relatedNoteNames")
  private List<String> relatedNoteNames = new ArrayList<String>();

  public Note name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the note in the form \"projects/{project_id}/notes/{note_id}\"
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the note in the form \"projects/{project_id}/notes/{note_id}\"")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Note shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A one sentence description of this note
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "A one sentence description of this note")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Note longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A detailed description of this note
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "A detailed description of this note")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Note kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests. @OutputOnly
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests. @OutputOnly")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Note vulnerabilityType(VulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
    return this;
  }

   /**
   * A package vulnerability type of note.
   * @return vulnerabilityType
  **/
  @ApiModelProperty(example = "null", value = "A package vulnerability type of note.")
  public VulnerabilityType getVulnerabilityType() {
    return vulnerabilityType;
  }

  public void setVulnerabilityType(VulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
  }

  public Note buildType(BuildType buildType) {
    this.buildType = buildType;
    return this;
  }

   /**
   * Build provenance type for a verifiable build.
   * @return buildType
  **/
  @ApiModelProperty(example = "null", value = "Build provenance type for a verifiable build.")
  public BuildType getBuildType() {
    return buildType;
  }

  public void setBuildType(BuildType buildType) {
    this.buildType = buildType;
  }

  public Note baseImage(Basis baseImage) {
    this.baseImage = baseImage;
    return this;
  }

   /**
   * A note describing a base image.
   * @return baseImage
  **/
  @ApiModelProperty(example = "null", value = "A note describing a base image.")
  public Basis getBaseImage() {
    return baseImage;
  }

  public void setBaseImage(Basis baseImage) {
    this.baseImage = baseImage;
  }

  public Note _package(ModelPackage _package) {
    this._package = _package;
    return this;
  }

   /**
   * A note describing a package hosted by various package managers.
   * @return _package
  **/
  @ApiModelProperty(example = "null", value = "A note describing a package hosted by various package managers.")
  public ModelPackage getPackage() {
    return _package;
  }

  public void setPackage(ModelPackage _package) {
    this._package = _package;
  }

  public Note deployable(Deployable deployable) {
    this.deployable = deployable;
    return this;
  }

   /**
   * A note describing something that can be deployed.
   * @return deployable
  **/
  @ApiModelProperty(example = "null", value = "A note describing something that can be deployed.")
  public Deployable getDeployable() {
    return deployable;
  }

  public void setDeployable(Deployable deployable) {
    this.deployable = deployable;
  }

  public Note discovery(Discovery discovery) {
    this.discovery = discovery;
    return this;
  }

   /**
   * A note describing a project/analysis type.
   * @return discovery
  **/
  @ApiModelProperty(example = "null", value = "A note describing a project/analysis type.")
  public Discovery getDiscovery() {
    return discovery;
  }

  public void setDiscovery(Discovery discovery) {
    this.discovery = discovery;
  }

  public Note relatedUrl(List<RelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
    return this;
  }

  public Note addRelatedUrlItem(RelatedUrl relatedUrlItem) {
    this.relatedUrl.add(relatedUrlItem);
    return this;
  }

   /**
   * Urls associated with this note
   * @return relatedUrl
  **/
  @ApiModelProperty(example = "null", value = "Urls associated with this note")
  public List<RelatedUrl> getRelatedUrl() {
    return relatedUrl;
  }

  public void setRelatedUrl(List<RelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
  }

  public Note expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Time of expiration for this Note, null if Note currently does not expire.
   * @return expirationTime
  **/
  @ApiModelProperty(example = "null", value = "Time of expiration for this Note, null if Note currently does not expire.")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public Note createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time this note was created. This field can be used as a filter in list requests. @OutputOnly
   * @return createTime
  **/
  @ApiModelProperty(example = "null", value = "The time this note was created. This field can be used as a filter in list requests. @OutputOnly")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public Note updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The time this note was last updated. This field can be used as a filter in list requests. @OutputOnly
   * @return updateTime
  **/
  @ApiModelProperty(example = "null", value = "The time this note was last updated. This field can be used as a filter in list requests. @OutputOnly")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public Note operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

   /**
   * The name of the operation that created this note.
   * @return operationName
  **/
  @ApiModelProperty(example = "null", value = "The name of the operation that created this note.")
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public Note relatedNoteNames(List<String> relatedNoteNames) {
    this.relatedNoteNames = relatedNoteNames;
    return this;
  }

  public Note addRelatedNoteNamesItem(String relatedNoteNamesItem) {
    this.relatedNoteNames.add(relatedNoteNamesItem);
    return this;
  }

   /**
   * Other notes related to this note.
   * @return relatedNoteNames
  **/
  @ApiModelProperty(example = "null", value = "Other notes related to this note.")
  public List<String> getRelatedNoteNames() {
    return relatedNoteNames;
  }

  public void setRelatedNoteNames(List<String> relatedNoteNames) {
    this.relatedNoteNames = relatedNoteNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.name, note.name) &&
        Objects.equals(this.shortDescription, note.shortDescription) &&
        Objects.equals(this.longDescription, note.longDescription) &&
        Objects.equals(this.kind, note.kind) &&
        Objects.equals(this.vulnerabilityType, note.vulnerabilityType) &&
        Objects.equals(this.buildType, note.buildType) &&
        Objects.equals(this.baseImage, note.baseImage) &&
        Objects.equals(this._package, note._package) &&
        Objects.equals(this.deployable, note.deployable) &&
        Objects.equals(this.discovery, note.discovery) &&
        Objects.equals(this.relatedUrl, note.relatedUrl) &&
        Objects.equals(this.expirationTime, note.expirationTime) &&
        Objects.equals(this.createTime, note.createTime) &&
        Objects.equals(this.updateTime, note.updateTime) &&
        Objects.equals(this.operationName, note.operationName) &&
        Objects.equals(this.relatedNoteNames, note.relatedNoteNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortDescription, longDescription, kind, vulnerabilityType, buildType, baseImage, _package, deployable, discovery, relatedUrl, expirationTime, createTime, updateTime, operationName, relatedNoteNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    vulnerabilityType: ").append(toIndentedString(vulnerabilityType)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    deployable: ").append(toIndentedString(deployable)).append("\n");
    sb.append("    discovery: ").append(toIndentedString(discovery)).append("\n");
    sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    relatedNoteNames: ").append(toIndentedString(relatedNoteNames)).append("\n");
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

