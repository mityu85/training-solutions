package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexerTest {

    Indexer indexer = new Indexer();

    @Test
    public void testIndexer() {
        assertEquals("{A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}", indexer.index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")).toString());
    }
}
