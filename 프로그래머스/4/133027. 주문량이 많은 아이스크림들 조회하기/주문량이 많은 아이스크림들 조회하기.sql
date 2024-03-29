-- SELECT FLAVOR
-- FROM
--     (
--         SELECT *
--         FROM JULY
--         UNION
--         SELECT *
--         FROM FIRST_HALF
--     ) A
-- GROUP BY FLAVOR
-- ORDER BY SUM(TOTAL_ORDER) DESC
-- FETCH FIRST 3 ROWS ONLY;


SELECT FLAVOR
FROM
    (
    SELECT *
    FROM JULY
    UNION
    SELECT *
    FROM FIRST_HALF
    ) A
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
FETCH FIRST 3 ROWS ONLY;