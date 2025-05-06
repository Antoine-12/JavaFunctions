
package com.mycompany.fisica;

import java.util.Map;

/**
 *
 * @author aanto
 */
public class UnitCategory {
    
    private String name;
    private Map<String, Double> conversionFactors; 

    public UnitCategory(String name, Map<String, Double> conversionFactors) {
        this.name = name;
        this.conversionFactors = conversionFactors;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getConversionFactors() {
        return conversionFactors;
    }

    public double convert(double value, String from, String to) {
        double baseValue = value * conversionFactors.get(from);
        return baseValue / conversionFactors.get(to);
    }
    
    
    
}
