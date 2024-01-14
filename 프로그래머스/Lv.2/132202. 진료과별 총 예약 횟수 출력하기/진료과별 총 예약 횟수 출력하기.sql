-- 2022년 5월에 예약한 환자 수를 진료과 코드 별로 조회하며, 결과는 환자 수를 기준으로 내림차순으로 정렬하고, 환자 수가 같다면 진료과 코드를 기준으로 오름차순으로 정렬
SELECT MCDP_CD AS "진료과코드", COUNT(*) AS "5월예약건수"
FROM APPOINTMENT
WHERE TO_CHAR(APNT_YMD, 'YYYY-MM') = '2022-05'
GROUP BY MCDP_CD
ORDER BY "5월예약건수", "진료과코드";