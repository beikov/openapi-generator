/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import java.io.IOException


/**
 * A category for a pet
 *
 * @param id 
 * @param name 
 */


data class ApiCategory (

    @SerializedName("id")
    val id: kotlin.Long? = null,

    @SerializedName("name")
    val name: kotlin.String? = null

) {

    companion object {
        var openapiFields: HashSet<String>? = null
        var openapiRequiredFields: HashSet<String>? = null
      
        init {
            // a set of all properties/fields (JSON key names)
            openapiFields = HashSet()
            openapiFields!!.add("id")
            openapiFields!!.add("name")
      
            // a set of required properties/fields (JSON key names)
            openapiRequiredFields = HashSet()
        }
      
       /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiCategory
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            if (jsonElement == null) {
              require(openapiRequiredFields!!.isEmpty()) { // has required fields but JSON element is null
                String.format("The required field(s) %s in ApiCategory is not found in the empty JSON string", ApiCategory.openapiRequiredFields.toString())
              }
            }
      
            val entries = jsonElement!!.getAsJsonObject().entrySet()
            // check to see if the JSON string contains additional fields
            for ((key) in entries) {
              require(openapiFields!!.contains(key)) {
                String.format("The field `%s` in the JSON string is not defined in the `ApiCategory` properties. JSON: %s", key, jsonElement.toString())
              }
            }
            val jsonObj = jsonElement.getAsJsonObject()
            if (jsonObj["name"] != null && !jsonObj["name"].isJsonNull) {
              require(jsonObj.get("name").isJsonPrimitive()) {
                String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj["name"].toString())
              }
            }
        }
    }

}

