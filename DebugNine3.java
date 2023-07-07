package com.example.objectsandclasses2;

public class DebugNine3 {
    public static void main(String[] args)
    {
        DebugDesk aDesk = new DebugDesk();
        DebugTable aTable = new DebugTable();
        aTable.printHeader();
        aTable.printTable();
        aTable.setTable();
        aDesk.printHeader();
        aDesk.setTable();
        aDesk.setDrawers();
        aDesk.printDesk();
    }
}
