/*Запрос 1*/

select f.title 'Фильм1', s.start_ 'Время начала', f.duration 'Длительность', 
f2.title 'Фильм2', s2.start_ 'Время начала', f2.duration 'Длительность'from sessions s
join films f on f.id = s.id_film
join sessions s2 on s2.start_ > s.start_ and s2.start_< date_add(s.start_, interval f.duration HOUR_SECOND)
join films f2 on f2.id=s2.id_film
order by s.start_ asc;

/*Запрос 2 */
select f.title 'Фильм', s1.start_ 'Время начала сеанса', f.duration 'Длительность сеанса',
s2.start_ 'Время начала следующего сеанса', 
timediff(min(s2.start_), date_add(s1.start_, interval f.duration HOUR_SECOND)) time_out
from sessions s1 
join films f on s1.id_film=f.id
join sessions s2 on s1.id_film=s2.id_film and s1.start_<s2.start_
group by s1.start_
having time_to_sec(time_out)>60*30
order by time_out desc;

/*Запрос 3*/
 (select f.title 'Фильм', count(*) 'Посетило зрителей за все время',
 count(*)/count(distinct t.id_session) 'Посетило зрителей в среднем за сеанс',
 sum(s.price) total_price from films f
 join sessions s on f.id=s.id_film
 join tickets t on s.id=t.id_session
 group by s.id_film
 order by total_price desc)
 union
 select 'ИТОГО', count(*), count(*)/count(distinct t.id_session), sum(s.price) 
 from sessions s
 join tickets t on s.id=t.id_session;
 
 /*Запрос 4*/
 select hour(s.start_), sum(price) 'Всего сборов', count(*) 'Всего посетило'
 from sessions s
 join tickets t on s.id=t.id_session
 group by 
 (hour(s.start_)>=9 and hour(s.start_)<15),
 (hour(s.start_)>=15 and hour(s.start_)<18),
 (hour(s.start_)>=18 and hour(s.start_)<21),
 (hour(s.start_)>=21 and hour(s.start_)<00);

