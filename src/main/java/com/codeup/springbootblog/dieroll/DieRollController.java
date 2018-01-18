package com.codeup.springbootblog.dieroll;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class DieRollController {

    private static Random random = new Random();

    @MessageMapping("/roll")
    @SendTo("/topic/rolls")
    public DieRoll roll(DieRollRequest dieRollRequest) throws Exception {
        Integer result = random.nextInt(dieRollRequest.getNumSides()) + 1;
        return new DieRoll(dieRollRequest.getName(), dieRollRequest.getNumSides(), result,
                dieRollRequest.getPrivateRoll());
    }

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public Message talk(Message message) {
        return message;
    }

}