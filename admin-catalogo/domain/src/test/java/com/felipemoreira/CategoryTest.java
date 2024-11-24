package com.felipemoreira;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    public void testNewCategory() {
        Assertions.assertNotNull(new Category());
    }
}