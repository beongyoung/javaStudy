package assign3;
/**
 * The Q4 program
 * This program show the elapsed time between original code
 * and multi-thread concept code
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q4 {
	private static long startTime = System.currentTimeMillis();
	
    public static void main(String[] args) {
        final int numStudents = 8000000;
        
        String[] departments = {"cs", "gs", "as"};
        Student[] students = new Student[numStudents];
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            String gender = (random.nextBoolean()) ? "male" : "female";
            double heightMean = (gender.equals("male")) ? 173 : 162;
            double weightMean = (gender.equals("male")) ? 68 : 52;
            double gpaMin = 0.0;

            double gpa = gpaMin + (random.nextDouble() * 4.5);
            double height = heightMean + (random.nextGaussian() * 5);
            double weight = weightMean + (random.nextGaussian() * 5);
            String department = departments[random.nextInt(departments.length)];

            students[i] = new Student(department, gender, height, weight, gpa);
        }
        
        // Original Version
        double totalGpa = 0.0;
        for (int i = 0; i < numStudents; i++) {
            totalGpa += students[i].getGpa();
        }
        double avgGpa = totalGpa / numStudents;
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Divide the computation among multiple threads
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        long startMulTime = System.currentTimeMillis(); // Start time

        double[] partialSums = new double[numThreads];
        int batchSize = numStudents / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * batchSize;
            int endIndex = (i == numThreads - 1) ? numStudents : (i + 1) * batchSize;

            final int threadIndex = i;
            executorService.submit(() -> {
                double sum = 0.0;
                for (int j = startIndex; j < endIndex; j++) {
                    sum += students[j].getGpa();
                }
                partialSums[threadIndex] = sum;
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double totalMulGpa = 0.0;
        for (double partialSum : partialSums) {
            totalMulGpa += partialSum;
        }

        double avgMulGpa = totalMulGpa / numStudents;
        
        long endMulTime = System.currentTimeMillis(); // End time
        long elapsedMulTime = endMulTime - startMulTime;
        
        System.out.println("Original Version\n");
        System.out.println("Average GPA: " + avgGpa);
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
        System.out.println("-------------------------------");
        
        System.out.println("Multi Thread\n");
        System.out.println("Average GPA: " + avgMulGpa);
        System.out.println("Elapsed Time: " + elapsedMulTime + " milliseconds");
    }
}