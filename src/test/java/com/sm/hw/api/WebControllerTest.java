package com.sm.hw.api;

import org.junit.Assert;
import org.junit.Test;

public class WebControllerTest {

  @Test
  public void testEcho() {

    WebController controller = new WebController();
    String response = controller.echo();

    Assert.assertTrue("Unexpected response", response.contains("Hello there"));

  }
}
