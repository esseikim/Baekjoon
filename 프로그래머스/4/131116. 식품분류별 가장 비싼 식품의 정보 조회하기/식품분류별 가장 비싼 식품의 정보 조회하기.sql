-- SELECT A.CATEGORY, A.PRICE AS "MAX_PRICE", B.PRODUCT_NAME
-- FROM(
--     SELECT *
--     FROM FOOD_PRODUCT
--     WHERE 1 = 1
--     AND CATEGORY IN ('과자', '국', '김치', '식용유')
--     AND PRICE IN (SELECT MAX(PRICE) 
--                   FROM FOOD_PRODUCT 
--                   GROUP BY CATEGORY)
--     ) A
-- JOIN FOOD_PRODUCT B
-- ON A.PRODUCT_ID = B.PRODUCT_ID
-- ORDER BY MAX_PRICE DESC;

SELECT
    A.CATEGORY,
    A.PRICE AS "MAX_PRICE",
    A.PRODUCT_NAME
FROM
    FOOD_PRODUCT A
JOIN
    (SELECT
        CATEGORY,
        MAX(PRICE) AS "PRICE"
    FROM
        FOOD_PRODUCT
    WHERE
        CATEGORY IN ('과자', '식용유', '국', '김치')
    GROUP BY
        CATEGORY
    ) B
ON
    A.CATEGORY = B.CATEGORY
    AND A.PRICE = B.PRICE
ORDER BY
    MAX_PRICE DESC;