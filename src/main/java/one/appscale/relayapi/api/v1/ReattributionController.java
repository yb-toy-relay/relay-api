package one.appscale.relayapi.api.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayapi.api.v1.dto.CreateReattributionRequest;
import one.appscale.relayapi.domain.ReattributionService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@Slf4j
@RestController
@RequestMapping("/relay/v1/reattribution")
@RequiredArgsConstructor
public class ReattributionController {
    private final ReattributionService reattributionService;

    @GetMapping("/callback")
    public void reattribution(@Valid final CreateReattributionRequest request) {
        reattributionService.sendKafka(request.toReattribution());
    }
}
