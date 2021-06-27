package com.sda.corneliacalin.onlinelibrary.service;

import com.sda.corneliacalin.onlinelibrary.model.LibraryAccount;
import com.sda.corneliacalin.onlinelibrary.repository.LibraryAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final LibraryAccountRepository libraryAccountRepository ;


// injected by Spring by contructor
    public UserService(LibraryAccountRepository libraryAccountRepository) {
        this.libraryAccountRepository = libraryAccountRepository;

    }

    public void addUser(LibraryAccount libraryAccount){
        libraryAccountRepository.save(libraryAccount);

    }

    public List<LibraryAccount> getUserLibraryAccounts(){
        return libraryAccountRepository.getAll();
    }
}
