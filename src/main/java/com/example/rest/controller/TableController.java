package com.example.rest.controller;


import com.example.rest.dao.TableDaoInterface;
import com.example.rest.model.Table;
import com.example.rest.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController implements TableDaoInterface {
    @Autowired
    private TableService tableService;
    @GetMapping("/table")
    @Override
    public Table getTable() {
        return tableService.getTable();
    }
}
