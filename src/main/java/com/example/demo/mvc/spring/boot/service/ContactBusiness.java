package com.example.demo.mvc.spring.boot.service;

import com.example.demo.mvc.spring.boot.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactBusiness {

    List<Contact> listContacts = new ArrayList<>();

    public void addContact(Contact contact) {
        listContacts.add(contact);
    }

    public List<Contact> getContactList() {
        return listContacts;
    }
}