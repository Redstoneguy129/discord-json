package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReactionRemoveAll.class)
@JsonDeserialize(as = ImmutableMessageReactionRemoveAll.class)
public interface MessageReactionRemoveAll extends Dispatch {

    static ImmutableMessageReactionRemoveAll.Builder builder() {
        return ImmutableMessageReactionRemoveAll.builder();
    }

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("message_id")
    Id messageId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();
}
