package ru.schurbanov;

import java.util.ArrayList;

/**
 * Created by schurbanov on 9/20/2016.
 */
public class ArrayOfDoInterfaces {
    public ArrayList<Do123Interface> DoIArray = null;
    int IArrayPtr = -1;

    ArrayOfDoInterfaces(){
        DoIArray = new ArrayList<Do123Interface>();
    }

    public void SaveDoInterface(Do123Interface IFace) {
        DoIArray.add(IFace);
    }

    public void PointToInterface(int IPtr) {
        IArrayPtr = IPtr;
    }

    public void DeleteInterface(int IPtr) {
        DoIArray.remove(IPtr);
    }

    public void InvokeAll() {
        if (!DoIArray.isEmpty()) {

            for(Do123Interface item : DoIArray){
                item.DoOne();
                item.DoTwo();
                item.DoThree();
            }
            //DoIArray.forEach(DI -> (DI).DoOne());
            //DoIArray.forEach(DI -> (DI).DoTwo());
            //DoIArray.forEach(DI -> (DI).DoThree());
        }
    }

}
