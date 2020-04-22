package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedVideoData.class)
@JsonDeserialize(as = ImmutableEmbedVideoData.class)
public interface EmbedVideoData {

    static ImmutableEmbedVideoData.Builder builder() {
        return ImmutableEmbedVideoData.builder();
    }

    Possible<? extends String> url();

    Possible<? extends Integer> height();

    Possible<? extends Integer> width();
}
