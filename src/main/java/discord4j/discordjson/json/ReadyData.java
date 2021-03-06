package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableReadyData.class)
@JsonDeserialize(as = ImmutableReadyData.class)
public interface ReadyData {

    static ImmutableReadyData.Builder builder() {
        return ImmutableReadyData.builder();
    }

    int v();
    UserData user();
    List<UnavailableGuildData> guilds();
    @JsonProperty("session_id")
    String sessionId();
    Possible<List<Integer>> shard();
}
