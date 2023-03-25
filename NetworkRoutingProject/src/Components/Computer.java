package Components;

import Interfaces.*;

import java.util.Map;

public class Computer extends Node implements Identifiable, Storage {
    private final String address;
    private final long storageCapacity;

    public Computer(String name, String address, long storageCapacity) {
        super(name);
        this.address = address;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public long getStorageCapacity(String size) {
        return Storage.super.getStorageCapacity(size);
    }

    public long getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
