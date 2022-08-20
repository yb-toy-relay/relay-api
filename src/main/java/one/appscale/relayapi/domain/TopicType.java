package one.appscale.relayapi.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TopicType {
    INSTALL_V1("callback-install-v1"),
    EVENT_V1("callback-event-v1"),
    REATTRIBUTION_V1("callback-reattribution-v1");

    private final String topic;
}
