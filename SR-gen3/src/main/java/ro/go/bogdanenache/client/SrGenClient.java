package ro.go.bogdanenache.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ro.go.bogdanenache.dto.MessageDTO;

import java.time.LocalDateTime;

@Slf4j
@Component
public class SrGenClient {

    @Value("${sr4.service}")
    String serviceName;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate template;

    public MessageDTO doCall(MessageDTO dto) {
        Application application = eurekaClient.getApplication(serviceName);
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort();
        System.out.println("URL" + url);

        log.info("Inside SrGen3Client");
        dto.getMessage().put(LocalDateTime.now().toString(), "SrGen3Controller");
        return template.postForObject(url, dto, MessageDTO.class);
    }
}
