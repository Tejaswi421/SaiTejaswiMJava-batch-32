package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DemoService
{
    private static final ArrayList<String> name = new ArrayList<>();
    public ArrayList<String> getName()
    {
        return name;
    }
    public ArrayList<String> createName(String n)
    {
        name.add(n);
        return name;
    }
    public ArrayList<String> updateName(Integer index, String name1)
    {
        name.set(index,name1);
        return name;
    }
    public ArrayList<String> deleteName(Integer index)
    {
        name.remove(index);
        return name;
    }

}
