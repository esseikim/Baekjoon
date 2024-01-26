-- SELECT DISTINCT(CAR_ID),
--     CASE
--         WHEN CAR_ID IN 
--             (SELECT CAR_ID
--              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
--              WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') <= '2022-10-16' 
--                AND TO_CHAR(END_DATE, 'YYYY-MM-DD') >= '2022-10-16')
--         THEN '대여중'
--         ELSE '대여 가능'
--     END AS AVAILABILITY
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- order by CAR_ID DESC;




-- SELECT CAR_ID,
-- CASE WHEN END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') 
--      THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- ORDER BY CAR_ID DESC;

-- SELECT CAR_ID, START_DATE, END_DATE,
-- CASE WHEN END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') 
--      THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- ORDER BY CAR_ID;

-- SELECT DISTINCT(CAR_ID), START_DATE, END_DATE,
-- CASE WHEN START_DATE > TO_DATE(20221016, 'YYYY-MM-DD') OR
--           END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') 
--      THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- ORDER BY CAR_ID;

-- SELECT DISTINCT(CAR_ID), HISTORY_ID, START_DATE, END_DATE,
-- CASE WHEN START_DATE > TO_DATE(20221016, 'YYYY-MM-DD') OR
--           END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') 
--      THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- ORDER BY CAR_ID;

-- SELECT DISTINCT(CAR_ID), 
-- CASE WHEN COUNT(AVAILABILITY) > 1 THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM(
--     SELECT DISTINCT(CAR_ID),
--     CASE WHEN START_DATE > TO_DATE(20221016, 'YYYY-MM-DD') OR
--               END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') 
--          THEN '대여 가능'
--     ELSE '대여중'
--     END AS "AVAILABILITY"
--     FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
--     ORDER BY CAR_ID
--     )
-- GROUP BY CAR_ID, AVAILABILITY
-- ORDER BY CAR_ID DESC;


-- SELECT DISTINCT(CAR_ID),
-- CASE WHEN START_DATE > TO_DATE(20221016, 'YYYY-MM-DD') OR END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') THEN '대여 가능'
-- ELSE '대여중'
-- END AS "AVAILABILITY"
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- ORDER BY CAR_ID;


  
--  SELECT *
--  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
--  ORDER BY CAR_ID;
 
 
 
-- SELECT CAR_ID, 
-- CASE WHEN COUNT(*) > 1 THEN '대여 가능'
-- ELSE '대여중' 
-- END AS "AVAILABILITY"
-- FROM (
--     SELECT CAR_ID,
--     CASE WHEN START_DATE > TO_DATE(20221016, 'YYYY-MM-DD') OR END_DATE < TO_DATE(20221016, 'YYYY-MM-DD') THEN '대여 가능'
--     ELSE '대여중'
--     END AS "AVAILABILITY"
--     FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
--     )
-- GROUP BY CAR_ID, AVAILABILITY
-- ORDER BY CAR_ID DESC;


-- SELECT CAR_ID, 
--        CASE WHEN START_DATE <= TO_DATE(20221016, 'YYYY-MM-DD') AND
--                 END_DATE >= TO_DATE(20221016, 'YYYY-MM-DD') THEN '대여중'
--             ELSE '대여 가능'
--        END AS "AVAILABILITY"
-- ) FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY;


-- SELECT DISTINCT(CAR_ID),
--     CASE WHEN CAR_ID IN 
--             (SELECT CAR_ID
--              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
--              WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') <= '2022-10-16' 
--                AND TO_CHAR(END_DATE, 'YYYY-MM-DD') >= '2022-10-16')
--         THEN '대여중'
--         ELSE '대여 가능'
--     END AS AVAILABILITY
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- order by CAR_ID DESC;

SELECT CAR_ID, 
       MAX(CASE 
           WHEN START_DATE <= TO_DATE('2022-10-16', 'YYYY-MM-DD') AND
                NVL(END_DATE, TO_DATE('9999-12-31', 'YYYY-MM-DD')) >= TO_DATE('2022-10-16', 'YYYY-MM-DD') 
           THEN '대여중'
           ELSE '대여 가능'
       END) AS "AVAILABILITY"
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;

