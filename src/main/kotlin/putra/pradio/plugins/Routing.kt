package putra.pradio.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import putra.pradio.routes.pokemonRoutes

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        pokemonRoutes()
    }
}
