package putra.pradio.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import putra.pradio.models.CatchResponse
import putra.pradio.models.ReleaseResponse
import putra.pradio.models.RenameResponse
import putra.pradio.utils.Utils.Companion.nextFibonacci
import putra.pradio.utils.Utils.Companion.isPrime
import kotlin.random.Random

fun Route.pokemonRoutes() {
    route("/pokemon") {
        get("/catch") {
            val randomBoolean = Random.nextBoolean()
            val catchResponse = CatchResponse(
                message = if(randomBoolean) "Success" else "Failed",
                result = randomBoolean
            )
            call.respond(catchResponse)
        }
        get("/release") {
            val randomInt = Random.nextInt(1, 99)
            val releaseResponse = ReleaseResponse(
                message = if(isPrime(randomInt)) "Success" else "Failed",
                result = randomInt
            )
            call.respond(releaseResponse)
        }
        get("/rename/{name?}/{attempt?}") {
            val name = call.parameters["name"]
            val attempt = call.parameters["attempt"]
            if (name == null || attempt == null) {
                call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
            } else {
                val rename = "$name-${nextFibonacci(attempt.toInt())}"
                val renameResponse = RenameResponse(
                    message = "Success",
                    result = rename
                )
                call.respond(renameResponse)
            }
        }
    }
}