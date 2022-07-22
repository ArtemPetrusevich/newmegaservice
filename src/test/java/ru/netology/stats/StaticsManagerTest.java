package ru.netology.stats;


import org.junit.Assert;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticsManagerTest {

    @org.testng.annotations.Test

    public void sumSaleValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumStat(shopStatic);
        Assertions.assertEquals(expectedSum, actualSum);


    }


    @org.testng.annotations.Test

    public void meanSaleValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMean = 15;
        int actualMean = service.mean(shopStatic);
        Assertions.assertEquals(expectedMean, actualMean);


    }

    @org.testng.annotations.Test

    public void maxSaleValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 6;
        int actualMax = service.maxSale(shopStatic);
        Assertions.assertEquals(expectedMax, actualMax);


    }

    @org.testng.annotations.Test
    public void minSaleValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSale(shopStatic);
        Assertions.assertEquals(expectedMin, actualMin);


    }

    @org.testng.annotations.Test
    public void monthCountMinValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.monthCountMin(shopStatic);
        Assertions.assertEquals(expectedCount, actualCount);


    }

    @Test
    public void monthCountMaxValid() {
        StatisticsManager service = new StatisticsManager();
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 7;
        int actualCount = service.monthCountMax(shopStatic);
        Assertions.assertEquals(expectedCount, actualCount);


    }


}
