package com.datastructureassiginmentsolution.driver;

import com.datastructureassiginmentsolution.classes.Building;
import com.datastructureassiginmentsolution.classes.BSTMSC;
import com.datastructureassiginmentsolution.classes.BSTMSC.Node;

public class Main {
    public static void main(String[] args) {
        //Building build = new Building();
        //build.buildingInput();
        //build.buildOrder();

        BSTMSC msc = new BSTMSC();
        Node tree = msc.makeDefaultTree();

        msc.rightRotation(tree);
        msc.inOrder(tree);

    }        
}
