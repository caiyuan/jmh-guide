package me.caiyuan.jmh.guide;

/**
 * @author Ryan
 */
public interface Calculator {

    /**
     * calculate sum of an integer array
     */
    long sum(int[] numbers);

    /**
     * shutdown pool or reclaim any related resources
     */
    void shutdown();
}
