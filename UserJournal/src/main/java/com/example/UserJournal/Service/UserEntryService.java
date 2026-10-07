package com.example.UserJournal.Service;

import com.example.UserJournal.Entries.UserEntry;
import com.example.UserJournal.Repository.UserEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Arrays;

public class UserEntryService {

@Autowired
private UserEntryRepository userrepo;
    private  PasswordEncoder passwordencoder = new BCryptPasswordEncoder();



    public void SaveUserEntries(UserEntry user_entry){
        user_entry.setPassword(passwordencoder.encode(user_entry.getPassword()));
        user_entry.setRoles(Arrays.asList("USER"));
        userrepo.save(user_entry);
    }




}
