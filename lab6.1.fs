
let isPrime n =
    let rec check divisor =
        if divisor * divisor > n then
            true
        elif n % divisor = 0 then
            false
        else
            check (divisor + 1)

    if n < 2 then
        false
    else
        check 2

printf "Enter an integer: "
let n = int (System.Console.ReadLine())

if isPrime n then
    printfn "%d is a prime number" n
else
    printfn "%d is not a prime number" n
