-- SELECT B.WRITER_ID, U.NICKNAME, SUM(B.PRICE) AS "TOTAL_SALES"
-- FROM USED_GOODS_BOARD B
-- INNER JOIN USED_GOODS_USER U
-- ON B.WRITER_ID = U.USER_ID AND B.STATUS = 'DONE' 
-- GROUP BY B.WRITER_ID, U.NICKNAME
-- HAVING SUM(B.PRICE) >= 700000            
-- ORDER BY "TOTAL_SALES" ASC;





-- SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS "TOTAL_SALES"
-- FROM USED_GOODS_BOARD B
-- JOIN USED_GOODS_USER U
-- ON B.WRITER_ID = U.USER_ID
-- GROUP BY U.USER_ID, U.NICKNAME
-- HAVING B.STATUS = 'DONE' AND SUM(B.PRICE) >= 700000;

-- SELECT *
-- FROM USED_GOODS_BOARD B
-- JOIN USED_GOODS_USER U
-- ON B.WRITER_ID = U.USER_ID
-- WHERE B.STATUS ='DONE'
-- GROUP BY B.WRITER_ID, U.NICKNAME
-- HAVING ;

-- SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS "TOTAL_SALES"
-- FROM USED_GOODS_BOARD B
--      JOIN USED_GOODS_USER U
--      ON B.WRITER_ID = U.USER_ID
-- GROUP BY U.USER_ID, U.NICKNAME
-- HAVING B.STATUS = 'DONE' AND SUM(B.PRICE) >= 700000;


SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS "TOTAL_SALES"
FROM USED_GOODS_BOARD B
     JOIN USED_GOODS_USER U
     ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS = 'DONE'
GROUP BY U.USER_ID, U.NICKNAME
HAVING SUM(B.PRICE) >= 700000
ORDER BY "TOTAL_SALES";




