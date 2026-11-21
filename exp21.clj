(ns exp21)

;; Function to throw custom exception
(defn custom-error []
  (throw (ex-info "Custom error occurred!"
                  {:type :custom-error
                   :code 101})))

;; Arithmetic Exception
(println "----- ARITHMETIC EXCEPTION -----")
(try
  (println (/ 10 0))
  (catch ArithmeticException e
    (println "Caught ArithmeticException:" (.getMessage e)))
  (finally
    (println "Finally block executed")))

;; Null Pointer Exception
(println "\n----- NULL POINTER EXCEPTION -----")
(try
  (.length nil)
  (catch NullPointerException e
    (println "Caught NullPointerException:" (.getMessage e)))
  (finally
    (println "Finally block executed")))

;; Custom Exception
(println "\n----- CUSTOM EXCEPTION -----")
(try
  (custom-error)
  (catch clojure.lang.ExceptionInfo e
    (println "Caught custom exception:" (ex-message e))
    (println "Exception data:" (ex-data e))
    (println "Error code:" (:code (ex-data e))))
  (finally
    (println "Finally block executed")))