package com.groupeisi.services;

import com.groupeisi.entities.HistoryEntry;
import com.groupeisi.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public void saveHistoryEntry(String dateString, String dayOfWeek) {
        HistoryEntry historyEntry = new HistoryEntry();
        historyEntry.setDate(LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        historyEntry.setDayOfWeek(dayOfWeek);
        historyRepository.save(historyEntry);
    }

    public List<HistoryEntry> getAllHistoryEntries() {
        return historyRepository.findAll();
    }
}
