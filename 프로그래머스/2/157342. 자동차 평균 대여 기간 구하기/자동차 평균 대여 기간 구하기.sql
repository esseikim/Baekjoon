SELECT
    CAR_ID,
    ROUND(AVG(NVL(END_DATE - START_DATE + 1, 0)), 1) AS AVERAGE_DURATION
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY
    CAR_ID
HAVING
    AVG(NVL(END_DATE - START_DATE + 1, 0)) >= 7
ORDER BY
    AVERAGE_DURATION DESC,
    CAR_ID DESC;