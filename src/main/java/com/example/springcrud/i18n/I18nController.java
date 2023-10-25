package com.example.springcrud.i18n;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@AllArgsConstructor
public class I18nController {
    private MessageSource messageSource;


    @GetMapping("/messages")
    public I18nResponseDto getMessage(@RequestParam String user,
                                     Locale locale) {
        String name = messageSource.getMessage("name", null, "",
                locale);
        String welcome = messageSource.getMessage("welcomeX",
                new String[] {user}, "",
                locale);
        var responseDto = new I18nResponseDto();
        responseDto.setName(name);
        responseDto.setWelcome(welcome);
        return responseDto;

    }
}
