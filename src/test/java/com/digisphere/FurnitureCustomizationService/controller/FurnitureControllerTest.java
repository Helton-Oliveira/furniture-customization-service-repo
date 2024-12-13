package com.digisphere.FurnitureCustomizationService.controller;

import com.digisphere.FurnitureCustomizationService.adapter.controller.FurnitureController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class FurnitureControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JacksonTester<Map<String, String>> data;

    @MockitoBean
    private FurnitureController controller;

    @Test
    @DisplayName("DEVE REALIZAR UMA REQUISICAO")
    void processRequest() throws Exception {
        Map<String, String> reqData = new HashMap<>();
        reqData.put("creatorsCpf", "93732782077");
        reqData.put("category", "table");
        reqData.put("materialId", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        reqData.put("frameMaterial", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        reqData.put("format", "rectangular");
        reqData.put("width", "100");
        reqData.put("length", "200");
        reqData.put("height", "150");
        reqData.put("numberOfFeet", "4");
        reqData.put("montage", "detachable");
        reqData.put("purpose", "outdoor");
        reqData.put("price", "299.90");
        reqData.put("quantity", "4");

        when(controller.processFurniture(reqData)).thenReturn(ResponseEntity.status(HttpStatus.OK).body("PEDIDO RELIZADO COM SUCESSO!"));

        var response = mvc
                .perform(
                    post("/furniture")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(data.write(reqData)
                                    .getJson())
                )
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }
}
