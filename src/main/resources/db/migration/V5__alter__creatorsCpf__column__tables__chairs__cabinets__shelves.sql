-- chairs
ALTER TABLE chairs
    RENAME COLUMN creators_id TO creators_cpf;

ALTER TABLE chairs
    ALTER COLUMN creators_cpf TYPE VARCHAR(11);

-- cabinets
ALTER TABLE cabinets
    RENAME COLUMN creators_id TO creators_cpf;

ALTER TABLE cabinets
    ALTER COLUMN creators_cpf TYPE VARCHAR(11);

-- shelves
ALTER TABLE shelves
    RENAME COLUMN creators_id TO creators_cpf;

ALTER TABLE shelves
    ALTER COLUMN creators_cpf TYPE VARCHAR(11);
