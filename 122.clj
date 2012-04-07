;; Note: I know I could just use (Integer/parseInt s 2) to solve this,
;; but I feel that would not be in the spirit of the exercise.

(def __
  (fn [s]
    (apply +
           (map #(* % (- (int %2) 48)) ; cast from /1 => 1
                (iterate (partial * 2) 1) ; powers of 2
                (reverse s))))
  )

(= 0     (__ "0"))
	
(= 7     (__ "111"))
	
(= 8     (__ "1000"))
	
(= 9     (__ "1001"))
	
(= 255   (__ "11111111"))
	
(= 1365  (__ "10101010101"))
	
(= 65535 (__ "1111111111111111"))