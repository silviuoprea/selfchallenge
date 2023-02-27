package Interfaces;

public interface Storage {
    long getStorageCapacity();
    default long getStorageCapacity(String size) {
        long storageCapacity = getStorageCapacity();
        long mega = storageCapacity * 1024, kilo = mega * 1024, bytes = kilo * 1024;
        if (size.equals("Mega")) {
            return mega;
        } else if (size.equals("Kilo"))
        {
            return kilo;
        }
        else if (size.equals("Byte"))
        {
            return bytes;
        }else return storageCapacity;
    }
}
