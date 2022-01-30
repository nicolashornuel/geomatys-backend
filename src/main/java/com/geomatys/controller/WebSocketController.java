/**
 * 
 */
package com.geomatys.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.geomatys.model.Message;
import com.geomatys.model.OutputMessage;

/**
 * @author macbookpro
 *
 */
@Controller
public class WebSocketController {
	
  @MessageMapping("/image")
  @SendTo("/topic/image")
  public OutputMessage sendMessage(Message message) throws IOException {
      String time = new SimpleDateFormat("HH:mm").format(new Date());
      return new OutputMessage(message.getEvent(), message.getContent(), time);
  }
  
}