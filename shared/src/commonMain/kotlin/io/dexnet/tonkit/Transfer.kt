package io.dexnet.tonkit

import kotlinx.serialization.Serializable

@Serializable
data class Transfer(
    val src: String,
    val dest: String,
    val amount: String,
)
