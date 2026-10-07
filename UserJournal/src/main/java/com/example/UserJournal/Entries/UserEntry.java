package com.example.UserJournal.Entries;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_entries")
public class UserEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    ) private long userId;
@NonNull
@Column(unique = true, nullable = false)
 private String username;
private String email;
private Boolean sentimentAnalysis;
@NonNull
private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    List<JournalEntry> userJournals = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    List<String> roles = new ArrayList<>();
}
