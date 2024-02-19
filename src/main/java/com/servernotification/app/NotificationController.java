package com.servernotification.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {

    @PostMapping("/notification")
    public String notification(@RequestBody String service, @RequestBody String message) {

        System.out.println("Query" + service);
        return message;
    }
}
