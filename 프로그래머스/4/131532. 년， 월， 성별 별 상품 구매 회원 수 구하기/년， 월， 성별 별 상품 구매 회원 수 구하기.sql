-- SELECT 
--     EXTRACT(YEAR FROM O.SALES_DATE) AS "YEAR",
--     EXTRACT(MONTH FROM O.SALES_DATE) AS "MONTH",
--     U.GENDER,
--     COUNT(DISTINCT O.USER_ID) AS "USERS"
-- FROM 
--     USER_INFO U
-- INNER JOIN 
--     ONLINE_SALE O
-- ON 
--     U.USER_ID = O.USER_ID
-- WHERE 
--     U.GENDER IS NOT NULL
-- GROUP BY 
--     EXTRACT(YEAR FROM O.SALES_DATE),
--     EXTRACT(MONTH FROM O.SALES_DATE),
--     U.GENDER
-- ORDER BY 
--     "YEAR", "MONTH", U.GENDER;






-- SELECT *
-- FROM USER_INFO U
-- JOIN ONLINE_SALE O
-- ON U.USER_ID = O.USER_ID



SELECT EXTRACT(YEAR FROM O.SALES_DATE) AS "YEAR", EXTRACT(MONTH FROM O.SALES_DATE) "MONTH", U.GENDER, COUNT(DISTINCT U.USER_ID) AS "USERS"
FROM USER_INFO U
JOIN ONLINE_SALE O
ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY EXTRACT(YEAR FROM O.SALES_DATE), EXTRACT(MONTH FROM O.SALES_DATE), U.GENDER
ORDER BY YEAR, MONTH, U.GENDER;












