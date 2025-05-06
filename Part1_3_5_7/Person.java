package Part1_3_5_7;

// Part 1: Comparable<Part1_3_5_7.Person> implementation
public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.birthYear, other.birthYear);
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alex", 1990);
        Person p2 = new Person("Danylo", 2005);
        Person p3 = new Person("Vladyslav", 1990);

        System.out.println(p1.compareTo(p2)); // >0
        System.out.println(p2.compareTo(p1)); // <0
        System.out.println(p1.compareTo(p3)); // 0
    }
}

// Part 3: Part2.Selection Sort Trace
// Initial:    [13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15]
// Iteration 1: [**4**, 75, 12, **13**, 18, 6, 9, 10, 7, 14, 15]
// Iteration 2: [4, **6**, 12, 13, 18, **75**, 9, 10, 7, 14, 15]
// Iteration 3: [4, 6, **7**, 13, 18, 75, 9, 10, **12**, 14, 15]
// Iteration 4: [4, 6, 7, **9**, 18, 75, 13, 10, 12, 14, 15]
// Iteration 5: [4, 6, 7, 9, **10**, 75, 13, 18, 12, 14, 15]
// Iteration 6: [4, 6, 7, 9, 10, **12**, 13, 18, 75, 14, 15]
// Iteration 7: [4, 6, 7, 9, 10, 12, **13**, 18, 75, 14, 15]
// Iteration 8: [4, 6, 7, 9, 10, 12, 13, **14**, 75, 18, 15]
// Iteration 9: [4, 6, 7, 9, 10, 12, 13, 14, **15**, 18, 75]
// Iteration 10: [4, 6, 7, 9, 10, 12, 13, 14, 15, **18**, 75]

// Part 5: Part4.Insertion Sort Trace
// Initial:    [13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15]
// i=1: [13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15]
// i=2: [12, 13, 75, 4, 18, 6, 9, 10, 7, 14, 15]
// i=3: [4, 12, 13, 75, 18, 6, 9, 10, 7, 14, 15]
// i=4: [4, 12, 13, 18, 75, 6, 9, 10, 7, 14, 15]
// i=5: [4, 6, 12, 13, 18, 75, 9, 10, 7, 14, 15]
// i=6: [4, 6, 9, 12, 13, 18, 75, 10, 7, 14, 15]
// i=7: [4, 6, 9, 10, 12, 13, 18, 75, 7, 14, 15]
// i=8: [4, 6, 7, 9, 10, 12, 13, 18, 75, 14, 15]
// i=9: [4, 6, 7, 9, 10, 12, 13, 14, 18, 75, 15]
// i=10: [4, 6, 7, 9, 10, 12, 13, 14, 15, 18, 75]

// Part 7: Part6.Merge Sort Trace
// Mergesort: [9, 0, 8, 3, 7, 1, 4]
// 1:    [9, 0, 8] – sort left half
// 2:        [9, 0] – sort left half
// 3:            [9] – sort left half
// 3:            [0] – sort right half
// 3:            [0, 9] – merged and sorted
// 2:        [8] – sort right half
// 2:        [0, 8, 9] – merged and sorted
// 1:    [3, 7, 1, 4] – sort right half
// 2:        [3, 7] – sort left half
// 3:            [3] – sort left half
// 3:            [7] – sort right half
// 3:            [3, 7] – merged and sorted
// 2:        [1, 4] – sort right half
// 3:            [1] – sort left half
// 3:            [4] – sort right half
// 3:            [1, 4] – merged and sorted
// 2:        [1, 3, 4, 7] – merged and sorted
// 1:    [0, 1, 3, 4, 7, 8, 9] – merged and sorted

