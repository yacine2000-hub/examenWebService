package com.groupeisi.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntry, Long> {
}
