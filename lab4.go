package main

import "fmt"

// Goroutine 1: Calculate squares
func squares(ch chan string) {
    fmt.Println("Square Goroutine Started")

    for i := 1; i <= 5; i++ {
        result := i * i
        ch <- fmt.Sprintf("Square of %d = %d", i, result)
    }

    fmt.Println("Square Goroutine Completed")
}

// Goroutine 2: Calculate cubes
func cubes(ch chan string) {
    fmt.Println("Cube Goroutine Started")

    for i := 1; i <= 5; i++ {
        result := i * i * i
        ch <- fmt.Sprintf("Cube of %d = %d", i, result)
    }

    fmt.Println("Cube Goroutine Completed")
}

// Goroutine 3: Calculate Fibonacci numbers
func fibonacci(ch chan string) {
    fmt.Println("Fibonacci Goroutine Started")

    a, b := 0, 1

    for i := 1; i <= 5; i++ {
        ch <- fmt.Sprintf("Fibonacci = %d", a)
        a, b = b, a+b
    }

    fmt.Println("Fibonacci Goroutine Completed")
}

func main() {
    // Create channel
    ch := make(chan string)

    // Launch three goroutines
    go squares(ch)
    go cubes(ch)
    go fibonacci(ch)

    // Collect and print 15 results
    for i := 0; i < 15; i++ {
        fmt.Println(<-ch)
    }

    fmt.Println("All Goroutines Completed!")
}