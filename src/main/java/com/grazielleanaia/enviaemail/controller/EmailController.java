package com.grazielleanaia.enviaemail.controller;


import com.grazielleanaia.enviaemail.business.EmailService;
import com.grazielleanaia.enviaemail.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")

public class EmailController {
    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail(@RequestBody TarefasDTO dto) {
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
