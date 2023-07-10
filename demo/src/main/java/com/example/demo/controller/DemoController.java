package com.example.demo.controller;

import com.example.demo.requests.HelloRequest;
import com.example.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {
    @Autowired
    DemoService d;
    @GetMapping
    public ArrayList<String> hello()
    {
        return d.getName();
    }
    @PostMapping
    public ArrayList<String> createHello(@RequestBody HelloRequest helloRequest)
    {
        return d.createName(helloRequest.getName());
    }
    @PutMapping(path="/{idx}")
    public ArrayList<String> updateHello(@RequestBody HelloRequest helloRequest,@PathVariable(name = "idx") Integer idx)
    {
        return d.updateName(idx, helloRequest.getName());
    }
    @DeleteMapping(path="/{idx}")
    public ArrayList<String> deleteHello(@PathVariable(name = "idx") Integer idx)
    {
        return d.deleteName(idx);
    }

}
