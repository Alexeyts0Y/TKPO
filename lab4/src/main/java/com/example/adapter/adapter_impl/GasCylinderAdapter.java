package com.example.adapter.adapter_impl;

import com.example.adapter.classes.GasCylinder;
import com.example.adapter.interfaces.IGasCylinder;

public class GasCylinderAdapter extends GasCylinder implements IGasCylinder {

    public GasCylinderAdapter(double volume, double mass, double molar) {
        super(volume, mass, molar);
    }

    @Override
    public void ModifVolume(double dV) {
        this.Volume += dV;
    }

    @Override
    public double GetDp(int T0, int T1) {
        return GetPressure(T1) - GetPressure(T0);
    }

    @Override
    public String Passport() {
        return toString();
    }
    
}
