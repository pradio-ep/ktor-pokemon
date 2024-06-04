package putra.pradio.models

import kotlinx.serialization.Serializable

@Serializable
data class RenameResponse(
    val message: String,
    val result: String
)