/**
 * Data objects for JSON representation across Discord.
 */
@Value.Style(
        depluralize = true,
        jdkOnly = true,
        allParameters = true,
        defaultAsDefault = true
)
@NonNullApi
@MetaPossibleEncodingEnabled
package discord4j.discordjson.json;

import discord4j.discordjson.possible.MetaPossibleEncodingEnabled;
import org.immutables.value.Value;
import reactor.util.annotation.NonNullApi;
