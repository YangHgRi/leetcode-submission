SELECT firstName, lastName, city, state
FROM Person AS p
         LEFT JOIN Address AS a
                   ON p.PersonId = a.PersonId;
