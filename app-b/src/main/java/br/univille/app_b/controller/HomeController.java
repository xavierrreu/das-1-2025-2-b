package br.univille.app_b.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dapr.Topic;
import io.dapr.client.domain.CloudEvent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class HomeController {
    
    @PostMapping("/startBSync")
    public ResponseEntity startBSync(@RequestBody String mensagem) {
        //TODO: process POST request
        System.out.println("App B start");
        System.out.println("Mensagem " + mensagem);
        return ResponseEntity.ok().build();
    }

    @Topic(pubsubName = "pubsub-dapr", name = "topicodapr")
    @PostMapping(path="/sub", consumes = org.springframework.http.MediaType.ALL_VALUE)
    public ResponseEntity startBASync(@RequestBody(required = false) CloudEvent<String> cloudEvent) {
        System.out.println("App B started");
        var idMessage = cloudEvent.getId();
        var message = cloudEvent.getData();
        System.out.println("Message " + idMessage +  " received: " + message);
        return ResponseEntity.ok().body("App B started");
    }
    
}
