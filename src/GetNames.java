/*
* File: GetNames.java
* Author: Szabó Brigitta
* Copyright: 2023, Szabó Brigitta
* Group: Szoft II/N
* Date: 2023-01-09
* Github: https://github.com/tailorbrigit/
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class getNames implements Name{

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Bela", "Geza"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        return nameList;
    }
    
}
