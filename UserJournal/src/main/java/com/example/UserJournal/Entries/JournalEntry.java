package com.example.UserJournal.Entries;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Table(name = "journal_entries")
@Data
@NoArgsConstructor

public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@NonNull
    private String title;
    private String content;
    private LocalDateTime entrytime;
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private String user;

}
