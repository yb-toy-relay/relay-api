package one.appscale.relayapi.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TopicType {
    INSTALL_V1("install-v1"),
    EVENT_V1("event-v1"),
    REATTRIBUTION_V1("reattribution-v1");

    private final String topic;
}
