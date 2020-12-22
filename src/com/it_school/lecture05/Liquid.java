package com.it_school.lecture05;

public class Liquid {
    private final String color;
    private final double density;
    private final boolean gaz;

    public Liquid(String color,  double density,boolean gaz ){
        this.color = color;
        this.density = density;
        this.gaz = gaz;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null) {
            assert false;
            if (getClass() != o.getClass()) {
                return false;
            }
        }
        Liquid liquid = (Liquid) o;
        return density == liquid.density && color.equals(liquid.color);
    }

    }

