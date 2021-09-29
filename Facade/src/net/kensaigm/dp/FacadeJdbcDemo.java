package net.kensaigm.dp;

import java.util.List;

public class FacadeJdbcDemo {
    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        int tableStatus = jdbcFacade.createTable();

        if (tableStatus != 0){
            System.out.println("Tabela criada.");
        } else {
            System.out.println("Falha em criar tabela.");
        }

        int tableInsert = jdbcFacade.insertIntoTable();

        if (tableInsert != 0){
            System.out.println("Registro inserido.");
        } else {
            System.out.println("Falha em inserir registro.");
        }

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses){
            System.out.println(address.getId() + "\t" + address.getStreetName()
            + "\t" + address.getCity() + "\t" + address.getState()
            + "\t" + address.getZip());
        }
    }
}
