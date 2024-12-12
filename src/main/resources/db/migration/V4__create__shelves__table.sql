CREATE TABLE shelves (
    shelf_id UUID PRIMARY KEY,
    creators_id UUID NOT NULL,
    material_id UUID NOT NULL,
    number_of_shelves INTEGER CHECK (number_of_shelves >= 0),
    height_between_shelves NUMERIC(10, 2),
    mounting_system VARCHAR(255),
    width NUMERIC(10, 2) NOT NULL,
    height NUMERIC(10, 2) NOT NULL,
    depth NUMERIC(10, 2) NOT NULL,
    external_finish VARCHAR(50),
    weight_supported_per_shelf NUMERIC(10, 2),
    style VARCHAR(255),
    purpose VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);