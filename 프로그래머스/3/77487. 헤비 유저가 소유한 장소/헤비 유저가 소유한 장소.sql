-- 각 레코드에 대해 서브쿼리를 통해 해당 HOST_ID에 대한 레코드 수를 계산하고, 그 수가 2 이상인 경우에만 반환하는 방식으로 중복된 HOST_ID를 찾는다.
-- 외부 쿼리에서 각 레코드마다 서브쿼리가 실행되므로, 데이터 양이 많아질수록 성능에 영향을 미칠 수 있다.
SELECT *
FROM PLACES A
WHERE (
		   SELECT COUNT(*) 
			 FROM PLACES B
       WHERE A.HOST_ID = B.HOST_ID
       ) >= 2
ORDER BY ID