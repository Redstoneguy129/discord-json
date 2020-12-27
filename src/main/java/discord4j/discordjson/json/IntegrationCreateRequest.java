package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationCreateRequest.class)
@JsonDeserialize(as = ImmutableIntegrationCreateRequest.class)
public interface IntegrationCreateRequest {

    static ImmutableIntegrationCreateRequest.Builder builder() {
        return ImmutableIntegrationCreateRequest.builder();
    }

    String type();
    String id();
}
