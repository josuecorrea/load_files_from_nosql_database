package com.load.files.client.controller;

import com.load.files.client.service.ILoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/loadfiles")
//@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LoadController {

    @Autowired
    private ILoadService _loadService;

    @PostMapping("load")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void load(@RequestBody String filesPath) throws IOException {
            _loadService.loadExecute(filesPath);
    }
}
