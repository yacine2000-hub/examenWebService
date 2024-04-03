package com.groupeisi.repository;
import com.groupeisi.entities.HistoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntry, Long> {
}
