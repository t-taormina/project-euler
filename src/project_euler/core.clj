(ns project-euler.core)
;; Tyler Taormina

;; Problem 1: Sum of all numbers evenly divisible by 3 or 5 in the range 0-1000

(defn mult-3-5
  [x]
  (if (or (= 0 (mod x 3)) (= 0 (mod x 5)))
    x))

(def ans (reduce + (remove nil? (set (map mult-3-5 (range 1000))))))
(println ans)


;; Problem 2: Sum even fibonacci numbers whose values do not exceed 4 million

(defn fib-seq
  [limit]
  (loop [final-list [1 2]]
    (let [a (peek final-list)
          b (peek (pop final-list))
          sum (+ a b)]
      (if (> sum limit)
        final-list
        (recur (conj final-list sum))))))

(def ans (reduce + (filter even? (fib-seq 4000000))))
(println ans)


;; Problem 3: Largest prime factor of a number (Sieve of Eratosthenes)
(defn find-primes
  [limit]
  nil)