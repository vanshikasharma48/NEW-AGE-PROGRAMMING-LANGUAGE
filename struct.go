package main

import "fmt"

type Student struct {
	Name  string
	Age   int
	Marks float64
}

func main() {
	s := Student{
		Name:  "Asha",
		Age:   21,
		Marks: 87.5,
	}

	fmt.Println(s.Name)

	s.Age = 22

	fmt.Println(s.Age)
}
