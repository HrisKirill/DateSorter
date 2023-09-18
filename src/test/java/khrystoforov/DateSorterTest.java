package khrystoforov;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateSorterTest {

    private final static DateSorter DATE_SORTER = new DateSorter();

    @Test
    void sortDatesTest() {
        List<LocalDate> actualLocalDates = List.of(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 5, 3),
                LocalDate.of(2008, 1, 6),
                LocalDate.of(2017, 9, 12),
                LocalDate.of(2013, 12, 26),
                LocalDate.of(2008, 6, 17)
        );

        List<LocalDate> expectedLocalDates = List.of(
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2008, 1, 6),
                LocalDate.of(2013, 12, 26),
                LocalDate.of(2017, 9, 12),
                LocalDate.of(2008, 6, 17),
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 5, 3)
        );

        assertEquals(expectedLocalDates, DATE_SORTER.sortDates(actualLocalDates));
    }

    @Test
    void sortDateTestWithEmptyOrNullList() {
        assertEquals(Collections.emptyList(), DATE_SORTER.sortDates(null));
        assertEquals(Collections.emptyList(), DATE_SORTER.sortDates(Collections.emptyList()));
    }
}