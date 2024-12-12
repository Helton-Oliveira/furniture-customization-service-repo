CREATE TABLE tables (
    table_id UUID PRIMARY KEY,
    creators_cpf VARCHAR(11) NOT NULL,
    material_id UUID NOT NULL,
    frame_material VARCHAR(100) NOT NULL,
    format VARCHAR(50) NOT NULL,
    width NUMERIC(10, 2) NOT NULL,
    height NUMERIC(10, 2) NOT NULL,
    depth NUMERIC(10, 2) NOT NULL,
    number_of_feet VARCHAR(50) NOT NULL,
    montage VARCHAR(255),
    purpose VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);