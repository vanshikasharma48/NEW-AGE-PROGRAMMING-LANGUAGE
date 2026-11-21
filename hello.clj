(ns hello)

(defn greet [name]
  (str "Hello, " name "!"))

(println (greet "Vanshika"))

(def numbers [10 20 30 40 50])

(println "Numbers:" numbers)

(println "Sum:" (reduce + numbers))