package one.appscale.relayapi.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {
    @GetMapping("/test")
    public String test() {
        return "0.0.1-SNAPSHOT";
    }
}
