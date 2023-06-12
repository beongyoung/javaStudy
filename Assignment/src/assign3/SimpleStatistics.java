package assign3;
/**
 * The SimpleStatistics class
 * This program is the SimpleStatistics class
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */

abstract class SimpleStatistics {
    public abstract double getMean(double[] variable);
    
    public abstract double getConditionalMean(String condition, double[] variable);
    
    public abstract double getMax(double[] variable);
    
    public abstract double getMin(double[] variable);
}