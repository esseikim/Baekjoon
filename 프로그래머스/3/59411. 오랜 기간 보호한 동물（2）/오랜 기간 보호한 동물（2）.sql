WITH DIFFER_DATE AS (
    SELECT 
        I.ANIMAL_ID, 
        I.NAME, 
        O.DATETIME - I.DATETIME AS DIFFER
    FROM 
        ANIMAL_INS I
    INNER JOIN 
        ANIMAL_OUTS O
    ON 
        I.ANIMAL_ID = O.ANIMAL_ID
    ORDER BY 
        O.DATETIME - I.DATETIME DESC
)

SELECT 
    ANIMAL_ID, 
    NAME
FROM 
    DIFFER_DATE
FETCH NEXT 2 ROWS ONLY;
