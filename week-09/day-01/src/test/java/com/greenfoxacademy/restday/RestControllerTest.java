package com.greenfoxacademy.restday;
import com.greenfoxacademy.restday.controllers.RestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doubleTest() throws Exception {
    mockMvc.perform(get("/doubling")
            .param("input", "5"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(10));
  }

  @Test
  public void doubleErrorTest() throws Exception {
    mockMvc.perform(get("/doubling")
            .param("input", ""))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }

  @Test
  public void appendaTest() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }
}
