-- SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, PRODUCT_ID, NVL(USER_ID, NULL) AS "USER_ID", SALES_AMOUNT 
-- FROM (
--      SELECT SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
--      FROM ONLINE_SALE
--      WHERE TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-03'
--      UNION
--      SELECT SALES_DATE, PRODUCT_ID, NULL AS "USER_ID", SALES_AMOUNT
--      FROM OFFLINE_SALE 
--      WHERE TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-03'
--      );




-- SELECT TO_CHAR(N.SALES_DATE, 'YYYY-MM-DD') AS "SALES_DATE", 
--        N.PRODUCT_ID, 
--        NVL(N.USER_ID, NULL) AS "USER_ID", 
--        SUM(N.SALES_AMOUNT + F.SALES_AMOUNT) AS "SALES_AMOUNT"
-- FROM ONLINE_SALE N
-- FULL JOIN OFFLINE_SALE F
-- ON N.PRODUCT_ID = F.PRODUCT_ID
-- WHERE TO_CHAR(N.SALES_DATE, 'YYYY-MM') = '2022-03' OR TO_CHAR(F.SALES_DATE, 'YYYY-MM') = '2022-03'
-- GROUP BY N.SALES_DATE, N.PRODUCT_ID, N.USER_ID
-- ORDER BY SALES_DATE, N.PRODUCT_ID, USER_ID;


SELECT
    TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE,
    A.PRODUCT_ID,
    A.USER_ID,
    A.SALES_AMOUNT
FROM (
    SELECT
        USER_ID,
        PRODUCT_ID,
        SALES_AMOUNT,
        SALES_DATE
    FROM
        ONLINE_SALE
    WHERE
        TO_CHAR(SALES_DATE, 'MM') = '03'

    UNION

    SELECT
        NULL AS USER_ID,
        PRODUCT_ID,
        SALES_AMOUNT,
        SALES_DATE
    FROM
        OFFLINE_SALE
    WHERE
        TO_CHAR(SALES_DATE, 'MM') = '03'
) A
ORDER BY
    SALES_DATE, A.PRODUCT_ID, A.USER_ID;