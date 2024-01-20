-- -- 정렬해야 세개를 가져올 수 있음.. 여기에서를 서브쿼리로 넣으면 됨.. i에 있는 애를 가져오겠다는 거라서 별칭을 사용만 한것.. 가져오면 name, datetime만 뜸! 
-- SELECT name, datetime
--   FROM (SELECT i.name, i.datetime
--           FROM animal_ins i
--           LEFT JOIN animal_outs o
--             ON i.animal_id = o.animal_id
--          WHERE o.animal_id IS NULL
--          ORDER BY i.datetime ASC) 
--  FETCH FIRST 3 ROWS ONLY;





-- SELECT *
-- FROM ANIMAL_OUTS O
-- RIGHT JOIN ANIMAL_INS I
-- ON O.ANIMAL_ID = I.ANIMAL_ID
-- WHERE O.ANIMAL_ID IS NULL
-- ORDER BY I.DATETIME
-- FETCH FIRST 3 ROWS ONLY; 

SELECT I.NAME, I.DATETIME
FROM ANIMAL_OUTS O
RIGHT JOIN ANIMAL_INS I
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
FETCH FIRST 3 ROWS ONLY; 










