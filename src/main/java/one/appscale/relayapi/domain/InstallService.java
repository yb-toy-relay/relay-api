package one.appscale.relayapi.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayschema.domain.install.Install;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class InstallService {
    private final KafkaTemplate<Long, Install> kafkaTemplate;

    public void sendInstall(final Install install) {
        kafkaTemplate.send(TopicType.INSTALL_V1.getTopic(), install);
    }
}
