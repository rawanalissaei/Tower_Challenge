package com.challenge.Tower_Challenge.service;

import com.challenge.Tower_Challenge.model.CellTower;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

@Service
public class CellTowerService {
    private static final String API_URL = "https://byanat.wiremockapi.cloud/api/v3/towers";

    public List<CellTower> fetchCellTowers() {
        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = restTemplate.getForObject(API_URL, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<CellTower> cellTowers = objectMapper.readValue(jsonResponse, new TypeReference<List<CellTower>>() {});
            return cellTowers;
        } catch (Exception e) {
            throw new RuntimeException("Error parsing cell tower data", e);
        }
    }
}
