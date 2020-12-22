package com.it_school.lecture05;

public class Bottle {
    private final double capacity;
    private Liquid liquid;

    Bottle(double capacity, Liquid liquid) {
        this.capacity = capacity;
        this.liquid = liquid;

    }

    public void setLiquid(String color, double density, boolean gaz) {
        new Liquid(color, density, gaz);

    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            assert false;
            if (getClass() != o.getClass()) {
                return false;
            }
        }
        Bottle bottle = (Bottle) o;
        return capacity == bottle.capacity && liquid.equals(bottle.liquid);
    }
}
