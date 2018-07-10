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
  public void should_returnInputWithAEnding() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void should_returnSum() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\":\"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(15));
  }

  @Test
  public void should_returnFactor() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\":\"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(120));
  }

  @Test
  public void should_returnWelcomeMessage_when_twoStringInput() throws Exception {
    mockMvc.perform(get("/greeter")
            .param("name", "petike")
            .param("title", "student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there petike, my dear student!"));
  }

  @Test
  public void should_returnError_when_emptyInput() throws Exception {
    mockMvc.perform(get("/greeter")
            .param("input", ""))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }
}
