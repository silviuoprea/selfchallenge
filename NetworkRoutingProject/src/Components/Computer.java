package Components;

import Interfaces.*;

import java.util.Map;

public class Computer extends Node implements Identifiable, Storage {
    private String address;
    private long storageCapacity;

    public Computer(String name, Map<Node, Integer> cost, String address, long storageCapacity) {
        super(name, cost);
        this.address = address;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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

    public void setStorageCapacity(long storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
