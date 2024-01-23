#lang racket
(define (findMax lis)
  (if (= (length lis) 1 ) (car lis) (if (> (car lis) (findMax (cdr lis))) (car lis) (findMax (cdr lis)))))

(define (findMaxC lis)
  (cond
    [(= (length lis) 1) (car lis)]
    [(> (car lis) (findMaxC (cdr lis))) (car lis)]
    [else (findMaxC (cdr lis))]))

(define (sumList lis)
  (if (empty? lis) 0 (+ (car lis) (sumList (cdr lis)))))

(define (mean lis)
  (/ (sumList lis) (length lis)))

(define (memberAt i lis)
  (if (= i 0)
    (car lis)
    (memberAt (- i 1) (cdr lis))
  )
)

(define (twoMidItem lis)
  (let
    [(sortedList (sort lis <))]
    (let
     [(leftMid (memberAt (- (/ (length sortedList) 2) 1) sortedList))
     (rightMid (memberAt (/ (length sortedList) 2) sortedList))]
    (/ (+ leftMid rightMid) 2))
  )
)

(define (midItem lis)
  (let
    [(sortedList (sort lis <))]
    (memberAt (floor(/ (length sortedList) 2)) sortedList)
  )
)

(define (median lis)
    (if (even? (length lis))
      (twoMidItem lis)
      (midItem lis))
)

; base case empty list return zero
(define (countOccurrences atm lis)
 (cond
    [(empty? lis) 0]
    [(equal? atm (car lis)) (+ 1 (countOccurrences atm (cdr lis)))]
    [else (countOccurrences atm (cdr lis))]
 )
)

(define (countAll lis1 lis2)
  (if (= (length lis1) 1) 
    (list (cons (car lis1)(countOccurrences (car lis1) lis2)))
    (append (list (cons (car lis1)(countOccurrences (car lis1) lis2))) (countAll (cdr lis1) lis2)) )
)

(define (pairorder a b)
  (> (cdr a) (cdr b))
)

(define (mode lis)
  (let
    [
      (theCounts (countAll (remove-duplicates lis) lis))
    ]
  (car (car (sort theCounts pairorder)))
  )
)





