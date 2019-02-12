package com.lanjati.Interface;

import java.util.List;

/**
 * @author Lanang Jati
 */
public class Database {

    private List<String> data;

    public void saveData(Saveable objToSave) {
        this.data = objToSave.save();
    }

    public void loadData(Saveable objToSave) {
        objToSave.read(data);
    }
}
