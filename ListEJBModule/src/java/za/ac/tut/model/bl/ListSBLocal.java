/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jacob
 */
@Local
public interface ListSBLocal {
    public void add(Integer num);
    public Integer getSize();
    public List<Integer> getList();
}
