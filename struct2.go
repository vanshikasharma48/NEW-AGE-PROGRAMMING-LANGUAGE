package main

import "fmt"

// 1. Define a Student struct
type Student struct {
	Name  string
	Age   int
	Score float64
}

// 2. Add a Grade method
func (s Student) Grade() string {
	if s.Score >= 90 {
		return "A"
	} else if s.Score >= 80 {
		return "B"
	} else if s.Score >= 70 {
		return "C"
	} else if s.Score >= 60 {
		return "D"
	}
	return "F"
}

func main() {
	// 3. Define and range over a slice of students
	class := []Student{
		{"Asha", 21, 87.5},
		{"Ravi", 22, 55.0},
	}

	for _, s := range class {
		fmt.Println(s.Name, s.Grade())
	}
}
