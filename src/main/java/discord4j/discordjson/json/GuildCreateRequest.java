package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import reactor.util.annotation.Nullable;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildCreateRequest.class)
public interface GuildCreateRequest {

    static ImmutableGuildCreateRequest.Builder builder() {
        return ImmutableGuildCreateRequest.builder();
    }

    String name();
    String region();
    @Nullable
    String icon();
    @JsonProperty("verification_level")
    int verificationLevel();
    @JsonProperty("default_message_notifications")
    int defaultMessageNotifications();
    @JsonProperty("explicit_content_filter")
    int explicitContentFilter();
    List<RoleCreateRequest> roles();
    List<PartialChannelCreateRequest> channels();
}
