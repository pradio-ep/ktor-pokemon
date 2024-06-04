package putra.pradio.models

import kotlinx.serialization.Serializable

@Serializable
data class CatchResponse(
    val message: String,
    val result: Boolean
)