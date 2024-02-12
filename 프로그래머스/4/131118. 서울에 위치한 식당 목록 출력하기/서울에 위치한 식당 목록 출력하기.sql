-- SELECT
--     I.REST_ID,
--     I.REST_NAME,
--     I.FOOD_TYPE,
--     I.FAVORITES,
--     I.ADDRESS,
--     ROUND(AVG(R.REVIEW_SCORE),2) AS "SCORE"
-- FROM REST_INFO I
-- INNER JOIN REST_REVIEW R 
-- ON I.REST_ID = R.REST_ID
-- GROUP BY I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS
-- HAVING I.ADDRESS LIKE '서울%'
-- ORDER BY SCORE DESC, I.FAVORITES DESC;

-- SELECT *
-- FROM REST_INFO I
-- JOIN REST_REVIEW R
-- ON I.REST_ID = R.REST_ID
-- WHERE I.ADDRESS LIKE '서울%'


SELECT A.REST_ID, B.REST_NAME, B.FOOD_TYPE, B.FAVORITES, B.ADDRESS, A.SCORE
FROM (
     SELECT I.REST_ID, ROUND(AVG(R.REVIEW_SCORE), 2) AS "SCORE"
     FROM REST_INFO I
     JOIN REST_REVIEW R
     ON I.REST_ID = R.REST_ID
     WHERE I.ADDRESS LIKE '서울%'
     GROUP BY I.REST_ID
    ) A
JOIN REST_INFO B
ON A.REST_ID = B.REST_ID
ORDER BY A.SCORE DESC, B.FAVORITES DESC;