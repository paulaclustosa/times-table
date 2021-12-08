package com.letscode.timestable;

import com.letscode.timestable.service.Calculations;
import com.letscode.timestable.utils.Reader;

public class Main {

    public static void main(String[] args) {
        Calculations.setTimesTable(Reader.getNumber());
    }

}
