package one.appscale.relayapi.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayschema.domain.event.Event;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventService {
    private final KafkaTemplate<Long, Event> kafkaTemplate;

    public void sendKafka(final Event event) {
        kafkaTemplate.send(TopicType.EVENT_V1.getTopic(), event);
    }
}
