package ro.go.bogdanenache.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.go.bogdanenache.client.SrGenClient;
import ro.go.bogdanenache.dto.MessageDTO;

import java.time.LocalDateTime;

@Slf4j
@Service
public class SrGenService {

    @Autowired
    private SrGenClient client;

    public MessageDTO doWork(MessageDTO dto) {
        log.info("Inside SrGen3Service ");

        dto.getMessage().put(LocalDateTime.now().toString(), "SrGen3Client");
        return client.doCall(dto);
    }
}
