package main

import "fmt"

func main() {
	// (1) Slice operations
	students := []string{"Alice", "Bob", "Charlie"}
	fmt.Println("Initial slice:", students)

	// Add
	students = append(students, "David")
	fmt.Println("After add:", students)

	// Remove by index (remove Bob at index 1)
	index := 1
	students = append(students[:index], students[index+1:]...)
	fmt.Println("After remove:", students)

	// Update
	students[1] = "Chris"
	fmt.Println("After update:", students)

	// (2) Map operations
	marks := map[string]int{
		"Math":    85,
		"Science": 90,
	}
	fmt.Println("\nInitial map:", marks)

	// Insert
	marks["English"] = 88
	fmt.Println("After insert:", marks)

	// Delete
	delete(marks, "Science")
	fmt.Println("After delete:", marks)

	// Lookup
	value, exists := marks["Math"]
	if exists {
		fmt.Println("Math marks:", value)
	} else {
		fmt.Println("Math not found")
	}
}
