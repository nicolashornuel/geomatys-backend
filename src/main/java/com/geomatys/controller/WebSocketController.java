/**
 * 
 */
package com.geomatys.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author macbookpro
 *
 */
@RestController
public class WebSocketController {

  
  @MessageMapping("/uploadFile")
  @SendTo("/topic/uploadFile")
  public String sendMessage(String message) {
	  System.out.println(message);
	  return message;
  }


}