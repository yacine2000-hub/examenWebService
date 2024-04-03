package com.groupeisi.controller;
import com.groupeisi.entities.HistoryEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
