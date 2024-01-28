-- -- 가상의 테이블 만들고, 레프트 조인, 포맷형식(파일모드) 맞춰서 조건 잡고, count: 그룹지어서 세야함.. group by 
--  -- *: null값 세고, 컬럼이름인 경우 null값 제외 
-- SELECT d.hour, COUNT(o.animal_id) AS count
--   FROM (SELECT LEVEL - 1 AS hour
--           FROM dual
--        CONNECT BY LEVEL <= 24) d
--   LEFT JOIN animal_outs o
--     ON d.hour = TO_CHAR(datetime, 'FMHH24')
--  GROUP BY d.hour
--  ORDER BY d.hour;


-- SELECT D.HOUR, COUNT(D.HOUR)
-- FROM (
--      SELECT LEVEL -1 AS "HOUR"
--      FROM DUAL
--      CONNECT BY LEVEL < 25
--      ) D
--  LEFT JOIN ANIMAL_OUTS O
--  ON D.HOUR = TO_CHAR(O.DATETIME, 'FMHH24')
--  GROUP BY D.HOUR
--  ORDER BY D.HOUR;


SELECT D.HOUR, COUNT(O.ANIMAL_ID)
FROM (
     SELECT LEVEL -1 AS "HOUR"
     FROM DUAL
     CONNECT BY LEVEL < 25
     ) D
 LEFT JOIN ANIMAL_OUTS O
 ON D.HOUR = TO_CHAR(O.DATETIME, 'FMHH24')
 GROUP BY D.HOUR
 ORDER BY D.HOUR;











