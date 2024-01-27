SELECT EXTRACT(MONTH FROM START_DATE) AS "MONTH", A.CAR_ID, COUNT(*) AS "RECORDS"
FROM (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN TO_DATE(202208, 'YYYY-MM') AND TO_DATE(20221031, 'YYYY-MM-DD')
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
    ) A
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
ON A.CAR_ID = B.CAR_ID
WHERE START_DATE BETWEEN TO_DATE(202208, 'YYYY-MM') AND TO_DATE(20221031, 'YYYY-MM-DD')
GROUP BY EXTRACT(MONTH FROM START_DATE), A.CAR_ID
ORDER BY MONTH, A.CAR_ID DESC;