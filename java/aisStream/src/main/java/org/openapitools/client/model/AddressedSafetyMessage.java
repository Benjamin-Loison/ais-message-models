/*
 * Ais-Stream WebsocketObjects
 * OpenAPI 3.0 definitions for the data models used by aisstream.io.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AddressedSafetyMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-03T16:23:44.640253-07:00[America/Vancouver]")
public class AddressedSafetyMessage {
  public static final String SERIALIZED_NAME_MESSAGE_I_D = "MessageID";
  @SerializedName(SERIALIZED_NAME_MESSAGE_I_D)
  private Integer messageID;

  public static final String SERIALIZED_NAME_REPEAT_INDICATOR = "RepeatIndicator";
  @SerializedName(SERIALIZED_NAME_REPEAT_INDICATOR)
  private Integer repeatIndicator;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_SEQUENCEINTEGER = "Sequenceinteger";
  @SerializedName(SERIALIZED_NAME_SEQUENCEINTEGER)
  private Integer sequenceinteger;

  public static final String SERIALIZED_NAME_DESTINATION_I_D = "DestinationID";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D)
  private Integer destinationID;

  public static final String SERIALIZED_NAME_RETRANSMISSION = "Retransmission";
  @SerializedName(SERIALIZED_NAME_RETRANSMISSION)
  private Boolean retransmission;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  private Boolean spare;

  public static final String SERIALIZED_NAME_TEXT = "Text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public AddressedSafetyMessage() { 
  }

  public AddressedSafetyMessage messageID(Integer messageID) {
    
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMessageID() {
    return messageID;
  }


  public void setMessageID(Integer messageID) {
    this.messageID = messageID;
  }


  public AddressedSafetyMessage repeatIndicator(Integer repeatIndicator) {
    
    this.repeatIndicator = repeatIndicator;
    return this;
  }

   /**
   * Get repeatIndicator
   * @return repeatIndicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRepeatIndicator() {
    return repeatIndicator;
  }


  public void setRepeatIndicator(Integer repeatIndicator) {
    this.repeatIndicator = repeatIndicator;
  }


  public AddressedSafetyMessage userID(Integer userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUserID() {
    return userID;
  }


  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public AddressedSafetyMessage valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public AddressedSafetyMessage sequenceinteger(Integer sequenceinteger) {
    
    this.sequenceinteger = sequenceinteger;
    return this;
  }

   /**
   * Get sequenceinteger
   * @return sequenceinteger
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSequenceinteger() {
    return sequenceinteger;
  }


  public void setSequenceinteger(Integer sequenceinteger) {
    this.sequenceinteger = sequenceinteger;
  }


  public AddressedSafetyMessage destinationID(Integer destinationID) {
    
    this.destinationID = destinationID;
    return this;
  }

   /**
   * Get destinationID
   * @return destinationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDestinationID() {
    return destinationID;
  }


  public void setDestinationID(Integer destinationID) {
    this.destinationID = destinationID;
  }


  public AddressedSafetyMessage retransmission(Boolean retransmission) {
    
    this.retransmission = retransmission;
    return this;
  }

   /**
   * Get retransmission
   * @return retransmission
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRetransmission() {
    return retransmission;
  }


  public void setRetransmission(Boolean retransmission) {
    this.retransmission = retransmission;
  }


  public AddressedSafetyMessage spare(Boolean spare) {
    
    this.spare = spare;
    return this;
  }

   /**
   * Get spare
   * @return spare
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSpare() {
    return spare;
  }


  public void setSpare(Boolean spare) {
    this.spare = spare;
  }


  public AddressedSafetyMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressedSafetyMessage addressedSafetyMessage = (AddressedSafetyMessage) o;
    return Objects.equals(this.messageID, addressedSafetyMessage.messageID) &&
        Objects.equals(this.repeatIndicator, addressedSafetyMessage.repeatIndicator) &&
        Objects.equals(this.userID, addressedSafetyMessage.userID) &&
        Objects.equals(this.valid, addressedSafetyMessage.valid) &&
        Objects.equals(this.sequenceinteger, addressedSafetyMessage.sequenceinteger) &&
        Objects.equals(this.destinationID, addressedSafetyMessage.destinationID) &&
        Objects.equals(this.retransmission, addressedSafetyMessage.retransmission) &&
        Objects.equals(this.spare, addressedSafetyMessage.spare) &&
        Objects.equals(this.text, addressedSafetyMessage.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, sequenceinteger, destinationID, retransmission, spare, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressedSafetyMessage {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    sequenceinteger: ").append(toIndentedString(sequenceinteger)).append("\n");
    sb.append("    destinationID: ").append(toIndentedString(destinationID)).append("\n");
    sb.append("    retransmission: ").append(toIndentedString(retransmission)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("MessageID");
    openapiFields.add("RepeatIndicator");
    openapiFields.add("UserID");
    openapiFields.add("Valid");
    openapiFields.add("Sequenceinteger");
    openapiFields.add("DestinationID");
    openapiFields.add("Retransmission");
    openapiFields.add("Spare");
    openapiFields.add("Text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Sequenceinteger");
    openapiRequiredFields.add("DestinationID");
    openapiRequiredFields.add("Retransmission");
    openapiRequiredFields.add("Spare");
    openapiRequiredFields.add("Text");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressedSafetyMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressedSafetyMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressedSafetyMessage is not found in the empty JSON string", AddressedSafetyMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressedSafetyMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressedSafetyMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressedSafetyMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Text") != null && !jsonObj.get("Text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressedSafetyMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressedSafetyMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressedSafetyMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressedSafetyMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressedSafetyMessage>() {
           @Override
           public void write(JsonWriter out, AddressedSafetyMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressedSafetyMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressedSafetyMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressedSafetyMessage
  * @throws IOException if the JSON string is invalid with respect to AddressedSafetyMessage
  */
  public static AddressedSafetyMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressedSafetyMessage.class);
  }

 /**
  * Convert an instance of AddressedSafetyMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

