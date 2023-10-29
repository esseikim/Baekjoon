SELECT 
    P.PRODUCT_ID, 
    P.PRODUCT_NAME, 
    SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM 
    FOOD_PRODUCT P, FOOD_ORDER O
WHERE 
    P.PRODUCT_ID = O.PRODUCT_ID
    AND TO_CHAR(O.PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY 
    P.PRODUCT_ID, 
    P.PRODUCT_NAME
ORDER BY 
    SUM(P.PRICE * O.AMOUNT) DESC, 
    P.PRODUCT_ID;
