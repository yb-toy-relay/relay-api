package one.appscale.relayapi.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayschema.domain.reattribution.Reattribution;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ReattributionService {
    private final KafkaTemplate<Long, Reattribution> kafkaTemplate;

    public void sendKafka(final Reattribution reattribution) {
        kafkaTemplate.send(TopicType.REATTRIBUTION_V1.getTopic(), reattribution);
    }
}
