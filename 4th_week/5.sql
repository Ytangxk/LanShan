select a.id, a.number,  (select count(distinct b.number) from passing_number b where b.number>=a.number ) as t_rank
 from passing_number a order by a.number desc, a.id;
