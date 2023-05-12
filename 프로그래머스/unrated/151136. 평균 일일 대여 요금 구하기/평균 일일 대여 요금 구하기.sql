SELECT round(avg(daily_fee) , 0)
FROM car_rental_company_car
GROUP BY car_type
HAVING car_type = 'SUV';