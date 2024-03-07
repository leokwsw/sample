package dev.leonardpark.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis/v1/")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String getMessage() {
        return testService.getMessage();
    }

}