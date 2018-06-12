package com.sm.hw.api;

import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ComponentScan("com.sm.hw")
public class WebController {

  /** Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);


  /**
   * Prints queue information in JSON.
   * @return the information
   */
  @CrossOrigin
  @RequestMapping(value = "/echo", method = RequestMethod.GET)
  public String echo() {

    return "Hello there, today's date is " + new Date();
  }

}
