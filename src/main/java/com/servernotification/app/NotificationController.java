package com.servernotification.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {

    @PostMapping("/notification")
    public String notification(@RequestParam String service, @RequestParam String message) {

        System.out.println("Query " + service +  ":" + message);
        return message;
    }
}
