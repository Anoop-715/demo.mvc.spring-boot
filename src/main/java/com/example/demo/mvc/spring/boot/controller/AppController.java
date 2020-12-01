package com.example.demo.mvc.spring.boot.controller;

import com.example.demo.mvc.spring.boot.model.Contact;
import com.example.demo.mvc.spring.boot.service.ContactBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ContactBusiness contactBusiness;

    @RequestMapping(value = "/student/new",method=RequestMethod.GET)
    public ModelAndView welcome() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/list_contact",method= RequestMethod.GET)
    public ModelAndView listContact(Model model) {
        List<Contact> contacts  = contactBusiness.getContactList();
        model.addAttribute("contacts",contacts);
        return new ModelAndView("contact") ;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView newContact(){
        return  new ModelAndView("new");
    }

    @RequestMapping(value = "/contact/create",method = RequestMethod.POST)
    public  ModelAndView createContact(Model model,@ModelAttribute Contact contact){
        contactBusiness.addContact(contact);
        return new ModelAndView("redirect:/list_contact") ;
    }
}