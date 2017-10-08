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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The period during which some deployable was active in a runtime.
 */
@ApiModel(description = "The period during which some deployable was active in a runtime.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:44:14.136-04:00")
public class Deployment   {
  @SerializedName("userEmail")
  private String userEmail = null;

  @SerializedName("deployTime")
  private String deployTime = null;

  @SerializedName("undeployTime")
  private String undeployTime = null;

  @SerializedName("config")
  private Map<String, String> config = new HashMap<String, String>();

  @SerializedName("address")
  private String address = null;

  public Deployment userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Identity of the user that triggered this deployment.
   * @return userEmail
  **/
  @ApiModelProperty(example = "null", value = "Identity of the user that triggered this deployment.")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public Deployment deployTime(String deployTime) {
    this.deployTime = deployTime;
    return this;
  }

   /**
   * Beginning of the lifetime of this deployment.
   * @return deployTime
  **/
  @ApiModelProperty(example = "null", value = "Beginning of the lifetime of this deployment.")
  public String getDeployTime() {
    return deployTime;
  }

  public void setDeployTime(String deployTime) {
    this.deployTime = deployTime;
  }

  public Deployment undeployTime(String undeployTime) {
    this.undeployTime = undeployTime;
    return this;
  }

   /**
   * End of the lifetime of this deployment.
   * @return undeployTime
  **/
  @ApiModelProperty(example = "null", value = "End of the lifetime of this deployment.")
  public String getUndeployTime() {
    return undeployTime;
  }

  public void setUndeployTime(String undeployTime) {
    this.undeployTime = undeployTime;
  }

  public Deployment config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public Deployment putConfigItem(String key, String configItem) {
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Configuration used to create this deployment.
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "Configuration used to create this deployment.")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public Deployment address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of the runtime element hosting this deployment.
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "Address of the runtime element hosting this deployment.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.userEmail, deployment.userEmail) &&
        Objects.equals(this.deployTime, deployment.deployTime) &&
        Objects.equals(this.undeployTime, deployment.undeployTime) &&
        Objects.equals(this.config, deployment.config) &&
        Objects.equals(this.address, deployment.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, deployTime, undeployTime, config, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    deployTime: ").append(toIndentedString(deployTime)).append("\n");
    sb.append("    undeployTime: ").append(toIndentedString(undeployTime)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

