package one.appscale.relayapi.api.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayapi.api.v1.dto.CreateEventRequest;
import one.appscale.relayapi.domain.EventService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@Slf4j
@RestController
@RequestMapping("/relay/v1/event")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/callback")
    public void event(@Valid final CreateEventRequest request) {
        eventService.sendKafka(request.toEvent());
    }
}
