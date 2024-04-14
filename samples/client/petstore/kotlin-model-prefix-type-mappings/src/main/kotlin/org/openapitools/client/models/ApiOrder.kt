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
 * An order for a pets from the pet store
 *
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */


data class ApiOrder (

    @SerializedName("id")
    val id: kotlin.Long? = null,

    @SerializedName("petId")
    val petId: kotlin.Long? = null,

    @SerializedName("quantity")
    val quantity: kotlin.Int? = null,

    @SerializedName("shipDate")
    val shipDate: java.time.OffsetDateTime? = null,

    /* Order Status */
    @SerializedName("status")
    val status: ApiOrder.Status? = null,

    @SerializedName("complete")
    val complete: kotlin.Boolean? = false

) {

    /**
     * Order Status
     *
     * Values: PLACED,APPROVED,DELIVERED
     */
    enum class Status(val value: kotlin.String) {
        @SerializedName(value = "placed") PLACED("placed"),
        @SerializedName(value = "approved") APPROVED("approved"),
        @SerializedName(value = "delivered") DELIVERED("delivered");
    }
    companion object {
        var openapiFields: HashSet<String>? = null
        var openapiRequiredFields: HashSet<String>? = null
      
        init {
            // a set of all properties/fields (JSON key names)
            openapiFields = HashSet()
            openapiFields!!.add("id")
            openapiFields!!.add("petId")
            openapiFields!!.add("quantity")
            openapiFields!!.add("shipDate")
            openapiFields!!.add("status")
            openapiFields!!.add("complete")
      
            // a set of required properties/fields (JSON key names)
            openapiRequiredFields = HashSet()
        }
      
       /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiOrder
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            if (jsonElement == null) {
              require(openapiRequiredFields!!.isEmpty()) { // has required fields but JSON element is null
                String.format("The required field(s) %s in ApiOrder is not found in the empty JSON string", ApiOrder.openapiRequiredFields.toString())
              }
            }
      
            val entries = jsonElement!!.getAsJsonObject().entrySet()
            // check to see if the JSON string contains additional fields
            for ((key) in entries) {
              require(openapiFields!!.contains(key)) {
                String.format("The field `%s` in the JSON string is not defined in the `ApiOrder` properties. JSON: %s", key, jsonElement.toString())
              }
            }
            val jsonObj = jsonElement.getAsJsonObject()
            if (jsonObj["status"] != null && !jsonObj["status"].isJsonNull) {
              require(jsonObj.get("status").isJsonPrimitive()) {
                String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj["status"].toString())
              }
            }
            // validate the optional field `status`
            if (jsonObj["status"] != null && !jsonObj["status"].isJsonNull) {
                require(Status.values().any { it.name == jsonObj["status"].toString() }) {
                    String.format("Expected the field `status` to be valid `Status` enum value in the JSON string but got `%s`", jsonObj["status"].toString())
                }
            }
        }
    }

}

