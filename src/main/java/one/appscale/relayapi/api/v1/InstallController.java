package one.appscale.relayapi.api.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.appscale.relayapi.api.v1.dto.CreateInstallRequest;
import one.appscale.relayapi.domain.InstallService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@Slf4j
@RestController
@RequestMapping("/relay/v1/install")
@RequiredArgsConstructor
public class InstallController {
    private final InstallService installService;

    @GetMapping("/callback")
    public void install(@Valid final CreateInstallRequest request) {
        installService.sendKafka(request.toInstall());
    }
}
