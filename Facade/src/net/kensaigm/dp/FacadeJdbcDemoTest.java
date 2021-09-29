package net.kensaigm.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacadeJdbcDemoTest {
    @Test
    public void test(){

        JdbcFacade jdbcFacade = new JdbcFacade();

        int tableStatus = jdbcFacade.createTable();

        if (tableStatus != 0){
            System.out.println("Tabela criada.");
        } else {
            System.out.println("Falha em criar tabela");
        }

    }



}