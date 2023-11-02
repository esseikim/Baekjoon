SELECT HISTORY_ID, (DAILY_FEE * DAY) * (100 - NVL(DISCOUNT_RATE, 0)) / 100 AS FEE
FROM (
    SELECT HISTORY_ID, C.CAR_ID, CAR_TYPE, DAILY_FEE, END_DATE - START_DATE + 1 AS DAY,
    CASE
        WHEN END_DATE - START_DATE + 1 >= 7 AND END_DATE - START_DATE + 1 < 30 THEN '7일 이상'
        WHEN END_DATE - START_DATE + 1 >= 30 AND END_DATE - START_DATE + 1 < 90 THEN '30일 이상'
        WHEN END_DATE - START_DATE + 1 >= 90 THEN '90일 이상'
    END AS DURATION_TYPE
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
    INNER JOIN CAR_RENTAL_COMPANY_CAR C
    ON H.CAR_ID = C.CAR_ID
    WHERE CAR_TYPE = '트럭'
    ORDER BY HISTORY_ID
) B
LEFT OUTER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
ON B.CAR_TYPE = P.CAR_TYPE AND B.DURATION_TYPE = P.DURATION_TYPE
ORDER BY 2 DESC, 1 DESC;