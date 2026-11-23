package com.elifirem.controller.impl;

import com.elifirem.controller.IClassController;
import com.elifirem.entity.Class;
import com.elifirem.services.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/class")
public class RestClassController implements IClassController {

    @Autowired
    private IClassService classService;

    @PostMapping("/save")
    @Override
    public Class saveClass(@RequestBody Class clazz) {
        return classService.saveClass(clazz);
    }
}
