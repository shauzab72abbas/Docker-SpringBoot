package com.shauzab.FirstProgram.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller
{
@GetMapping("/home")
public ResponseEntity<String> home()
{
    String s="This is my first program at Duco";
    return ResponseEntity.of(Optional.of(s));
}

}
