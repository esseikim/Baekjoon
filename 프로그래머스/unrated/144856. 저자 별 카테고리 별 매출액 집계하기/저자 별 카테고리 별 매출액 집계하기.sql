SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(B.PRICE*SALES) AS "TOTAL_SALES"
FROM BOOK B
INNER JOIN AUTHOR A
ON B.AUTHOR_ID = A.AUTHOR_ID
INNER JOIN BOOK_SALES S
ON B.BOOK_ID = S.BOOK_ID
WHERE TO_CHAR(S.SALES_DATE, 'YYYY-MM') = '2022-01'
GROUP BY B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
ORDER BY B.AUTHOR_ID ASC, B.CATEGORY DESC;