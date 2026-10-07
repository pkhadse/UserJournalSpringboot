package com.example.UserJournal.Repository;

import com.example.UserJournal.Entries.UserEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntryRepository extends JpaRepository {
    Optional<UserEntry> findByUsername(String username);
    void deleteAllByUsername(String username);
}
