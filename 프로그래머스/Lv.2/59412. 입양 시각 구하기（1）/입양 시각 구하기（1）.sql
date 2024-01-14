SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS "HOUR", COUNT(*) AS "COUNT"
FROM ANIMAL_OUTS
WHERE TO_CHAR(DATETIME, 'HH24') >= '09' AND TO_CHAR(DATETIME, 'HH24') < '20'
GROUP BY TO_CHAR(DATETIME, 'HH24')
ORDER BY HOUR;