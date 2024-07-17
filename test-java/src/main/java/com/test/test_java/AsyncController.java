package com.test.test_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/process")
    public String process() {
        asyncService.processData();
        return "Proses sedang berjalan di latar belakang.";
    }
}
