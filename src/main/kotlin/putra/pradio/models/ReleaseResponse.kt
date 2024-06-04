package putra.pradio.models

import kotlinx.serialization.Serializable

@Serializable
data class ReleaseResponse(
    val message: String,
    val result: Int
)