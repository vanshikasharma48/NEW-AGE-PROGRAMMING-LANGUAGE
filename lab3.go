package main

import "fmt"

// Define Person structure
type Person struct {
    Name   string
    Age    int
    Job    string
    Salary float64
}

// Method to read person details
func (p *Person) ReadData() {
    fmt.Print("Enter Name: ")
    fmt.Scan(&p.Name)

    fmt.Print("Enter Age: ")
    fmt.Scan(&p.Age)

    fmt.Print("Enter Job: ")
    fmt.Scan(&p.Job)

    fmt.Print("Enter Salary: ")
    fmt.Scan(&p.Salary)
}

// Method to display person details
func (p Person) DisplayData() {
    fmt.Println("\n--- Person Details ---")
    fmt.Println("Name:", p.Name)
    fmt.Println("Age:", p.Age)
    fmt.Println("Job:", p.Job)
    fmt.Println("Salary:", p.Salary)
}

func main() {

    // Create two Person objects
    var p1, p2 Person

    // Read and display first person
    fmt.Println("Enter First Person Details:")
    p1.ReadData()
    p1.DisplayData()

    // Read and display second person
    fmt.Println("\nEnter Second Person Details:")
    p2.ReadData()
    p2.DisplayData()
}