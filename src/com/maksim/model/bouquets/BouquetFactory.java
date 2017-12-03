package com.maksim.model.bouquets;


import com.maksim.model.flowers.Flower;

import java.util.ArrayList;

public abstract class BouquetFactory {
    public abstract Flower createFlower();
}
