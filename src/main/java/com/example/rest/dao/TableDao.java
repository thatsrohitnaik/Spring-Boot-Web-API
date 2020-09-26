package com.example.rest.dao;

import com.example.rest.model.Table;
import org.springframework.stereotype.Repository;

@Repository
public class TableDao implements TableDaoInterface{

    @Override
    public Table getTable() {
        Table table = new Table();
        table.setClub("Manchester United");
        table.setLost(1);
        table.setPlayed(2);
        table.setWon(1);
        table.setDraw(0);
        table.setPoints(3);
        return table;
    }
}
