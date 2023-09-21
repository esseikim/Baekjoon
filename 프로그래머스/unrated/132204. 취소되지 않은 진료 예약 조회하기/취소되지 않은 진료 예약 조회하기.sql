SELECT
    APNT_NO,
    PT_NAME,
    A.PT_NO,
    A.MCDP_CD,
    DR_NAME,
    APNT_YMD
FROM
    PATIENT P
JOIN
    APPOINTMENT A
ON
    A.PT_NO = P.PT_NO
JOIN
    DOCTOR D
ON
    A.MDDR_ID = D.DR_ID
WHERE
    TO_CHAR(APNT_YMD, 'YYMMDD') = '220413'
    AND APNT_CNCL_YN = 'N'
    AND A.MCDP_CD = 'CS'
ORDER BY
    APNT_YMD ASC;
