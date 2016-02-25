package ch.epfl.xblast;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yaron Dibner (257145)
 * @author Julien Malka (259041)
*/
public final class Lists {
    
    /**
     * Private constructor of the non-instantiable Lists class.
     */
    private Lists(){
        
    }
    
    /**
     * Returns a symmetric version of a given list (without doubling
     * the last element).
     * 
     * @param List
     *          list to be mirrored
     * @return List
     *          symmetric version of l
     * @throws IllegalArgumentException
     */
    public static <T> List<T> mirrored(List<T> l) throws IllegalArgumentException{
        if(l == null || l.isEmpty()){
            throw new IllegalArgumentException();
        }
        List<T> list = new ArrayList<T>(l);
        List<T> tmpList = list.subList(0, list.size() - 1);
        Collections.reverse(tmpList);
        System.out.println(tmpList);
        System.out.println(l);
        l.addAll(tmpList);
        return l;
    }
}
