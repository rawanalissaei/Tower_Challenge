package com.challenge.Tower_Challenge.controller;

import com.challenge.Tower_Challenge.model.CellTower;
import com.challenge.Tower_Challenge.service.CellTowerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CellTowerController {
    private final CellTowerService cellTowerService;

    public CellTowerController(CellTowerService cellTowerService) {
        this.cellTowerService = cellTowerService;
    }

    /**
     * Get filtered cell tower data.
     *
     * Retrieve cell tower data filtered by tower id, network operator, technology, and tower type.
     *
     * @param towerId        Filter by tower id (optional)
     * @param networkOperator Filter by network operator (optional)
     * @param technology     Filter by technology (optional)
     * @param towerType      Filter by tower type (optional)
     * @return A list of cell towers that match the filter criteria
     */

    @GetMapping("/challenge/towers")
    public List<CellTower> getCellTowers(
            @RequestParam(value = "towerid", required = false) Integer towerId,
            @RequestParam(value = "networkoperator", required = false) String networkOperator,
            @RequestParam(value = "technology", required = false) String technology,
            @RequestParam(value = "towertype", required = false) String towerType) {

        List<CellTower> cellTowers = cellTowerService.fetchCellTowers();

        if (towerId != null) {
            cellTowers = cellTowers.stream()
                    .filter(cellTower -> cellTower.getTower_id() == towerId)
                    .collect(Collectors.toList());
        }

        if (networkOperator != null) {
            cellTowers = cellTowers.stream()
                    .filter(cellTower -> cellTower.getOperator().equalsIgnoreCase(networkOperator))
                    .collect(Collectors.toList());
        }

        if (technology != null) {
            cellTowers = cellTowers.stream()
                    .filter(cellTower -> cellTower.getTechnology().equalsIgnoreCase(technology))
                    .collect(Collectors.toList());
        }

        if (towerType != null) {
            cellTowers = cellTowers.stream()
                    .filter(cellTower -> cellTower.getTower_type().equalsIgnoreCase(towerType))
                    .collect(Collectors.toList());
        }

        return cellTowers;
    }
}
