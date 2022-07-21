package com.lk.programming.language.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("/languages")
    public List<Language> getAll() {
        return languageRepository.findAll();
    }

    @PostMapping("/languages")
    private Language createLanguage(@RequestBody Language language) {
        return languageRepository.save(language);
    }

}
