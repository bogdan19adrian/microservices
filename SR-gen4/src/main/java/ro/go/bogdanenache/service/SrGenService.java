package ro.go.bogdanenache.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.go.bogdanenache.dto.MessageDTO;

import java.time.LocalDateTime;

@Slf4j
@Service
public class SrGenService {


    public MessageDTO doWork(MessageDTO dto) {
        log.info("Inside SrGen4Service ");

        dto.getMessage().put(LocalDateTime.now().toString(), "SrGen4Client");
        return dto;
    }
}
