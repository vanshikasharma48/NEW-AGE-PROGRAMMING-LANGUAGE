(ns exp20)

;; (1) Calling Java static methods
(println "----- STATIC METHODS -----")
(println "Absolute value:" (Math/abs -25))
(println "Current time in milliseconds:" (System/currentTimeMillis))


;; (2) Creating Java objects
(println "\n----- JAVA OBJECTS -----")

;; Create ArrayList
(def arr (java.util.ArrayList.))
(.add arr "Apple")
(.add arr "Banana")
(.add arr "Mango")

(println "ArrayList:" arr)

;; Create HashMap
(def hm (java.util.HashMap.))
(.put hm "Name" "Aman")
(.put hm "Age" 21)

(println "HashMap:" hm)


;; (3) Invoking instance methods
(println "\n----- INSTANCE METHODS -----")
(println "ArrayList size:" (.size arr))
(println "First element:" (.get arr 0))
(println "HashMap value:" (.get hm "Name"))


;; (4) Converting Clojure and Java collections
(println "\n----- COLLECTION CONVERSION -----")

;; Java ArrayList to Clojure vector
(def clj-vector (vec arr))
(println "Clojure vector:" clj-vector)

;; Clojure vector to Java ArrayList
(def java-list (java.util.ArrayList. clj-vector))
(println "Converted Java ArrayList:" java-list)

;; Java HashMap to Clojure map
(def clj-map (into {} hm))
(println "Clojure map:" clj-map)

;; Clojure map to Java HashMap
(def java-map (java.util.HashMap. clj-map))
(println "Converted Java HashMap:" java-map)