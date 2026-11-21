(ns exp17)

;; (1) LIST
(println "----- LIST -----")
(def my-list '(10 20 30))

(println "Original list:" my-list)
(println "First element:" (first my-list))
(println "Rest of list:" (rest my-list))
(println "New list using conj:" (conj my-list 5))
(println "Original list after conj:" my-list)


;; (2) VECTOR
(println "\n----- VECTOR -----")
(def my-vector [10 20 30])

(println "Original vector:" my-vector)
(println "New vector using conj:" (conj my-vector 40))
(println "Element at index 1:" (get my-vector 1))
(println "Count:" (count my-vector))
(println "Original vector after conj:" my-vector)


;; (3) MAP
(println "\n----- MAP -----")
(def my-map {:name "Aman" :age 21})

(println "Original map:" my-map)
(println "New map using assoc:" (assoc my-map :city "Delhi"))
(println "New map using dissoc:" (dissoc my-map :age))
(println "Get name:" (get my-map :name))
(println "Original map unchanged:" my-map)


;; (4) SET
(println "\n----- SET -----")
(def my-set #{10 20 30})

(println "Original set:" my-set)
(println "New set using conj:" (conj my-set 40))
(println "New set using disj:" (disj my-set 20))
(println "Contains 10:" (contains? my-set 10))
(println "Original set unchanged:" my-set)