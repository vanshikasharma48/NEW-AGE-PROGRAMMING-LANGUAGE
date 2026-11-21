(ns exp18)

;; Collection 1
(def nums [1 2 3 4 5 6])

(println "----- COLLECTION 1 -----")
(println "Original:" nums)

;; (1) map - square each element
(println "Squares:" (map #(* % %) nums))

;; (2) filter - retain even numbers
(println "Even numbers:" (filter even? nums))

;; (3) reduce - calculate sum
(println "Sum:" (reduce + nums))

;; (4) take and drop
(println "Take first 3:" (take 3 nums))
(println "Drop first 3:" (drop 3 nums))

;; Threading macro ->>
(println "Chained result:"
         (->> nums
              (filter even?)
              (map #(* % %))
              (take 2)))


;; Collection 2
(def nums2 [10 15 20 25 30])

(println "\n----- COLLECTION 2 -----")
(println "Original:" nums2)

(println "Squares:" (map #(* % %) nums2))
(println "Even numbers:" (filter even? nums2))
(println "Sum:" (reduce + nums2))
(println "Take first 2:" (take 2 nums2))
(println "Drop first 2:" (drop 2 nums2))

;; Threading macro ->>
(println "Chained result:"
         (->> nums2
              (filter even?)
              (map #(* % %))
              (take 3)))