SELECT count(*) , (select avg(length) from film ) FROM film
where length > (select avg(length) from film)


SELECT COUNT(rental_rate) FROM film
where rental_rate= (select max(rental_rate) from film)


SELECT * FROM film
where rental_rate= (select min(rental_rate) from film) and replacement_cost=(
select min(replacement_cost) from film)


SELECT  customer_id, count(customer_id) FROM payment
group by customer_id
order by count(customer_id) DESC
