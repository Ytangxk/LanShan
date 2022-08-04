select f.film_id,f.title

from film f

left join  film_category fc

on f.film_id=fc.film_id

where fc.last_update is null;

