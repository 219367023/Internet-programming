/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Jacob
 */
@Stateful
public class ListSB implements ListSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private List<Integer> numbers = new ArrayList<>();

    @Override
    public void add(Integer num) {
        numbers.add(num);
    }

    @Override
    public Integer getSize() {
        return numbers.size();
    }

    @Override
    public List<Integer> getList() { 
        return numbers;
    }
    
    
    
}
