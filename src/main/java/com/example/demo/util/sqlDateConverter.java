package com.example.demo.util;

//Lavet af Christoffer

public class sqlDateConverter {

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

}
