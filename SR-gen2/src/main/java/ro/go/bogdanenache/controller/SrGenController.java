package ro.go.bogdanenache.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.go.bogdanenache.dto.MessageDTO;
import ro.go.bogdanenache.service.SrGenService;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class SrGenController {

    @Autowired
    private SrGenService service;

    @PostMapping
    public ResponseEntity<MessageDTO> srGen(@RequestBody MessageDTO msg){
        log.info("Inside Sr2Controller");

        msg.getMessage().put(LocalDateTime.now().toString(), "SrGen2Controller");

        return new ResponseEntity(service.doWork(msg), HttpStatus.OK);
    }
}
