package io.pluginkraft

import com.google.inject.Inject
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GamePreInitializationEvent
import org.spongepowered.api.plugin.Plugin
import java.util.logging.Logger

@Plugin(
    id = "kotlin-rekrafted",
    name = "Kotlin Rekrafted",
    authors = ["Chk"],
    version = "1.00",
    description = "Supplies kotlin runtime, reflections, and sponge-api extensions.")
class KotlinRekrafted @Inject constructor(
    private val logger: Logger
)
{

    @Listener fun onPreInit(event: GamePreInitializationEvent)
    {
        logger.info(String.format("Enabled Kotlin Rekrafted using version %s;", "1.0.0"))
    }

}