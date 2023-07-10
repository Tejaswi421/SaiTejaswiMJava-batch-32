package com.example.demo.requests;

public class HelloRequest
{
    String name;

    public HelloRequest() {
    }

    public HelloRequest(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
