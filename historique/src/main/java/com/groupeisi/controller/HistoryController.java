package com.groupeisi.controller;
import com.groupeisi.entities.HistoryEntry;
import com.groupeisi.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services/historique")
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @GetMapping("/all")
    public List<HistoryEntry> getAllHistoryEntries() {
        return historyService.getAllHistoryEntries();
    }
}
