/*
* File: App.java
* Author: Szabó Brigitta
* Copyright: 2023, Szabó Brigitta
* Group: Szoft II/N
* Date: 2023-01-09
* Github: https://github.com/tailorbrigit/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Készítette: Szabó Brigitta Szoft II N 2023-01-09");
        getNames getNames = new getNames();
        ArrayList<String> nameList = getNames.getNames();
        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
