package fr.doranco.devopsdemo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@RestController
public class TimeController {

    @GetMapping("/")
    public String welcome() {
        return "Bienvenue à la DevOpsDEMO";
    }

    //@GetMapping("/time")
    @RequestMapping(value = "/time", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String time() {
        LocalTime time = LocalTime.now();
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        //return JSONObject.time;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        //LOG.info("REST request health check");
        return new ResponseEntity<>("{\"status\" : \"UP\"}", HttpStatus.OK);
    }

}
