package com.example.rest.service;

import com.example.rest.dao.TableDao;
import com.example.rest.model.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService implements TableServiceInterface {

    @Autowired
    TableDao tableDao;

    @Override
    public Table getTable() {
        return tableDao.getTable();
    }
}
