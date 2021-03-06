package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialChannelCreateRequest.class)
@JsonDeserialize(as = ImmutablePartialChannelCreateRequest.class)
public interface PartialChannelCreateRequest {

    static ImmutablePartialChannelCreateRequest.Builder builder() {
        return ImmutablePartialChannelCreateRequest.builder();
    }

    String name();
    int type();
}
