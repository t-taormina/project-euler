(ns project-euler.core)


;; Problem 1: Sum of all numbers evenly divisible by 3 or 5 in the range 0-1000

;; Sum of all numbers evenly divisible by 3 or 5 in the range 0-1000
(defn mult-3-5
  [x]
  (if (or (= 0 (mod x 3)) (= 0 (mod x 5)))
    x))

(def ans (reduce + (remove nil? (set (map mult-3-5 (range 1000))))))
(println ans)

;; Problem 2: