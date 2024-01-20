SELECT
    B.CATEGORY,
    SUM(S.SALES) AS "TOTAL_SALES"
FROM
    BOOK_SALES S, BOOK B
WHERE
    B.BOOK_ID = S.BOOK_ID
    AND SALES_DATE BETWEEN TO_DATE(20220101, 'YYYY-MM-DD') AND TO_DATE(20220131, 'YYYY-MM-DD')
GROUP BY
    B.CATEGORY
ORDER BY
    B.CATEGORY;