package ro.go.bogdanenache.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ro.go.bogdanenache.dto.MessageDTO;

import java.time.LocalDateTime;

@Slf4j
@Component
public class SrGenClient {

    @Value("${service.url}")
    String url;

    @Autowired
    private RestTemplate template;

    public MessageDTO doCall(MessageDTO dto) {
        log.info("Inside SrGen1Client");
        dto.getMessage().put(LocalDateTime.now().toString(), "SrGen1Controller");
        return template.postForObject(url, dto, MessageDTO.class);
    }
}
