package com.rdas.model

/**
 * non-nullable types (String) and
 * nullable types (String?).
 */
data class User(
        val login: String,
        val firstname: String,
        val lastname: String,
        val description: String? = null)