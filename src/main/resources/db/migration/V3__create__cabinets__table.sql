CREATE TABLE cabinets (
    cabinet_id UUID PRIMARY KEY,
    creators_id UUID NOT NULL,
    material_id UUID NOT NULL,
    number_of_doors INTEGER CHECK (number_of_doors >= 0),
    door_type VARCHAR(50),
    number_of_drawers INTEGER CHECK (number_of_drawers >= 0),
    closing_system VARCHAR(255),
    internal_dividers VARCHAR(255),
    finish VARCHAR(50),
    type_of_handles VARCHAR(50),
    internal_and_external_color VARCHAR(50),
    width NUMERIC(10, 2) NOT NULL,
    height NUMERIC(10, 2) NOT NULL,
    depth NUMERIC(10, 2) NOT NULL,
    montage VARCHAR(255),
    purpose VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);