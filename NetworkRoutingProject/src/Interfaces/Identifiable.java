package Interfaces;

import Components.*;

public interface Identifiable {
        String getAddress();
        default String getAddress()
        {
                String address = getAddress();
                return address;
        }
}
