package ro.go.bogdanenache.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.go.bogdanenache.dto.MessageDTO;
import ro.go.bogdanenache.service.SrGenService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class SrGenController {

    private final SrGenService service;

    public SrGenController(SrGenService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MessageDTO> srGen(){
        log.info("Inside Sr1Controller");

        MessageDTO dto = new MessageDTO();
        Map<String, String> msg = new HashMap<>();
        msg.put(LocalDateTime.now().toString(), "SrGen1Controller");
        dto.setMessage(msg);

        return new ResponseEntity(service.doWork(dto), HttpStatus.OK);
    }
}
