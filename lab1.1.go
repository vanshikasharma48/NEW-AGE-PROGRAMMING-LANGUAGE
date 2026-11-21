package main

import "fmt"

func main() {
    var a, b int
    var x, y float64
    var choice int

    // Integer input validation
    for {
        fmt.Print("Enter first integer (-1000 to 1000): ")
        n, err := fmt.Scan(&a)

        if n == 1 && err == nil && a >= -1000 && a <= 1000 {
            break
        }
        fmt.Println("Invalid input! Enter a valid integer.")
        fmt.Scanln()
    }

    for {
        fmt.Print("Enter second integer (-1000 to 1000): ")
        n, err := fmt.Scan(&b)

        if n == 1 && err == nil && b >= -1000 && b <= 1000 {
            break
        }
        fmt.Println("Invalid input! Enter a valid integer.")
        fmt.Scanln()
    }

    
    fmt.Println("\nInteger Operations:")
    fmt.Println("Addition:", a+b)
    fmt.Println("Subtraction:", a-b)
    fmt.Println("Multiplication:", a*b)

  
    for {
        fmt.Print("\nEnter first float (0 to 1000): ")
        n, err := fmt.Scan(&x)

        if n == 1 && err == nil && x >= 0 && x <= 1000 {
            break
        }
        fmt.Println("Invalid input! Enter a valid number.")
        fmt.Scanln()
    }

    for {
        fmt.Print("Enter second float (0 to 1000): ")
        n, err := fmt.Scan(&y)

        if n == 1 && err == nil && y >= 0 && y <= 1000 {
            break
        }
        fmt.Println("Invalid input! Enter a valid number.")
        fmt.Scanln()
    }

    // Floating-point operations
    fmt.Println("\nFloating-Point Operations:")
    fmt.Println("Addition:", x+y)
    fmt.Println("Subtraction:", x-y)
    fmt.Println("Multiplication:", x*y)

    // Menu using if statements
    fmt.Print("\nEnter 1 to display integer results or 2 for float results: ")
    fmt.Scan(&choice)

    if choice == 1 {
        fmt.Println("Integer results:", a+b, a-b, a*b)
    } else if choice == 2 {
        fmt.Println("Float results:", x+y, x-y, x*y)
    } else {
        fmt.Println("Invalid choice!")
    }
}