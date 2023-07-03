package com.shuchenysh.exchangerates.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

data class Info (
    @SerializedName("status")
    @Expose
    val status: String? = null,
    @SerializedName("message")
    @Expose
    val message: String? = null,
    @SerializedName("data")
    @Expose
    val data: List<String>? = null
)