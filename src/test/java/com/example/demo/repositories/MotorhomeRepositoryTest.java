package com.example.demo.repositories;

import com.example.demo.models.Motorhomes;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MotorhomeRepositoryTest {

    MotorhomeRepository motorhomeRepository = new MotorhomeRepository();

    @Test
    void read() {
        Motorhomes motorhome = motorhomeRepository.read(1);
        Assert.assertEquals(1, motorhome.getMotorhomeId());
        Assert.assertEquals(800, motorhome.getPricePerDay());
        Assert.assertEquals(6, motorhome.getMaxSeats());
        Assert.assertEquals("Adria Sonic", motorhome.getModelName());
    }
}