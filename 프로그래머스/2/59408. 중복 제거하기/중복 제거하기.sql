-- ANIMAL_INS 테이블에서 NAME이 NULL이 아닌 경우를 선택하고, 중복되지 않는(unique한) 이름의 수를 카운트
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;
