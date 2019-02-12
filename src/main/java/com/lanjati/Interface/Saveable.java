package com.lanjati.Interface;

import java.util.List;

/**
 * @author Lanang Jati
 */
public interface Saveable {

    List<String> save();

    void read(List<String> data);
}
