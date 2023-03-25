package Components;

import Interfaces.Identifiable;


public class Router extends Node implements Identifiable {
    private String address;

    public Router(String name) {
        super(name);
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Router{" + "address='" + address + '\'' + "} " + super.toString();
    }
}
