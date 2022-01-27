/**
 * 
 */
package com.geomatys.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geomatys.model.Message;

/**
 * @author macbookpro
 *
 */
@RestController
public class WebSocketController {

  
  @MessageMapping("/uploadFile")
  @SendTo("/topic/uploadFile")
  public String sendMessage(@RequestParam Message message) {
	  System.out.println(message.toString());
      return message.getContent();
  }

}