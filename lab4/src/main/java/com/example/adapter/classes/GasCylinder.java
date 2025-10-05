package com.example.adapter.classes;

public class GasCylinder {
    
    protected double Volume;
    protected double Mass;
    protected double Molar;

    public GasCylinder(double volume, double mass, double molar) {
        this.Volume = volume;
        this.Mass = mass;
        this.Molar = molar;
    }

    public double GetPressure(int T) {
        final double R = 8.314;
        return (AmountOfMatter() * R * (T + 273.15)) / Volume;
    }

    public double AmountOfMatter() {
        return Mass / Molar;
    }

    @Override
    public String toString() {
        return String.format("Баллон: Объем=%.2f м3, Масса=%.2f кг, Молярная масса=%.2f кг/моль", 
                            Volume, Mass, Molar);
    }
}
