package my.generic;

import java.util.ArrayList;

public class Covariance {
    //------------------------------------------------------------------------------
    //КО-Варианты (Object->Number)
    Object[] objectsMas = new Number[10];

    //ИН-Варианты ArrayList<Object> != ArrayList<Number>
    //ArrayList<Object> objectsList = new ArrayList<Number>();
//--------------------------------------------------------------------------
    //КО-Варианты
    ArrayList<? extends Object> objectsListExt = new ArrayList<Number>();

    //КОНТР-Варианты
    ArrayList<? super Integer> objectsListSup = new ArrayList<Number>();
//----------------------------------------------------------------------------
}
