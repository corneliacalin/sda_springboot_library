package com.sda.corneliacalin.onlinelibrary.repository;

import com.sda.corneliacalin.onlinelibrary.model.LibraryAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibraryAccountRepository {
    private List<LibraryAccount> libraryAccounts = new ArrayList<>();
    public List<LibraryAccount> getAll(){
        return libraryAccounts;
    }

    public void save (LibraryAccount libraryAccount){
        libraryAccounts.add(libraryAccount);
    }


}
