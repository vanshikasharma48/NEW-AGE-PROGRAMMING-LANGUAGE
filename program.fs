
// Base class
type Shape() =
    abstract member Area: unit -> float

// Derived class 1
type Circle(radius: float) =
    inherit Shape()

    override this.Area() =
        3.14 * radius * radius

// Derived class 2
type Rectangle(length: float, width: float) =
    inherit Shape()

    override this.Area() =
        length * width

// Main program
[<EntryPoint>]
let main argv =

    // Creating objects
    let circle = Circle(5.0)
    let rectangle = Rectangle(4.0, 6.0)

    // Calling methods
    printfn "Area of Circle = %f" (circle.Area())
    printfn "Area of Rectangle = %f" (rectangle.Area())

    // Polymorphism
    let shapes: Shape list = [circle; rectangle]

    printfn "\nPolymorphism:"
    for shape in shapes do
        printfn "Area = %f" (shape.Area())

    0
